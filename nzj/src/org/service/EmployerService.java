package org.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.Form.EmployerTrackingForm;
import org.model.Employer;
import org.model.EmployerTracking;

public interface EmployerService {
	/**
	 * 1.添加客户
	 * @param e
	 * @return
	 */
	public Object addEmployer (HttpSession session, Employer e, String eTime);
	/**
	 * 2.删除客户
	 * 连带跟踪标签一同删除
	 * @param id
	 * @return
	 */
	public Object deleteEmployer (Long id);
	/**
	 * 3.修改客户信息
	 * @param e
	 * @return
	 */
	public Object updateEmployer (Employer e, String eTime);
	/**
	 * 4.分页形式遍历客户信息
	 * @param page
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getEmployerList (HttpSession sesion, Integer start, Integer limit);
	/**
	 * 5.以状态码查询客户
	 * -2黑名单 -1放弃 0新单 1已签约
	 * @param start
	 * @param limit
	 * @param userId
	 * @param status
	 * @return
	 */
	public Object getEmployerListByStatus (HttpSession session, Integer start, Integer limit, Long userId, Integer status);
	/**
	 * 6.添加客户跟踪标签
	 * @param session
	 * @param et
	 * @return
	 */
	public Object addEmployerTracking (HttpSession session, EmployerTrackingForm et);
	/**
	 * 7.删除单个跟踪标签
	 * @param id
	 * @return
	 */
	public Object deleteEmployerTracking (Long id);
	/**
	 * 8.修改状态标签
	 * @param et
	 * @return
	 */
	public Object updateEmployerTracking (EmployerTracking et, String time);
	/**
	 * 9.以雇主id获取其所有追踪
	 * @param start
	 * @param limit
	 * @param employerId
	 * @return
	 */
	public Object getEmployerTrackingByemployerId (Integer start, Integer limit, Long employerId);
	/**
	 * 10.通过用户id遍历雇主
	 * @param start
	 * @param limit
	 * @param userId
	 * @return
	 */
	public Object getEmployerListByIdStatus (Integer start, Integer limit,Long userId, Integer status);
}
