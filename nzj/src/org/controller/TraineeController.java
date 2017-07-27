package org.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.Trainee;
import org.service.TraineeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class TraineeController {
	@Autowired
	private TraineeService tService;

	@RequestMapping("/addTrainee")
	@ResponseBody
	public Object addTrainee(HttpSession session, HttpServletRequest request,
			Trainee t, String birthday1, @RequestParam("file1") CommonsMultipartFile file1,
			@RequestParam("file2") CommonsMultipartFile file2,
			@RequestParam("file3") CommonsMultipartFile file3,
			@RequestParam("file4") CommonsMultipartFile file4) throws Exception {
		
		return tService.addTrainee(session, request, t, birthday1, file1, file2, file3,
				file4);
	}
	
	@RequestMapping("/deleteTrainee")
	@ResponseBody
	public Object deleteTrainee (long[] id) { 
		return tService.deleteTrainee(id);
	}
	
	@RequestMapping("/updateTrainee")
	@ResponseBody
	public Object updateTrainee (HttpSession session, HttpServletRequest request,
			Trainee t,String birthday1, @RequestParam("file1") CommonsMultipartFile file1,
			@RequestParam("file2") CommonsMultipartFile file2,
			@RequestParam("file3") CommonsMultipartFile file3,
			@RequestParam("file4") CommonsMultipartFile file4) throws IllegalStateException, IOException {
		System.out.println(new ObjectMapper().writeValueAsString(t));
		System.out.println(birthday1);
		return tService.updateTrainee(session, request, t, birthday1, file1, file2, file3, file4);
	}
	
	@RequestMapping("/updateTraineePay")
	@ResponseBody
	public Object updateTraineePay (long id, Integer pay) {
		return tService.updateTraineePay(id, pay);
	}
	
	@RequestMapping("/getTraineeListByPay")
	@ResponseBody
	public Object getTraineesListByPay (HttpSession session, Integer start, Integer limit, Integer pay) {
		return tService.getTraineesListByPay(session, start, limit, pay);
	}
	
	@RequestMapping("/getTraineeListByBind")
	@ResponseBody
	public Object getTraineeListByBind (HttpSession session, Integer start, Integer limit, Integer bind) {
		return tService.getTraineeListByBind(session, start, limit, bind);
	}
	
	@RequestMapping("/getTraineeList")
	@ResponseBody
	public Object getTraineeList (HttpSession session, Integer start, Integer limit) {
		return tService.getTraineeList(session, start, limit);
	}
	
	@RequestMapping("/getAllTraineeList")
	@ResponseBody
	public Object getAllTraineeList (Long userId, Integer start, Integer limit) {
		return tService.getTraineeListById(userId, start, limit);
	}
	
	@RequestMapping("/getTraineeByBindAndPay")
	@ResponseBody
	public Object getTraineeByBindAndPay(HttpSession session, Integer start, Integer limit,
			Integer bind, Integer pay) {
		return tService.getTraineeByBindAndPay(session, start, limit, bind, pay);
	}
}
