package org.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.dao.HelpDao;
import org.dao.UserDetailDao;
import org.model.Help;
import org.model.User;
import org.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.ChangeTime;
import org.tool.GetUserId;
import org.tool.JsonObject;

@Service
public class HelpServiceImp implements HelpService {
	@Autowired
	private HelpDao hDao;
	@Autowired
	private UserDetailDao udDao;

	@Override
	public Object addHelp(HttpSession session, Help h) {
//		User u = (User) session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId == null) {
			System.out.println("	addHelp--未登录");
			return JsonObject.getResult(-999, "请先登录", false);
		}
		// 获取当前用户的userid
		h.setUserId(userId);
		//设置当前用户的公司名称
		h.setCompany(udDao.getUserDetailById(userId).getCompany());
		// 将时间戳转换为Long类型存入数据库
		h.setTime(Long.parseLong(ChangeTime.timeStamp()));
		h.setStatus(0); // 初始化求助单为待处理
		//设置单号，不直接使用上面的time是因为setTime方法没有返回值
		h.setIdentifier("hp" + ChangeTime.timeStamp() + (int)((Math.random()*9+1)*1000));
		long id = hDao.addHelp(h);
		if ( id != -1) {
			//需要返回单号
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("identifier", hDao.getIdentifierByid(id));
			return JsonObject.getResult(1, "添加成功", map);
		} else {
			return JsonObject.getResult(0, "添加失败", false);
		}
	}

	@Override
	public Object deleteHelp(long id) {
		if (hDao.deleteHelp(id)) {
			return JsonObject.getResult(1, "删除成功", true);
		} else {
			return JsonObject.getResult(0, "删除失败", false);
		}
	}

	@Override
	public Object updateHelpStatus(long id, Integer status) {
		if (hDao.updateHelpStatus(id, status) == true) {
			return JsonObject.getResult(1, "修改成功", true);
		} else {
			return JsonObject.getResult(0, "修改失败", false);
		}
	}

	@Override
	public Object getHelpListByStatus(HttpSession session, Integer start, Integer limit,
			Integer status) {
//		User u = (User) session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId == null) {
			System.out.println("	getHelpListByStatus--未登录");
			return JsonObject.getResult(-999, "请先登录", false);
		}
		Map<String, Object> map = new HashMap<String, Object>();
		if (status == 0 || status == 1 || status == -1) {
			List<Help> li = hDao.getHelpListByStatus(start, limit, userId, status);
			long count = hDao.getCountByStatus(userId, status);
			map.put("result", li);
			map.put("count", count);
			return JsonObject.getResult(1, "获取数据", map);
		} else {
			return JsonObject.getResult(0, "状态码错误", false);
		}
	}
	
	@Override
	public Object getAllHelpListByStatus(Integer start, Integer limit,
			Integer status) {
		if (status == 0 || status == 1 || status == -1) {
			Map<String, Object> map = new HashMap<String, Object>();
			List<Help> li = hDao.getHelpListByStatus1(start, limit, status);
			long count = hDao.getAllCountByStatus(status);
			map.put("result", li);
			map.put("count", count);
			return JsonObject.getResult(1, "获取求助列表", map);
		} else {
			return JsonObject.getResult(0, "状态码错误", false);
		}
	}

	@Override
	public Object getHelpByIdentifier(String identifier) {
		if (hDao.getHelpByIdentifier(identifier) != null) {
			Map<String, Object> map = new HashMap<String, Object> ();
			Help h = hDao.getHelpByIdentifier(identifier);
			map.put("result", h);
			return JsonObject.getResult(1, "查询成功", map);
		} else {
			return JsonObject.getResult(0, "识别码错误", false);
		}
	}
}
