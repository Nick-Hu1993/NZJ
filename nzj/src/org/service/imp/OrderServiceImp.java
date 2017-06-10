package org.service.imp;

import java.util.Date;

import javax.servlet.http.HttpSession;

import org.dao.OrderDao;
import org.model.Orders;
import org.model.User;
import org.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.JsonObject;

@Service
public class OrderServiceImp implements OrderService{
	@Autowired
	private OrderDao oDao;
	
	@Override
	public Object addOrder(HttpSession session,Orders o) {
		User u = (User)session.getAttribute("user");
		if(u!=null){
			o.setTime(new Date().getTime()/1000);
			o.setUserId(u.getId());
			if(oDao.addOrder(o)!=-1)
				return JsonObject.getResult(1, "添加订单成功", true);
			else
				return JsonObject.getResult(-1, "添加订单失败", false);
		}else{
			return JsonObject.getResult(0, "请先登录，才能添加订单", false);
		}
	}

}
