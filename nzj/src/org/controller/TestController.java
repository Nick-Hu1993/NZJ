package org.controller;

import org.dao.ModuleDao;
import org.dao.imp.ModuleDaoImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	
	
	@RequestMapping("/getModuleList")
	@ResponseBody
	public Object getModuleList()throws Exception{
		ModuleDao mDao = new ModuleDaoImp();
		return mDao.getModuleList();
	}
}
