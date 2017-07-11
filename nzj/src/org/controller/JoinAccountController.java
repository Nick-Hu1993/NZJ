package org.controller;

import org.model.JoinAccount;
import org.service.JoinAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JoinAccountController {
	
	@Autowired
	private JoinAccountService jaService;
	
	@RequestMapping("/addJoinAccount")
	@ResponseBody
	public Object addJoinAccount (JoinAccount ja) {
		return jaService.addJoinAccount(ja);
	}
	
	@RequestMapping("/deleteJoinAccount")
	@ResponseBody
	public Object deleteJoinAccount (long id) {
		return jaService.deleteJoinAccount(id);
	}
	
	@RequestMapping("/updateJoinAccount")
	@ResponseBody
	public Object updateJoinAccount (JoinAccount ja) {
		return jaService.updateJoinAccount(ja);
	}
	
	@RequestMapping("/getJoinAccountByJoinId")
	@ResponseBody
	public Object getJoinAccountByJoinId (long joinid) {
		return jaService.getJoinAccountByJoinId(joinid);
	}
	
	@RequestMapping("/getJoinOrderAndAccountByUserId")
	@ResponseBody
	public Object getJoinOrderAndAccountByUserId(Integer start, Integer limit,
			long userid) {
		return jaService.getJoinOrderAndAccountByUserId(start, limit, userid);
	}
}
