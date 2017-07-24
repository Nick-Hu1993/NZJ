package org.dao;

import java.util.List;

import org.model.UserDetail;
import org.view.VUser;

public interface UserDetailDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加用户详细信息，userId（用户id）,...，charterurl（可选），idcardurl（可选）
	 * @param ud
	 * @return
	 */
	public long addUserDetail(UserDetail ud);
	//-----------------------------------删-----------------------------------------
	
	//-----------------------------------改-----------------------------------------
	/**
	 * 3.1修改用户详细信息，不允许修改username
	 * @param ud
	 * @return
	 */
	public boolean updateUserDetail(UserDetail ud);
	/**
	 * 3.2修改用户头像的地址
	 * @param AuntId
	 * @param photourl
	 * @return
	 */
	public boolean updatePhoto (long userId, String photourl);
	//-----------------------------------查-----------------------------------------
	/**
	 * 4.1验证用户名是否已用，null为可用，通过username获取 UserDetail
	 * @param username
	 * @return
	 */
	public UserDetail getUserDetail(String username);
	/**
	 * 4.2查看该用户（通过用户id）是否完善过用户信息,true表示完善过用户信息
	 * @param userId
	 * @return
	 */
	public boolean getUserDetail(Long userId);
	/**
	 * 4.3通过用户id查询用户详细信息
	 * @param userId
	 * @return
	 */
	public UserDetail getUserDetailById(Long userId);
	/**
	 * 4.4查询用户是否需要加盟服务（是否需要进行服务由管理员确定）
	 * 0需要（未服务过）：1不需要（已服务过）
	 * true:可以添加服务：false不能添加服务
	 * @param id
	 * @return
	 */
	public boolean getUserDetailSupport (long id);
	/**
	 * 4.5以是否已享受加盟服务遍历用户详情
	 * 0需要（未服务过）：1不需要（已服务过）
	 * @return
	 */
	public List<VUser> getUserDetailListBySupport (Integer start, Integer limit, Integer support);
	/**
	 * 4.6服务4.5，查询是否已享受加盟服务的总数量
	 * 0需要（未服务过）：1不需要（已服务过）
	 * @param support
	 * @return
	 */
	public long getCountBySupport (Integer support);
}
