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
}
