package org.controller;

import javax.servlet.http.HttpSession;

import org.service.AmountRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AmountRecordController {
	
	@Autowired
	private AmountRecordService arService;
	
	@RequestMapping("/getAmountRecordList")
	@ResponseBody
	public Object getAmountRecordList (Integer start, Integer limit, long id) {
		return arService.getAmountRcordList(start, limit, id);
	}
	
	@RequestMapping("/getAmountRecordById")
	@ResponseBody
	public Object getAmountRecordById (HttpSession session, Integer start, Integer limit) {
		return arService.getAmountRcordById(session, start, limit);
	}
	
	@RequestMapping("/getBalanceByUserId")
	@ResponseBody
	public Object getBalanceByUserId(HttpSession session) {
		return arService.getBalanceByUserId(session);
	}
}
