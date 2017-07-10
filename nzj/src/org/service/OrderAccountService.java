package org.service;


import org.model.OrderAccount;

public interface OrderAccountService {
	/**
	 * 1.添加学员返点账单（仅管理员）
	 * ps：当订单状态为1时才可创建
	 * @param oa
	 * @return
	 */
	public Object addOrderAccount (OrderAccount oa);
	/**
	 * 2.删除学员返点账单（仅管理员）
	 * @param id
	 * @return
	 */
	public Object deleteOrderAccount (long id);
	/**
	 * 3.修改学员返点账单（仅管理员）
	 * @param oa
	 * @return
	 */
	public Object updateOrderAccount (OrderAccount oa);
	/**
	 * 4.通过学员返点订单id号获取账单详情
	 * 一对一关系
	 * @param orderid
	 * @return
	 */
	public Object getOrderAccountByOrderId (long orderid);
	/**
	 * 4.3通过用户id获取所有该用户所有已完成的账单
	 * ps：只有已完成的订单才是百分百都已经生成了账单的
	 * @param start
	 * @param limit
	 * @param userid
	 * @return
	 */
	public Object getOrderAndAccountByUserId(Integer start, Integer limit, long userid);
}
