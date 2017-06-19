package org.dao;

import org.model.JoinAccount;

public interface JoinAccountDao {
	//-----------------------------------增--------------------------------------
	/**
	 * 1.1添加加盟返点账单（仅管理员）
	 * @param ja
	 * @param id
	 * @return
	 */
	public long addJoinAccount (JoinAccount ja);
	//-----------------------------------删--------------------------------------
	/**
	 * 2.1删除加盟返点订单（仅管理员）
	 * @param id
	 * @return
	 */
	public boolean deleteJoinAccount (long id);
	//-----------------------------------改--------------------------------------
	/**
	 * 3.1修改加盟返点账单（仅管理员）
	 * @param ja
	 * @return
	 */
	public boolean updateJoinAccount (JoinAccount ja);
	//-----------------------------------查--------------------------------------
}
