package org.controller;

import org.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LogController {
	@Autowired
	private LogService lService;
	
	@RequestMapping("/getLogList")
	@ResponseBody
	public Object getLogList(Integer start,Integer limit)throws Exception{
		return lService.getLogList(start, limit);
	}
	
	
}
