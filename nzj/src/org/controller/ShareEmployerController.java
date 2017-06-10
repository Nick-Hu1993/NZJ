package org.controller;

import javax.servlet.http.HttpSession;

import org.model.ShareEmployer;
import org.service.ShareEmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShareEmployerController {
	@Autowired
	private ShareEmployerService seService;

	@RequestMapping("/addShareEmployer")
	@ResponseBody
	public Object addShareEmployer(HttpSession session, ShareEmployer se)
			throws Exception {
		return seService.addShareEmployer(session, se);
	}

	@RequestMapping("/deleteShareEmployer")
	@ResponseBody
	public Object deleteShareEmployer(long id) throws Exception {
		return seService.deleteShareEmployer(id);
	}

	@RequestMapping("/updateShareEmployer")
	@ResponseBody
	public Object updateShareEmployer(ShareEmployer se) throws Exception {
		return seService.updateShareEmployer(se);
	}

	@RequestMapping("/getShareEmployerList")		//当前用户自己的
	@ResponseBody
	public Object getShareEmployerList(HttpSession session, Integer start,
			Integer limit) throws Exception {
		return seService.getShareEmployerList(session, start, limit);
	}

	@RequestMapping("/getUnShareEmployerList")		//当前用户自己的
	@ResponseBody
	public Object getUnShareEmployerList(HttpSession session, Integer start,
			Integer limit) throws Exception {
		return seService.getUnShareEmployerList(session, start, limit);
	}

	@RequestMapping("/setShareEmployer")			//当前用户自己的
	@ResponseBody
	public Object setShareEmployer(long id) throws Exception {
		return seService.setShareEmployer(id);
	}

	@RequestMapping("/setUnShareEmployer")			//当前用户自己的
	@ResponseBody
	public Object setUnShareEmployer(long id) throws Exception {
		return seService.setUnShareEmployer(id);
	}

	@RequestMapping("/getAllShareEmployerList")		////主页，全部
	@ResponseBody
	public Object getAllShareAuntList(Integer start, Integer limit)
			throws Exception {
		return seService.getAllShareEmployerList(start, limit);
	}

	@RequestMapping("/getSearchShareEmployerList")		//主页，全部
	@ResponseBody
	public Object getSearchEmployerList(String key, Integer start, Integer limit)
			throws Exception {
		System.out.println("	key:"+key);
		return seService.getSearchShareEmployerList(key, start, limit);
	}
	
	@RequestMapping("/getLocalShareEmployerList")	//主页，全部
	@ResponseBody
	public Object getLocalShareEmployerList(HttpSession session, Integer start,
			Integer limit)throws Exception{
		return seService.getLocalShareEmployerList(session, start, limit);
	}

}
