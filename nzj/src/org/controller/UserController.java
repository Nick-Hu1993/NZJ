package org.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.User;
import org.model.UserDetail;
import org.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.tool.JsonObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class UserController {
	@Autowired
	private UserService uService;

	// -----------------------------------User-----------------------------------------
	@RequestMapping("/register")
	@ResponseBody
	public Object register(HttpSession session, User u, int code)
			throws Exception {
		System.out.println("	phone: " + u.getPhone());
		System.out.println("	password: " + u.getPassword());
		return uService.register(session, u, code);
	}

	@RequestMapping("/login")
	@ResponseBody
	public Object login(HttpSession session, Long phone, String password)
			throws Exception {
		System.out.println("	phone: " + phone);
		System.out.println("	password: " + password);
		return uService.login(session, phone, password);
	}

	@RequestMapping("/logout")
	@ResponseBody
	public Object logout(HttpSession session) throws Exception {
		session.removeAttribute("user");
		session.removeAttribute("staff");
		return JsonObject.getResult(1, "注销", true);
	}

	@RequestMapping("/getSession")
	@ResponseBody
	public Object getSession(HttpSession session) throws Exception {
		return uService.getSession(session);
	}

	@RequestMapping("/getValidateCode")
	@ResponseBody
	public Object getValidateCode(HttpSession session, Long phone)
			throws Exception {
		return uService.getValidateCode(session, phone);
	}

	@RequestMapping("/getUser")				//获取当前用户的信息
	@ResponseBody
	public Object getUser(HttpSession session) throws Exception {
		return uService.getUser(session);
	}

	@RequestMapping("/updateUserPassword")
	@ResponseBody
	public Object updateUserPassword(HttpSession session, String oPwd,
			String nPwd) throws Exception {
		return uService.updateUserPassword(session, oPwd, nPwd);
	}

	@RequestMapping("/ackUser")
	@ResponseBody
	public Object ackUser(Long id, Integer rank, Long pid) throws Exception {
		return uService.ackUser(id, rank, pid);
	}
	// -----------------------------------admin-----------------------------------------
	@RequestMapping("/loginByAdmin")
	@ResponseBody
	public Object loginByAdmin(HttpSession session) {
		return uService.loginByAdmin(session);
	}
	
	@RequestMapping("/ResetUserPassword")
	@ResponseBody
	public Object ResetUserPassword(long id, String nPwd) {
		return uService.ResetUserPassword(id, nPwd);
	}
	
	@RequestMapping("/getUserListByRank")
	@ResponseBody
	public Object getUserListByRank(Integer start, Integer limit, Integer rank) {
		return uService.getUserListByRank(start, limit, rank);
	}
	// -----------------------------------UserDetail-----------------------------------------
	@RequestMapping("/addUserDetail")
	@ResponseBody
	public Object addUserDetail(HttpServletRequest request, UserDetail ud,
			@RequestParam("file1") CommonsMultipartFile file1,
			@RequestParam("file2") CommonsMultipartFile file2) throws Exception {
		return uService.addUserDetail(request, ud, file1, file2);
	}

	@RequestMapping("/updateUserDetail")
	@ResponseBody
	public Object updateUserDetail(HttpServletRequest request, UserDetail ud,
			@RequestParam("file1") CommonsMultipartFile file1,
			@RequestParam("file2") CommonsMultipartFile file2) throws Exception {
		return uService.updateUserDetail(request, ud, file1, file2);
	}

	@RequestMapping("/getUnAckUserList")
	@ResponseBody
	public Object getUnAckUserList(Integer start, Integer limit)
			throws Exception {
		return uService.getUnAckUserList(start, limit);
	}

	@RequestMapping("/getAckUserList")
	@ResponseBody
	public Object getAckUserList(Integer start, Integer limit) throws Exception {
		return uService.getAckUserList(start, limit);
	}

	@RequestMapping("/checkUserDetail")
	@ResponseBody
	public Object checkUserDetail(Long userId) throws Exception {
		return uService.checkUserDetail(userId);
	}

	@RequestMapping("/getUserCheckById")
	@ResponseBody
	public Object getUserCheckById(Long userId) throws Exception {
		return uService.getUserCheckById(userId);
	}

	@RequestMapping("/updateUserCheck")			//审核不通过，并填写信息
	@ResponseBody
	public Object updateUserCheck(Long userId, Integer status,
			String description) throws Exception {
		return uService.updateUserCheck(userId, 0, description);
	}
	
	// -----------------------------------加盟（join）-----------------------------------------
	
	@RequestMapping("/getChildByParent")			
	@ResponseBody
	public Object getChildByParent (HttpSession session, Integer start, Integer limit, Long[] parent) {
		return uService.getChildByParent(session, start, limit, parent);
	}
}
