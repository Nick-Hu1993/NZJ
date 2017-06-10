package org.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.Staff;
import org.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class StaffController {
	@Autowired
	private StaffService sService;

	@RequestMapping("/addStaff")
	@ResponseBody
	public Object addStaff(HttpSession session, HttpServletRequest request,
			Staff o, @RequestParam("file") CommonsMultipartFile file,Long[] mid)
			throws Exception {
		return sService.addStaff(session, request, o, file,mid);
	}

	@RequestMapping("/deleteStaff")
	@ResponseBody
	public Object deleteStaff(HttpSession session, HttpServletRequest request,
			Long id) throws Exception {
		return sService.deleteStaff(session,request,id);
	}

	@RequestMapping("/getStaffList")
	@ResponseBody
	public Object getStaffList(HttpSession session, Integer start, Integer limit)
			throws Exception {
		return sService.getStaffList(session, start, limit);
	}
	
	@RequestMapping("/sLogin")
	@ResponseBody
	public Object sLogin(HttpSession session,Long phone,String password)throws Exception{
		System.out.println("	员工登录:");
		System.out.println("	phone"+phone);
		System.out.println("	password"+password);
		return sService.sLogin(session, phone, password);
	}
	
	@RequestMapping("/getAllStaffList")
	@ResponseBody
	public Object getAllStaffList(Integer start,Integer limit)throws Exception{
		return sService.getAllStaffList(start, limit);
	}
	
	@RequestMapping("/getStaffById")
	@ResponseBody
	public Object getStaffById(HttpSession session)throws Exception{
		return sService.getStaffById(session);
	}
	
	@RequestMapping("/updateStaff")
	@ResponseBody
	public Object updateStaff(HttpSession session, String name, String address,
			String job)throws Exception{
		return sService.updateStaff(session, name, address, job);
	}
	
	@RequestMapping("/updateStaffPassword")
	@ResponseBody
	public Object updateStaffPassword(HttpSession session, String oPwd,
			String nPwd)throws Exception{
		return sService.updateStaffPassword(session, oPwd, nPwd);
	}
	
	@RequestMapping("/updateStaffPhotourl")
	@ResponseBody
	public Object updateStaffPhotourl(HttpSession session,
			HttpServletRequest request,
			@RequestParam("file") CommonsMultipartFile file)
			throws IllegalStateException, IOException{
		return sService.updateStaffPhotourl(session, request, file);
	}
	
	@RequestMapping("/getStaffAuthorityById")
	@ResponseBody
	public Object getStaffAuthorityBySid (HttpSession session, Long id) {
		return sService.getStaffAuthorityById(session, id);
	}
	
}
