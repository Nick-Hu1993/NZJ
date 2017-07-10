package org.controller;

import javax.servlet.http.HttpSession;

import org.model.JoinOrders;
import org.service.JoinOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JoinOderController {
	
	@Autowired
	private JoinOrderService joService;
	
	@RequestMapping("/addJoinOrder")
	@ResponseBody
	public Object addJoinOrder (HttpSession session, JoinOrders jo, long[] id) {
		return joService.addJoinOrder(session, jo, id);
	}
	
	@RequestMapping("/deleteJoinOrder")
	@ResponseBody
	public Object deleteJoinOrder (long id) {
		return joService.deleteJoinOrder(id);
	}
	
	@RequestMapping("/updateJoinOrder")
	@ResponseBody
	public Object updateJoinOrder (JoinOrders jo) {
		return joService.updateJoinORder(jo);
	}
	
	@RequestMapping("/updateJoinOrderStatus")
	@ResponseBody
	public Object updateJoinOrderStatus (Integer status, long joinorderid) {
		return joService.updateJoinOrderStatus(status, joinorderid);
	}
	
	@RequestMapping("/getJoinOrderListById")
	@ResponseBody
	public Object getJoinOrderListById(HttpSession session, Integer start, Integer limit) {
		return joService.getJoinOrderListById(session, start, limit);
	}
	
	@RequestMapping("/getJoinOrderDetailByJoinorderid")
	@ResponseBody
	public Object getJoinOrderDetailByJoinorderid(Integer start, Integer limit,
			long joinorderid) {
		return joService.getJoinOrderDetailByJoinorderid(start, limit, joinorderid);
	}
	
	@RequestMapping("/getJoinOrderByStatus")
	@ResponseBody
	public Object getJoinOrderByStatus(HttpSession session, Integer start, Integer limit,
			Integer status) {
		return joService.getJoinOrderByStatus(session, start, limit, status);
	}
	
	@RequestMapping("/getAllJoinOrderByStatus")
	@ResponseBody
	public Object getAllJoinOrderByStatus (Integer start, Integer limit, Integer status) {
		return joService.getAllJoinOrderByStatus(start, limit, status);
	}
	
}
