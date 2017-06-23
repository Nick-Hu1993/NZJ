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
	public long addJoinAccount (JoinAccount ja, Integer status);
	//-----------------------------------删--------------------------------------
	/**
	 * 2.1删除加盟返点订单（仅管理员）
	 * joinid:订单id
	 * @param id 账单id
	 * @param status
	 * @param joinid
	 * @return
	 */
	public boolean deleteJoinAccount (long id, long joinid, Integer status);
	//-----------------------------------改--------------------------------------
	/**
	 * 3.1修改加盟返点账单（仅管理员）
	 * @param ja
	 * @return
	 */
	public boolean updateJoinAccount (JoinAccount ja);
	//-----------------------------------查--------------------------------------
	/**
	 * 4.1通过加盟返点账单id号获取订单的id
	 * 为账单删除后自动将订单回退到1（审核通过）状态做准备
	 * @param id
	 * @return
	 */
	public long getJoinOrderIdById (long id);
	/**
	 * 4.2通过加盟返点订单id号获取账单详情
	 * @param joinaccountid
	 * @return
	 */
	public JoinAccount getJoinAccountByJoinAccountId(long joinaccountid);
}
