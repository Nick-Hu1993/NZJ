package org.service.imp;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.dao.OrderDao;
import org.model.Orders;
import org.model.User;
import org.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.GetUserId;
import org.tool.JsonObject;

@Service
public class OrderServiceImp implements OrderService{
	@Autowired
	private OrderDao oDao;
	
	@Override
	public Object addOrder(HttpSession session,Orders o, long[] id) {
		User u = (User)session.getAttribute("user");
		if(u!=null){
			o.setTime(new Date().getTime()/1000);
			o.setUserId(u.getId());
			if(oDao.addOrder(o, id))
				return JsonObject.getResult(1, "添加订单成功", true);
			else
				return JsonObject.getResult(-1, "添加订单失败", false);
		}else{
			return JsonObject.getResult(0, "请先登录，才能添加订单", false);
		}
	}

	@Override
	public Object deleteOrder(long[] id) {
		if (oDao.deletOrder(id)) {
			return JsonObject.getResult(1, "订单删除成功", true);
		} else {
			return JsonObject.getResult(0, "订单删除失败", false);
		}
	}

	@Override
	public Object updateOrder(Orders o) {
		if (oDao.uptdateOrder(o)) {
			return JsonObject.getResult(1, "订单修改完成", true);
		} else {
			return JsonObject.getResult(0, "订单修改失败", false);
		}
	}

	@Override
	public Object updateOrderStatus(Integer status, long order_id) {
		if (oDao.updateOrderStatus(order_id, status)) {
			return JsonObject.getResult(1, "状态修改成功", true);
		} else {
			return JsonObject.getResult(0, "状态修改失败", false);
		}
	}

	@Override
	public Object getOrderList(HttpSession session, Integer start, Integer limit) {
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			List<Orders> li = oDao.getOrderListById(start, limit, userId);
			long count = oDao.getCount(userId);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("OrdersList", li);
			map.put("count", count);
			return JsonObject.getResult(1, "所有订单", map);
		} else {
			return JsonObject.getResult(-999, "请先登录", false);
		}
	}

	@Override
	public Object getOrderDetailByOrderid(Integer start, Integer limit,
			long orderid) {
		
		return null;
	}

	@Override
	public Object getOrderByStatus(HttpSession session, Integer start,
			Integer limit, Integer status) {
		Long userId = GetUserId.getUserId(session);
		if (userId != null && status == 0 || status == 1 || status == -1 || status == -2) {
			List<Orders> li = oDao.getOrderListByStatus(start, limit, status, userId);
			long count = oDao.getCountByStatus(userId, status);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("OrderList", li);
			map.put("count", count);
			return JsonObject.getResult(1, "学员订单", map);
		} else {
			return JsonObject.getResult(-999, "未登录或状态码错误", false);
		}
	}

}
