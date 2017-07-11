package org.service;

import java.util.List;

import org.model.JoinAccount;
import org.view.VJoinorderAccount;

public interface JoinAccountService {
	/**
	 * 1.添加加盟返点账单（仅管理员）
	 * ps：当订单状态为“1”时才可创建
	 * @param ja
	 * @return
	 */
	public Object addJoinAccount (JoinAccount ja);
	/**
	 * 2.删除加盟返点账单（仅管理员）
	 * @param id
	 * @return
	 */
	public Object deleteJoinAccount (long id);
	/**
	 * 3.修改加盟返点账单（仅管理员）
	 * @param ja
	 * @return
	 */
	public Object updateJoinAccount (JoinAccount ja);
	/**
	 * 4.通过加盟返点订单id号获取账单详情
	 * 一对一关系
	 * @param joinid
	 * @return
	 */
	public Object getJoinAccountByJoinId (long joinid);
	/**
	 * 5.通过用户id获取所有该用户所有已完成的加盟返点账单
	 * ps：只有已完成的订单才是百分百都已经生成了账单的
	 * @param start
	 * @param limit
	 * @param userid
	 * @return
	 */
	public Object getJoinOrderAndAccountByUserId (Integer start, Integer limit, long userid);

}
