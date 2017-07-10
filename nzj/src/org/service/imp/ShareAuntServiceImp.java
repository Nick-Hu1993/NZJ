package org.service.imp;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.dao.ShareAuntDao;
import org.dao.UserDao;
import org.model.ShareAunt;
import org.model.User;
import org.service.ShareAuntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.ChangeTime;
import org.tool.GetUserId;
import org.tool.JsonObject;
import org.view.VUserId;

@Service
public class ShareAuntServiceImp implements ShareAuntService {
	@Autowired
	private ShareAuntDao saDao;
	@Autowired
	private UserDao uDao;

	@Override
	public Object addShareAunt(HttpSession session, ShareAunt sa) {
//		User u = (User) session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			sa.setUserId(userId);
			sa.setShare(1); // 添加的默认状态为已共享
			sa.setTime(new Date().getTime() / 1000);
			if (saDao.addShareAunt(sa) != -1)
				return JsonObject.getResult(1, "添加一条共享信息成功", true);
			else
				return JsonObject.getResult(0, "添加一条共享信息失败", false);
		} else {
			return JsonObject.getResult(-999, "请先登录，才能发布共享信息", false);
		}

	}

	@Override
	public Object deleteShareAunt(long id) {
		if (saDao.deleteShareAunt(id))
			return JsonObject.getResult(1, "删除共享信息成功", true);
		else
			return JsonObject.getResult(0, "删除共享信息失败", false);
	}

	@Override
	public Object updateShareAunt(ShareAunt sa) {
		sa.setTime(new Date().getTime() / 1000);
		if (saDao.updateShareAunt(sa))
			return JsonObject.getResult(1, "修改共享信息成功", true);
		else
			return JsonObject.getResult(0, "修改共享信息失败", false);
	}

	@Override
	public Object getShareAuntList(HttpSession session, Integer start,
			Integer limit) {

//		User u = (User) session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			List li = saDao.getShareAuntList(1, start, limit, userId);
			Long count = saDao.getShareAuntCount(userId, 1);
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", li);
			map.put("count",  count);
			
			return JsonObject.getResult(1, "获取共享阿姨列表", map);
		} else {
			return JsonObject.getResult(-999, "请先登录，才能获取共享列表", false);
		}
	}

	@Override
	public Object getUnShareAuntList(HttpSession session, Integer start,
			Integer limit) {
//		User u = (User) session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			List li = saDao.getShareAuntList(0, start, limit, userId);
			Long count = saDao.getShareAuntCount(userId, 0);
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", li);
			map.put("count",  count);
			
			return JsonObject.getResult(1, "获取未共享阿姨列表", map);
		} else {
			return JsonObject.getResult(-999, "请先登录，才能获取未共享列表", false);
		}
	}

	@Override
	public Object setShareAunt(long id) {
		if (saDao.setShareAunt(id, 1))
			return JsonObject.getResult(1, "共享成功", true);
		else
			return JsonObject.getResult(0, "共享失败", false);
	}

	@Override
	public Object setUnShareAunt(long id) {
		if (saDao.setShareAunt(id, 0))
			return JsonObject.getResult(1, "取消共享成功", true);
		else
			return JsonObject.getResult(0, "取消共享失败", false);
	}

	@Override
	public Object getAllShareAuntList(Integer start, Integer limit) {
		List li  =saDao.getAllShareAuntList(1, start, limit);
		Long count = saDao.getAllShareAuntCount(1);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", li);
		map.put("count",  count);
		
		return JsonObject.getResult(1, "获取全部共享的阿姨列表",map);
	}

	@Override
	public Object getSearchShareAuntList(String key, Integer start,
			Integer limit) {
		List li = saDao.getSearchShareAuntList(key, start, limit);
		Long count = saDao.getSearchShareAuntCount(key);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", li);
		map.put("count",  count);
		
		return JsonObject.getResult(1, "获取搜索后的共享阿姨列表", map);
	}

	@Override
	public Object getLocalShareAuntList(HttpSession session, Integer start,
			Integer limit) {
//		User user = (User) session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if(userId==null){		//说明时游客登录，则没有地址信息，则选用全部列表返回
			List li  =saDao.getAllShareAuntList(1, start, limit);
			Long count = saDao.getAllShareAuntCount(1);
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", li);
			map.put("count",  count);
			
			return JsonObject.getResult(1, "游客登录，获取全部共享的阿姨列表",map);
		}else{
			VUserId v = uDao.getUserById(userId);
			String ad = v.getAddress();
			ad=ad.split("-")[1];
			System.out.println("	地址："+ad);
			List li  =saDao.getLocalShareAuntList(1, ad, start, limit);
			Long count = saDao.getLocalShareAuntCount(1, ad);
			
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("result", li);
			map.put("count",  count);
			
			return JsonObject.getResult(1, "用户登录，获取本地的共享的阿姨列表",map);
		}
	}

	@Override
	public Object getShareAuntListByTime(String stime, String etime,
			Integer share, Integer start, Integer limit) throws ParseException {
		if (stime != null && etime != null && !ChangeTime.compare_date(stime, etime)) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("AuntList", saDao.getShareAuntListByTime(stime, etime, share, start, limit));
			map.put("count", saDao.getCountByTime(stime, etime, share));
			return JsonObject.getResult(1, "共享阿姨列表", map);
		} else {
			return JsonObject.getResult(0, "时间不可为空/时间数据非法", false);
		}
	}
}
