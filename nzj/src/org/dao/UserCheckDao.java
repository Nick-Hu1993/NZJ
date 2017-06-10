package org.dao;

import org.model.UserCheck;

public interface UserCheckDao {
	// -----------------------------------增---------------------------------------
	public long addUserCheck(UserCheck ul);
	// -----------------------------------删---------------------------------------
	// -----------------------------------改---------------------------------------
	public boolean updateUserCheck(Long userId,Integer status,String description);
	// -----------------------------------查---------------------------------------
	/**
	 * 查询当前用户的审核状态
	 * @param userId
	 * @return
	 */
	public UserCheck getUserCheck(Long userId);
}
