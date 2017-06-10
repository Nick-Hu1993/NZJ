package org.controller;

import org.model.Appliance;
import org.service.ApplianceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplianceController {
	@Autowired
	private ApplianceService aService;
	
	@RequestMapping("/addAppliance")
	@ResponseBody
	public Object addAppliance(String name)throws Exception{
		System.out.println(name);
		return aService.addAppliance(new Appliance(name));
	}
	
	@RequestMapping("/deleteAppliance")
	@ResponseBody
	public Object deleteAppliance(long id)throws Exception{
		return aService.deleteAppliance(id);
	}
	
	@RequestMapping("/updateAppliance")
	@ResponseBody
	public Object updateAppliance(long id,String name)throws Exception{
		return aService.updateAppliance(new Appliance(id,name));
	}
	
	@RequestMapping("/getApplianceList")
	@ResponseBody
	public Object getApplianceList()throws Exception{
		return aService.getApplianceList();
	}
}
