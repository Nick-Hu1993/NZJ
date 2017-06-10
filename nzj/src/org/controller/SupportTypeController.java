package org.controller;

import org.model.SupportType;
import org.service.SupportTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SupportTypeController {
	@Autowired
	private SupportTypeService stService;
	
	@RequestMapping("/addSupportType")
	@ResponseBody
	public Object addSuportType (SupportType st) {
		return stService.addSuportType(st);
	}
	
	@RequestMapping("/deleteSupportType")
	@ResponseBody
	public Object deleteSupportType (long id) {
		return stService.deleteSupportType(id);
	}
	
	@RequestMapping("/updateSupportType")
	@ResponseBody
	public Object updateSupportType (SupportType st) {
		return stService.updateSupportType(st);
	}
	
	@RequestMapping("/getSupportTypeList")
	@ResponseBody
	public Object getSupportTypeList (Integer start, Integer limit) {
		return stService.getSupportTypeList(start, limit);
	}
}
