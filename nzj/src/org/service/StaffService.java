package org.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.Staff;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * @author Administrator
 * 
 */
public interface StaffService {

	/**
	 * 1添加员工，需要登录
	 * 
	 * @param session
	 * @param o
	 * @return
	 */
	public Object addStaff(HttpSession session, HttpServletRequest request,
			Staff o, @RequestParam("file") CommonsMultipartFile file, Long[] mid)
			throws IllegalStateException, IOException;

	/**
	 * 2删除员工，传id号
	 * 
	 * @param id
	 * @return
	 */
	public Object deleteStaff(HttpSession session, HttpServletRequest request,
			Long id);

	/**
	 * 3获取当前用户的员工列表
	 * 
	 * @param session
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getStaffList(HttpSession session, Integer start, Integer limit);

	/**
	 * 4员工登录
	 * 
	 * @param session
	 * @param phone
	 * @param password
	 * @return
	 */
	public Object sLogin(HttpSession session, Long phone, String password);

	/**
	 * 5获取全部员工列表
	 * 
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getAllStaffList(Integer start, Integer limit);

	/**
	 * 6获取当前员工的信息
	 * 
	 * @param session
	 * @return
	 */
	public Object getStaffById(HttpSession session);

	/**
	 * 7修改员工基本信息
	 * 
	 * @param session
	 * @param name
	 * @param address
	 * @param job
	 * @return
	 */
	public Object updateStaff(HttpSession session, String name, String address,
			String job);

	/**
	 * 8修改员工密码
	 * 
	 * @param session
	 * @param oPwd
	 * @param nPwd
	 * @return
	 */
	public Object updateStaffPassword(HttpSession session, String oPwd,
			String nPwd);

	/**
	 * 9修改员工照片
	 * 
	 * @param session
	 * @param file
	 * @return
	 */
	public Object updateStaffPhotourl(HttpSession session,
			HttpServletRequest request,
			@RequestParam("file") CommonsMultipartFile file)
			throws IllegalStateException, IOException;
	
	/**
	 * 10.获取用户点击模块的代号，判断其是否具备该权限
	 * id：模块的对应代号
	 * @param sid
	 * @return
	 */
	public Object getStaffAuthorityById (HttpSession session, Long id);
}
