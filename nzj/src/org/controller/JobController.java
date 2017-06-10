package org.controller;

import org.model.Job;
import org.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JobController {
	@Autowired
	private JobService jService;
	
	@RequestMapping("/addJob")
	@ResponseBody
	public Object addJob(String name)throws Exception{
		return jService.addJob(new Job(name));
	}
	
	@RequestMapping("/deleteJob")
	@ResponseBody
	public Object deleteJob(long id)throws Exception{
		return jService.deleteJob(id);
	}

	@RequestMapping("/updateJob")
	@ResponseBody
	public Object updateJob(long id,String name)throws Exception{
		return jService.updateJob(new Job(id,name));
	}
	
	@RequestMapping("/getJobList")
	@ResponseBody
	public Object getJobList()throws Exception{
		return jService.getJobList();
	}
}
