package org.dao;

import java.util.List;

import org.model.JoinAccount;
import org.view.VJoinorderAccount;

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
	/**
	 * 4.3通过用户id获取所有该用户所有已完成的加盟返点账单
	 * ps：只有已完成的订单才是百分百都已经生成了账单的
	 * @param start
	 * @param limit
	 * @param userid
	 * @return
	 */
	public List<VJoinorderAccount> getJoinOrderAndAccountByUserId (Integer start, Integer limit, long userid);
	/**
	 * 4.4配合4.3做分页
	 * @param userid
	 * @return
	 */
	public long getCountByUserId (long userid);
}
