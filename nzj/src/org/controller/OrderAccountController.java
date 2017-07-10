package org.controller;

import org.model.OrderAccount;
import org.service.OrderAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderAccountController {
	
	@Autowired
	private OrderAccountService oaService;
	
	@RequestMapping("/addOrderAccount")
	@ResponseBody
	public Object addOrderAccount (OrderAccount oa) {
		return oaService.addOrderAccount(oa);
	}
	
	@RequestMapping("/deleteOrderAccount")
	@ResponseBody
	public Object deleteOrderAccount (long id) {
		return oaService.deleteOrderAccount(id);
	}
	
	@RequestMapping("/updateOrderAccount")
	@ResponseBody
	public Object updateOrderAccount (OrderAccount oa) {
		return oaService.updateOrderAccount(oa);
	}
	
	@RequestMapping("/getOrderAccountByOrderId")
	@ResponseBody
	public Object getOrderAccountByOrderId (long orderid) {
		return oaService.getOrderAccountByOrderId(orderid);
	}
	
	@RequestMapping("/getOrderAndAccountByUserId")
	@ResponseBody
	public Object getOrderAndAccountByUserId(Integer start, Integer limit,
			long userid) {
		return oaService.getOrderAndAccountByUserId(start, limit, userid);
	}
}
