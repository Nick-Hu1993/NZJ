package org.dao;

import java.util.List;

import org.Form.EmployerTrackingForm;
import org.model.Employer;
import org.model.EmployerTracking;

public interface EmployerDao {
	//-----------------------------------增--------------------------------------
	/**
	 * 1.1添加客户--Integer time,String name,String phone,String adress,String content
	 * @param e
	 * @return
	 */
	public long addEmployer (Employer e);
	/**
	 * 1.2 批量添加客户追踪情况
	 * @param Employer_id
	 * @param et
	 * @return
	 */
	public boolean addEmployerTacking (EmployerTrackingForm et);
	//-----------------------------------删--------------------------------------
	/**
	 * 2.1删除客户
	 * @param id
	 * @return
	 */
	public boolean deleteEmployer (Long id);
	/**
	 * 2.2删除客户追踪情况
	 * @param id
	 * @return
	 */
	public boolean deleteEmployerTracking (long id);
	//-----------------------------------改--------------------------------------
	/**
	 * 3.1修改客户信息
	 * @param id
	 * @return
	 */
	public boolean updateEmployer (Employer e);
	/**
	 * 3.2修改客户追踪情况
	 * @param et
	 * @return
	 */
	public boolean updateEmployerTacking (EmployerTracking et);
	/**
	 * 3.3修改客户的状态
	 * status：-2黑名单 -1放弃 0新单 1已签约
	 * @param employerId
	 * @param status
	 * @return
	 */
	public boolean updateEmployerStatus (long employerId, Integer status);
	//-----------------------------------查--------------------------------------
	/**
	 * 4.1通过name&phone查找用户--防止用户录入重复
	 * @param name
	 * @param phone
	 * @return
	 */
	public Employer getEmployer (Long userid, String name, String phone);
	/**
	 * 4.2通过id查找用户
	 * @param id
	 * @return
	 */
	public Employer getEmployerById (Long id);
	/**
	 * 4.3获取当前用户雇主的总数量
	 * @return
	 */
	public long getEmployerCountById (Long id);
	/**
	 * 4.4根据状态码查询共有多少条记录
	 * @return
	 */
	public long getEmployerCountByIdStatus (Long id, Integer status);
	/**
	 * 4.5分页查询客户信息
	 * @param page
	 * @param start
	 * @param limit
	 * @return
	 */
	public List<Employer> getEmployerList (Integer start, Integer limit,Long userId);
	/**
	 * 4.6查询当前客户的所有追踪情况
	 * @param start
	 * @param limit
	 * @param employerId
	 * @return
	 */
	public List<EmployerTracking> getEmployerTrackingByemployerId (Integer start, Integer limit, Long employerId);
	/**
	 * 4.7根据状态码返回不同状态的数据
	 * -2黑名单 -1放弃 0新单 1已签约
	 * @param status
	 * @return
	 */
	public List<Employer> getEmpolyerListByStatus (Integer start, Integer limit, Long userId, Integer status);
}
