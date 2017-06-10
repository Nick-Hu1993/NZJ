package org.dao;

import java.util.List;

import org.model.Staff;

public interface StaffDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加员工
	 * @param o
	 * @return
	 */
	public long addStaff(Staff o,Long[] mid);
	//-----------------------------------删---------------------------------------
	/**
	 * 2.1删除员工
	 * @param id
	 * @return
	 */
	public boolean deleteStaff(long id);
	//-----------------------------------改---------------------------------------
	/**
	 * 3.1修改员工基本信息:name,address,job
	 * @param s
	 * @return
	 */
	public boolean updateStaff(long id,String name,String address,String job);
	/**
	 * 3.2修改员工的密码
	 * @param id
	 * @param password
	 * @return
	 */
	public boolean updateStaffPassword(long id,String password);
	/**
	 * 3.3修改员工的照片
	 * @param id
	 * @param photourl
	 * @return
	 */
	public boolean updateStaffPhotourl(long id,String photourl);
	//-----------------------------------查---------------------------------------	
	/**
	 * 4.1查看登录电话是否可用
	 * @param phone
	 * @return
	 */
	public Staff getStaff(Long phone);
	/**
	 * 4.2获取该用户的员工列表
	 * @param id
	 * @param start
	 * @param limit
	 * @return
	 */
	public List getStaffList(Long id,Integer start,Integer limit);
	/**
	 * 4.3获取该用户的员工总数
	 * @param id
	 * @return
	 */
	public long getStaffCount(Long id);
	/**
	 * 4.4验证员工账号密码
	 * @param phone
	 * @param password
	 * @return
	 */
	public Staff getStaff(Long phone,String password);
	/**
	 * 4.5获取全部员工列表
	 * @param start
	 * @param limit
	 * @return
	 */
	public List getAllStaffList(Integer start,Integer limit);
	/**
	 * 4.6获取全部员工的总数
	 * @return
	 */
	public long getAllStaffCount();
	/**
	 * 4.7通过用户id获取用户信息
	 * @param sid
	 * @return
	 */
	public Staff getStaffById(long sid);
	/**
	 * 4.8通过id获取照片url
	 * @param id
	 * @return
	 */
	public String getStaffPhotourlById(long id);
}
