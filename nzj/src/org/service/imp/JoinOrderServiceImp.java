package org.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.dao.JoinOrderDao;
import org.dao.UserDao;
import org.model.JoinOrders;
import org.service.JoinOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.ChangeTime;
import org.tool.GetUserId;
import org.tool.JsonObject;
import org.view.VJoinUserdetail;

@Service
public class JoinOrderServiceImp implements JoinOrderService {
	@Autowired
	private JoinOrderDao joDao;
	
	@Autowired UserDao uDao;

	@Override
	public Object addJoinOrder(HttpSession session, JoinOrders jo, Long[] id) {
		//必须先登录
		long userid = GetUserId.getUserId(session);
		//订单所属的id号传入
		jo.setUserId(userid);
		jo.setStatus(0);
		jo.setTime(Long.parseLong(ChangeTime.timeStamp()));
		jo.setPerparer(uDao.getUserById(userid).getCompany());
		jo.setPhone(uDao.getUserById(userid).getPhone().toString());
		if (joDao.addJoninOrder(jo, id)) {
			return JsonObject.getResult(1, "添加成功", true);
		} else {
			return JsonObject.getResult(0, "添加失败", false);
		}
	}

	@Override
	public Object deleteJoinOrder(long id) {
		if (joDao.deleteJoinOrder(id)) {
			return JsonObject.getResult(1, "删除成功", true);
		} else {
			return JsonObject.getResult(0, "删除失败", false);
		}
	}

	@Override
	public Object updateJoinORder(JoinOrders jo) {
		if (joDao.updateJoinOrder(jo)) {
			return JsonObject.getResult(1, "修改成功", true);
		} else {
			return JsonObject.getResult(0, "修改失败", false);
		}
	}
	
	@Override
	public Object updateJoinOrderStatus(Integer status, long joinorderid) {
		if (status == 0 || status == 1 || status == -1 || status == -2) {
			if (joDao.updateJoinOrderStatus(status, joinorderid)) {
				return JsonObject.getResult(1, "修改成功", true);
			}
				return JsonObject.getResult(0, "修改失败", false);
		} else {
			return JsonObject.getResult(0, "状态码输入错误,0审核中（默认状态）：1通过：-1驳回：-2完成", false);		}
	}

	@Override
	public Object getJoinOrderListById (HttpSession session, Integer start, Integer limit) {
		Map<String, Object> map = new HashMap<String, Object>();
		long userid = GetUserId.getUserId(session);
		List<JoinOrders> li = joDao.getJoinOrderListById(start, limit, userid);
		long count = joDao.getContById(userid);
		map.put("JoinOrders", li);
		map.put("count", count);
		return JsonObject.getResult(1, "所有订单", map);
	}

	@Override
	public Object getJoinOrderDetailByJoinorderid(Integer start, Integer limit,
			long joinorderid) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<VJoinUserdetail> li = joDao.getJoinOrderDetailByJoinorderid(start, limit, joinorderid);
		long count = joDao.getJoinOrderDetailCount(joinorderid);
		map.put("JoinUserDetail", li);
		map.put("count", count);
		return JsonObject.getResult(1, "订单的详情", map);
	}

	@Override
	public Object getJoinOrderByStatus(HttpSession session, Integer start, Integer limit,
			Integer status) {
		long userId = GetUserId.getUserId(session);
		if (status == 0 || status == 1 || status == -1 || status == -2) {
			Map<String, Object> map = new HashMap<String, Object>();
			List<JoinOrders> li = joDao.getJoinOrderByStatus(start, limit, status, userId);
			long count = joDao.getCountByStatus(userId, status);
			map.put("JoinOrders", li);
			map.put("count", count);
			return JsonObject.getResult(1, status + "状态订单", map);
		} else {
			return JsonObject.getResult(0, "状态码输入错误,0审核中（默认状态）：1通过：-1驳回：-2完成", false);
		}
	}

	@Override
	public Object getAllJoinOrderByStatus(Integer start, Integer limit, Integer status) {
		if (status == 0 || status == 1 || status == -1 || status == -2) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("JoinOrderList", joDao.getAllJoinOrderByStatus(start, limit, status));
			map.put("count", joDao.getCountJoinOrderByStatus(status));
			return JsonObject.getResult(1, "订单列表", map);
		} else {
			return JsonObject.getResult(0, "状态码输入错误:0审核中（默认状态）：1通过 -1驳回： -2完成", false);
		}
	}

}
