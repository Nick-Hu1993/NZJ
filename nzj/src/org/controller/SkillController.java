package org.controller;

import org.model.Skill;
import org.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillController {
	@Autowired
	private SkillService sService;
	
	@RequestMapping("/addSkill")
	@ResponseBody
	public Object addSkill(String name)throws Exception{
		return sService.addSkill(new Skill(name));
	}
	
	@RequestMapping("/deleteSkill")
	@ResponseBody
	public Object deleteSkill(long id)throws Exception{
		return sService.deleteSkill(id);
	}
	
	@RequestMapping("/updateSkill")
	@ResponseBody
	public Object updateSkill(long id,String name)throws Exception{
		return sService.updateSkill(new Skill(id,name));
	}
	
	@RequestMapping("/getSkillList")
	@ResponseBody
	public Object getSkillList()throws Exception{
		return sService.getSkillList();
	}
}
