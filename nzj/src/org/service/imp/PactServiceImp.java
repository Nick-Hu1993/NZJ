package org.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.Form.PactTrackingForm;
import org.dao.EmployerDao;
import org.dao.PactDao;
import org.model.Employer;
import org.model.Pact;
import org.model.PactTracking;
import org.model.User;
import org.service.PactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.ChangeTime;
import org.tool.GetUserId;
import org.tool.JsonObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PactServiceImp implements PactService {
	@Autowired
	private PactDao pDao;
	
	@Autowired
	private EmployerDao eDao;

	@Override
	public Object addPact(HttpSession session, Pact e, String eTime) {
//		User u = (User) session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId == null) {
			System.out.println("	addPact--未登录");
			return JsonObject.getResult(-999, "请先登录，才能创建合同", false);
		}
		if (pDao.getPactByCode(e.getCode()) != null) {
			return JsonObject.getResult(0, "合同号已存在，请勿重复录入", false);
		} else {
			e.setStatus(0);
			e.setUserId(userId);
			e.setPtime(Long.parseLong(ChangeTime.date2TimeStamp(eTime,
					"yyyy-MM-dd")));
			if(pDao.addPact(e)!=-1 && eDao.updateEmployerStatus(e.getEmployerId(), 1)){
				return JsonObject.getResult(1, "添加合同成功", true);
			}else
				return JsonObject.getResult(-1, "添加合同失败", false);
		}
	}

	@Override
	public Object deletePact(Long id) {
		if(pDao.deletePact(id))
			return JsonObject.getResult(1, "删除合同成功", true);
		else
			return JsonObject.getResult(0, "删除合同失败", false);
	}

	@Override
	public Object updatePact(Pact e, String eTime) {
		e.setPtime(Long.parseLong(ChangeTime.date2TimeStamp(eTime, "yyyy-MM-dd")));
		if(pDao.updatePact(e))
			return JsonObject.getResult(1, "修改合同成功", true);
		else
			return JsonObject.getResult(0, "修改合同失败", false);
	}

	@Override
	public Object getPactList(HttpSession session, Integer start, Integer limit) {
		Map<String,Object> map = new HashMap<String, Object>();
//		User u = (User) sesion.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if(userId==null){
			System.out.println("	getPactList--未登录");
			return JsonObject.getResult(-999, "请先登录，才能获取合同列表", false);
		}
		long count = pDao.getPactCountById(userId);
		List li = pDao.getPactList(userId, start, limit);
		map.put("count", count);
		map.put("result", li);
		return JsonObject.getResult(1, "获取合同列表", map);
	}

	@Override
	public Object addPactTracking(Long pactId,PactTrackingForm pt) {
		if(pDao.addPactTracking(pactId,pt))
			return JsonObject.getResult(1, "添加合同服务跟踪情况成功", true);
		else
			return JsonObject.getResult(0, "添加合同服务跟踪情况失败", false);
	}

	@Override
	public Object deletePactTracking(Long id) {
		if(pDao.deletePactTracking(id))
			return JsonObject.getResult(1, "删除合同服务跟踪情况成功", true);
		else
			return JsonObject.getResult(0, "删除合同服务跟踪情况失败", false);
	}

	@Override
	public Object updatePactTracking(PactTracking pt,String ptTime) {
		pt.setTtime(Long.parseLong(ChangeTime.date2TimeStamp(ptTime, "yyyy-MM-dd")));
		if(pDao.updatePactTracking(pt))
			return JsonObject.getResult(1, "修改合同服务跟踪情况成功", true);
		else
			return JsonObject.getResult(0, "修改合同服务跟踪情况失败", false);
	}

	@Override
	public Object getPactTrackingList(Long packId) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("PactTrackingList", pDao.getPactTrackingList(packId));
		map.put("count", pDao.getCountByPactId(packId));
		return JsonObject.getResult(1, "获取合同跟踪情况列表", map);
	}

	@Override
	public Object getPactListByStatus (HttpSession session, Integer start, Integer limit,
			Long userId, Integer status) {
		Map<String, Object> map = new HashMap<>();
//		User u = (User)session.getAttribute("user");
		Long userId1 = GetUserId.getUserId(session);
		if (userId1 == null) {
			System.out.println("	getPactListByStatus--未登录");
			return JsonObject.getResult(-999, "请先登录", "getPactListByStatus");
		}
		if (status == -2 || status == -1 || status == 0) {
			List<Pact> li = pDao.getPactListByStatus(start, limit, userId1, status);
			long count = pDao.getPactCountByStatus(userId1, status);
			map.put("count", count);
			map.put("result", li);
			return JsonObject.getResult(1, "获取列表", map);
		} else {
			map.put("状态码输入错误", "0:正常 -1:暂停 -2:退单");
			return JsonObject.getResult(0, "数据获取失败", map);
		}
	}

	@Override
	public Object getPactListByEmployerId(Integer start, Integer limit,
			Long employerId) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("PactList", pDao.getPactListByEmployerId(start, limit, employerId));
			map.put("count", pDao.getCountByEmployerId(employerId));
			return JsonObject.getResult(1, "合同列表", map);
	}

	@Override
	public Object getPactById(long id) {
		if (pDao.getPactById(id) != null) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("Pact", pDao.getPactById(id));
			return JsonObject.getResult(1, "合同详情", map);
		} else {
			return JsonObject.getResult(0, "合同详情获取失败", false);
		}
	}
}
