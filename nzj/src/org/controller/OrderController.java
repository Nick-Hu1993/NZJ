package org.controller;

import javax.servlet.http.HttpSession;

import org.model.Orders;
import org.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {
	@Autowired
	private OrderService oService;
	
	@RequestMapping("/addOrder")
	@ResponseBody
	public Object addOrder(HttpSession session,Orders o)throws Exception{
		return oService.addOrder(session,o);
	}
	
	
}
