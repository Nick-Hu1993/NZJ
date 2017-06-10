package org.controller;

import org.model.Language;
import org.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LanguageController {
	@Autowired
	private LanguageService lService;
	
	@RequestMapping("/addLanguage")
	@ResponseBody
	public Object addLanguage(String name)throws Exception{
		return lService.addLanguage(new Language(name));
	}
	
	@RequestMapping("/deleteLanguage")
	@ResponseBody
	public Object deleteLanguage(long id)throws Exception{
		return lService.deleteLanguage(id);
	}
	
	@RequestMapping("/updateLanguage")
	@ResponseBody
	public Object updateLanguage(long id,String name)throws Exception{
		return lService.updateLanguage(new Language(id,name));
	}
	
	@RequestMapping("/getLanguageList")
	@ResponseBody
	public Object getLanguageList()throws Exception{
		return lService.getLanguageList();
	}
}
