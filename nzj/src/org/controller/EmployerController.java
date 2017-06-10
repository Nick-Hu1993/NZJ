package org.controller;

import javax.servlet.http.HttpSession;

import org.Form.EmployerTrackingForm;
import org.model.Employer;
import org.model.EmployerTracking;
import org.service.EmployerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployerController {
	@Autowired
	private EmployerService eService;
	
	@RequestMapping("/addEmployer")
	@ResponseBody
	public Object addEmployer (HttpSession session, Employer e, String eTime) {
		return eService.addEmployer(session, e, eTime);
	}
	
	@RequestMapping("/deleteEmployer")
	@ResponseBody
	public Object deleteEmployer (Long id) {
		return eService.deleteEmployer(id);
	}
	
	@RequestMapping("/updateEmployer")
	@ResponseBody
	public Object updateEmployer (Employer e, String eTime) {
		System.out.println(e.getAddress());
		return eService.updateEmployer(e, eTime);
	}
	
	@RequestMapping("/getEmployerList")
	@ResponseBody
	public Object getEmployerList ( HttpSession session, Integer start, Integer limit) {
		return eService.getEmployerList(session, start,limit);
	}
	
	@RequestMapping("/getEmployerListByStatus")
	@ResponseBody
	public Object getEmployerListByStatus (HttpSession session, Integer start, Integer limit,
			Long userId, Integer status) {
		return eService.getEmployerListByStatus(session, start, limit, userId, status);
	}
	/*****************************************EmployerTracking客户追踪*****************************************************/
	
	@RequestMapping("/addEmployerTracking")
	@ResponseBody
	public Object addEmployerTracking (HttpSession session, EmployerTrackingForm et) {
		return eService.addEmployerTracking(session, et);
	}
	
	@RequestMapping("/deleteEmployerTracking")
	@ResponseBody
	public Object deleteEmployerTracking(Long id) {
		return eService.deleteEmployerTracking(id);
	}
	
	@RequestMapping("/updateEmployerTracking")
	@ResponseBody
	public Object updateEmployerTracking(EmployerTracking et, String time) {
		return eService.updateEmployerTracking(et, time);
	}
	
	@RequestMapping("/getEmployerTrackingByemployerId")
	@ResponseBody
	public Object getEmployerTrackingByemployerId(Integer start,
			Integer limit, Long employerId) {
		return eService.getEmployerTrackingByemployerId(start, limit, employerId);
	}
}
