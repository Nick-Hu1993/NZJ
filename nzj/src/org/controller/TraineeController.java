package org.controller;

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

@Controller
public class TraineeController {
	@Autowired
	private TraineeService tService;

	@RequestMapping("/addTrainee")
	@ResponseBody
	public Object addTrainee(HttpSession session, HttpServletRequest request,
			Trainee t, @RequestParam("file1") CommonsMultipartFile file1,
			@RequestParam("file2") CommonsMultipartFile file2,
			@RequestParam("file3") CommonsMultipartFile file3,
			@RequestParam("file4") CommonsMultipartFile file4) throws Exception {

		return tService.addTrainee(session, request, t, file1, file2, file3,
				file4);
	}

}
