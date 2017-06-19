package org.dao;

import org.model.OrderAccount;

public interface OrderAccountDao {
	// -----------------------------------增---------------------------------------
	/**
	 * 1.1添加学员返点帐单（仅管理员）
	 * @param oa
	 * @param id 
	 * @return
	 */
	public long addOrderAccount (OrderAccount oa);
	// -----------------------------------删---------------------------------------
	/**
	 * 2.1删除学员返点订单（仅管理员）
	 * @param id
	 * @return
	 */
	public boolean deleteOrderAccount (long id);
	// -----------------------------------改---------------------------------------
	/**
	 * 3.1修改学员返点账单（仅管理员）
	 * @param oa
	 * @return
	 */
	public boolean updateOrderAccount (OrderAccount oa);
	// -----------------------------------查---------------------------------------
	/**
	 * 4.1通过学员返点账单id号获取订单的id
	 * @param id
	 * @return
	 */
	public long getOrderIdById (long id);
}
