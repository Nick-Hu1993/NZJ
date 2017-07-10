package org.controller;

import javax.servlet.http.HttpSession;

import org.Form.SupportTrackingForm;
import org.model.SupportTracking;
import org.service.SupportTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SupportTrackingController {
	@Autowired
	private SupportTrackingService stService;
	
	@RequestMapping("/addSupportTracking")
	@ResponseBody
	public Object addSupportTracking (HttpSession session, SupportTrackingForm stf, long id) {
		return stService.addSupportTracking(session, stf, id);
	}
	
	@RequestMapping("/deleteSupportTacking")
	@ResponseBody
	public Object deleteSupportTracking (Long[] id) {
		return stService.deleteSupportTracking(id);
	}

	@RequestMapping("/updateSupportTracking")
	@ResponseBody
	public Object updateSupportTracking (SupportTracking st, String time) {
		return stService.updateSupportTranking(st, time);
	}
	
	@RequestMapping("/getSupportTrackingByStatus")
	@ResponseBody
	public Object getSupportTrackingByStatus (HttpSession session, Integer start, Integer limit, Integer status) {
		return stService.getSupportTrackingByStatus(session, start, limit, status);
	}
	
	@RequestMapping("/getSupportTrackingByIdStatus")
	@ResponseBody
	public Object getSupportTrackingByIdStatus(Integer start, Integer limit,
			Long userId, Integer status) {
		return stService.getSupportTrackingByIdStatus(start, limit, userId, status);
	}
}
