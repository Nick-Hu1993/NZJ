package org.dao;

import java.util.List;

import org.model.OrderAccount;
import org.view.VOrderAccount;

public interface OrderAccountDao {
	// -----------------------------------增---------------------------------------
	/**
	 * 1.1添加学员返点帐单（仅管理员）
	 * @param oa
	 * @param id 
	 * @return
	 */
	public long addOrderAccount (OrderAccount oa, Integer status);
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
	 * 为账单删除后自动将订单回退到1（审核通过）状态做准备
	 * @param id
	 * @return
	 */
	public long getOrderIdById (long id);
	/**
	 * 4.2通过学员返点订单id号获取账单详情
	 * 一对一关系
	 * @param orderid
	 * @return
	 */
	public OrderAccount getOrderAccountByOrderId (long orderid);
	/**
	 * 4.3通过用户id获取所有该用户所有已完成的账单
	 * ps：只有已完成的订单才是百分百都已经生成了账单的
	 * @param start
	 * @param limit
	 * @param userid
	 * @return
	 */
	public List<VOrderAccount> getOrderAndAccountByUserId (Integer start, Integer limit, long userid);
	/**
	 * 4.4配合4.3做分页
	 * @param userid
	 * @return
	 */
	public long getCountByUserId (long userid);
	
}
