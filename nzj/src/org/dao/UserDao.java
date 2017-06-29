package org.dao;

import java.util.List;

import org.model.User;
import org.view.VUser;
import org.view.VUserId;

public interface UserDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1注册，添加用户--Long phone,String password,Integer rank
	 * @param u
	 * @return
	 */
	public long addUser(User u);
	//-----------------------------------删-----------------------------------------
	/**
	 * 2.1删除用户，管理员才能
	 * @param id
	 * @return
	 */
	public boolean deleteUser(Long id);
	//-----------------------------------改-----------------------------------------
	/**
	 * 3.1修改用户密码
	 * @return
	 */
	public boolean updateUserPassword(Long id,String password);
	/**
	 * 3.2审核用户，修改ack 0为1，修改rank 0为rank
	 * @param rank
	 * @param ack
	 * @return
	 */
	public boolean updateUser(Long id,Integer rank,Integer ack);
	//-----------------------------------查-----------------------------------------
	/**
	 * 4.1验证电话是否已用，null表示可用，非空表示已用
	 * @param phone
	 * @return
	 */
	public User getUser(Long phone);
	/**
	 * 4.2登录
	 * @param phone
	 * @param password
	 * @return
	 */
	public User getUser(Long phone,String password);
	/**
	 * 4.3通过id获取用户，视图形（User+UserDetail）
	 * @param id
	 * @return
	 */
	public VUserId getUserById(Long id);
	/**
	 * 4.4获取未审核通过的用户列表
	 * @return
	 */
	public List getUnAckUserList(Integer start, Integer limit);
	/**
	 * 4.5获取未审核通过的用户的数目
	 * @return
	 */
	public Long getUnAckUserCount();
	/**
	 * 4.6获取已审核通过的用户列表
	 * @param start
	 * @param limit
	 * @return
	 */
	public List getAckUserList(Integer start,Integer limit);
	/**
	 * 4.7获取已审核通过的用户数目
	 * @return
	 */
	public Long getAckUserCount();
	/**
	 * 4.8根据用户id查询其rank值
	 * 用于员工登录之后查询学员制证的单价
	 * @param UserId
	 * @return
	 */
	public Integer getRankByUserId (long UserId);

}
