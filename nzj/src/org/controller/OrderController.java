package org.controller;

import javax.servlet.http.HttpSession;

import org.model.AmountRecord;
import org.model.Orders;
import org.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class OrderController {
	@Autowired
	private OrderService oService;
	
	@RequestMapping("/addOrder")
	@ResponseBody
	public Object addOrder(HttpSession session, Orders o, long[] TraineeId)throws Exception{
		return oService.addOrder(session, o, TraineeId);
	}
	
	@RequestMapping("/deleteOrder")
	@ResponseBody
	public Object deleteObject (long[] id ) {
		return oService.deleteOrder(id);
	}
	
	@RequestMapping("/updateOrder")
	@ResponseBody
	public Object updateOrder (HttpSession session, Orders o) {
		return oService.updateOrder(session, o);
	}
	
	@RequestMapping("/updateOrderStatus") 
	@ResponseBody
	public Object updatOrderStatus (Integer status, Long orderid) {
		return oService.updateOrderStatus(status, orderid);
	}
	
	@RequestMapping("/getOrderList")
	@ResponseBody
	public Object getOrderList (HttpSession session, Integer start, Integer limit) {
		return oService.getOrderList(session, start, limit);
	}
	
	@RequestMapping("/getOrderDetailByOrderid")
	@ResponseBody
	public Object getOrderDetailByOrderid (Integer start, Integer limit,
			long orderid) {
		return oService.getOrderDetailByOrderid(start, limit, orderid);
	}
	
	@RequestMapping("/getOrderByStatus")
	@ResponseBody
	public Object getOrderByStatus (HttpSession session, Integer start,
			Integer limit, Integer status) {
		return oService.getOrderByStatus(session, start, limit, status);
	} 
	
	@RequestMapping("/getAllOrderByStatus")
	@ResponseBody
	public Object getAllOrderByStatus(Integer start, Integer limit,
			Integer status) {
		return oService.getAllOrderByStatus(start, limit, status);
	}
}
