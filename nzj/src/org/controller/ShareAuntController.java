package org.controller;

import javax.servlet.http.HttpSession;

import org.model.ShareAunt;
import org.service.ShareAuntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShareAuntController {
	@Autowired
	private ShareAuntService saService;

	@RequestMapping("/addShareAunt")
	@ResponseBody
	public Object addShareAunt(HttpSession session, ShareAunt sa)
			throws Exception {
		return saService.addShareAunt(session, sa);
	}

	@RequestMapping("/deleteShareAunt")
	@ResponseBody
	public Object deleteShareAunt(long id) throws Exception {
		return saService.deleteShareAunt(id);
	}

	@RequestMapping("/updateShareAunt")
	@ResponseBody
	public Object updateShareAunt(ShareAunt sa) throws Exception {
		return saService.updateShareAunt(sa);
	}

	@RequestMapping("/getShareAuntList")		//当前用户自己的
	@ResponseBody
	public Object getShareAuntList(HttpSession session, Integer start,
			Integer limit) throws Exception {
		return saService.getShareAuntList(session, start, limit);
	}

	@RequestMapping("/getUnShareAuntList")		//当前用户自己的
	@ResponseBody
	public Object getUnShareAuntList(HttpSession session, Integer start,
			Integer limit) throws Exception {
		return saService.getUnShareAuntList(session, start, limit);
	}

	@RequestMapping("/setShareAunt")			//当前用户自己的
	@ResponseBody
	public Object setShareAunt(long id) throws Exception {
		return saService.setShareAunt(id);
	}

	@RequestMapping("/setUnShareAunt")			//当前用户自己的
	@ResponseBody
	public Object setUnShareAunt(long id) throws Exception {
		return saService.setUnShareAunt(id);
	}

	@RequestMapping("/getAllShareAuntList")		//主页，全部
	@ResponseBody
	public Object getAllShareAuntList(Integer start, Integer limit)
			throws Exception {
		return saService.getAllShareAuntList(start, limit);
	}

	@RequestMapping("/getSearchShareAuntList")	//主页，全部
	@ResponseBody
	public Object getSearchShareAuntList(String key, Integer start,
			Integer limit) throws Exception {
		System.out.println("	key:" + key);
		return saService.getSearchShareAuntList(key, start, limit);
	}

	@RequestMapping("/getLocalShareAuntList")	//主页，当前用户的
	@ResponseBody
	public Object getLocalShareAuntList(HttpSession session, Integer start,
			Integer limit) throws Exception{
		return saService.getLocalShareAuntList(session, start, limit);
	}

}
