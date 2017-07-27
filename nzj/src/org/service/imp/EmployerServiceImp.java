package org.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.Form.EmployerTrackingForm;
import org.dao.EmployerDao;
import org.model.Employer;
import org.model.EmployerTracking;
import org.model.User;
import org.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.ChangeTime;
import org.tool.GetUserId;
import org.tool.JsonObject;

@Service
public class EmployerServiceImp implements EmployerService {
	@Autowired
	private EmployerDao eDao;

	@Override
	public Object addEmployer(HttpSession session, Employer e, String eTime) {
//		User u = (User)session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId == null) {
			System.out.println("	addEmployer--未登录");
			return JsonObject.getResult(-999, "请先登录", false);
		}
		if (eDao.getEmployer(userId, e.getName(), e.getPhone()) != null) {
			return JsonObject.getResult(-2, "请勿重复录入", false);
		} else {
			//获取当前用户的userid
			e.setUserId(userId);
			//将时间戳转换为Integer类型存入数据库
			e.setTime(Long.parseLong(ChangeTime.date2TimeStamp(eTime, "yyyy-MM-dd")));
			e.setStatus(0);		//初始化客户的状态为新单状态
			if (eDao.addEmployer(e) != -1) {
				return JsonObject.getResult(1, "添加成功", true);
			} else {
				return JsonObject.getResult(0, "添加失败", false);
			}
		}
	}

	@Override
	public Object deleteEmployer(Long id) {
		if (eDao.deleteEmployer(id)) {
			return JsonObject.getResult(1, "删除成功", true);
		} else {
			return JsonObject.getResult(0, "删除失败", false);
		}
	}

	@Override
	public Object updateEmployer(Employer e, String eTime) {
		e.setTime(Long.parseLong(ChangeTime.date2TimeStamp(eTime, "yyyy-MM-dd")));
		if (eDao.updateEmployer(e)) {
			return JsonObject.getResult(1, "修改成功", true);
		} else {
			return JsonObject.getResult(0, "修改失败", false);
		}
	}

	@Override
	public Object getEmployerList(HttpSession session, Integer start, Integer limit) {
		Map<String, Object> map = new HashMap<>();
//		User u = (User)session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId == null) {
			System.out.println("	getEmployerList--未登录");
			return JsonObject.getResult(-999, "请先登录", "getEmployerList");
		}
		long count = eDao.getEmployerCountById(userId);
		List<Employer> li = eDao.getEmployerList(start, limit,userId);
		map.put("count", count);
		map.put("result", li);
		return JsonObject.getResult(1, "获取列表", map);
	}

	@Override
	public Object getEmployerListByStatus(HttpSession session, Integer start, Integer limit,
			Long userId, Integer status) {
		Map<String, Object> map = new HashMap<>();
//		User u = (User)session.getAttribute("user");
		Long userId1 = GetUserId.getUserId(session);
		if (userId1 == null) {
			System.out.println("	getEmployerListByStatus--未登录");
			return JsonObject.getResult(-999, "请先登录", "getEmployerListByStatus");
		}
		if (status == -2 || status == -1 || status == 0 || status == 1) {
			List<Employer> li = eDao.getEmpolyerListByStatus(start, limit, userId1, status);
			long count = eDao.getEmployerCountByIdStatus(userId1, status);
			map.put("count", count);
			map.put("result", li);
			return JsonObject.getResult(1, "获取列表", map);
		} else {
			map.put("状态码输入错误", "-2:黑名单 -1:放弃 0:新单 1:已签约");
			return JsonObject.getResult(0, "数据获取失败", map);
		}
	}

	@Override
	public Object addEmployerTracking(HttpSession session, EmployerTrackingForm et) {
//		User u = (User)session.getAttribute("user");
		Long userId = GetUserId.getUserId(session);
		if (userId == null) {
			System.out.println("	getEmployerListByStatus--未登录");
			return JsonObject.getResult(-999, "请先登录", "getEmployerListByStatus");
		}
		if (eDao.addEmployerTacking(et)) {
			return JsonObject.getResult(1, "添加成功", true);
		} else {
			return JsonObject.getResult(0, "添加失败", false);
		}
	}

	@Override
	public Object deleteEmployerTracking(Long id) {
		if (eDao.deleteEmployerTracking(id)) {
			return JsonObject.getResult(1, "删除成功", true);
		} else {
			return JsonObject.getResult(0, "删除失败", false);
		}
	}

	@Override
	public Object updateEmployerTracking(EmployerTracking et, String time) {
		et.setEtime(Long.parseLong(new ChangeTime().date2TimeStamp(time, "yyyy-MM-dd")));
		if (eDao.updateEmployerTacking(et)) {
			return JsonObject.getResult(1, "修改成功", true);
		} else {
			return JsonObject.getResult(0, "修改失败", false);
		}
	}

	@Override
	public Object getEmployerTrackingByemployerId(Integer start,
			Integer limit, Long employerId) {
		Map<String, Object> map = new HashMap<>();
		List<EmployerTracking> li = eDao.getEmployerTrackingByemployerId(start, limit, employerId);
		map.put("result", li);
		System.out.println(map);
		return JsonObject.getResult(1, "获取列表", map);
	}

	@Override
	public Object getEmployerListByIdStatus (Integer start, Integer limit, Long userId,	Integer status) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("employerList", eDao.getEmpolyerListByStatus(start, limit, userId, status));
		map.put("count", eDao.getEmployerCountByIdStatus(userId, status));
		return JsonObject.getResult(1, "雇主列表", map);
	}

	@Override
	public Object updateEmployerStatus(long employerId, Integer status) {
		if (eDao.updateEmployerStatus(employerId, status)) {
			return JsonObject.getResult(1, "状态修改成功", true);
		} else {
			return JsonObject.getResult(0, "状态修改失败", false);
		}
	}
}
