package org.controller;

import javax.servlet.http.HttpSession;

import org.model.Help;
import org.service.HelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelpController {
	@Autowired
	private HelpService hService;
	
	@RequestMapping("/addHelp")
	@ResponseBody
	public Object addHelp (HttpSession session, Help h) {
		return hService.addHelp(session, h);
	}
	
	@RequestMapping("/deleteHelp")
	@ResponseBody
	public Object deleteHlp(long id) {
		return hService.deleteHelp(id);
	}

	@RequestMapping("/updateHelpStatus")
	@ResponseBody
	public Object updateHelpStatus(long id, Integer status) {
		return hService.updateHelpStatus(id, status);
	}

	@RequestMapping("/getHelpListByStatus")
	@ResponseBody
	public Object getHelpListByStatus(HttpSession session,Integer start, Integer limit,
			 Integer status) {
		return hService.getHelpListByStatus(session,start, limit, status);
	}

	@RequestMapping("/getAllHelpListByStatus")
	@ResponseBody
	public Object getAllHelpListByStatus1(Integer start, Integer limit,
			Integer status) {
		return hService.getAllHelpListByStatus(start, limit, status);
	}

	@RequestMapping("/getHelpByIdentifier")
	@ResponseBody
	public Object getHelpByIdentifier(String identifier) {
		return hService.getHelpByIdentifier(identifier);
	}
}
