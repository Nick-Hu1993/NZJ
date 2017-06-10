package org.controller;

import org.model.Cooking;
import org.service.CookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CookingController {
	@Autowired
	private CookingService cService;
	
	@RequestMapping("/addCooking")
	@ResponseBody
	public Object addCooking(String name)throws Exception{
		return cService.addCooking(new Cooking(name));
	}
	
	@RequestMapping("/deleteCooking")
	@ResponseBody
	public Object deleteCooking(long id)throws Exception{
		return cService.deleteCooking(id);
	}
	
	@RequestMapping("/updateCooking")
	@ResponseBody
	public Object updateCooking(long id,String name)throws Exception{
		return cService.updateCooking(new Cooking(id,name));
	}
	
	@RequestMapping("/getCookingList")
	@ResponseBody
	public Object getCookingList()throws Exception{
		return cService.getCookingList();
	}
}
