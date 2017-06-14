package org.dao;

import java.util.List;

import org.model.Orders;

public interface OrderDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加订单
	 * @param o
	 * @return
	 */
	public long addOrder(Orders o, long[] id);
	//-----------------------------------删---------------------------------------
	/**
	 * 2.1删除订单（可批量）
	 * @param id
	 * @return
	 */
	public boolean deletOrder (long[] id);
	//-----------------------------------改---------------------------------------
	/**
	 * 3.1修改订单
	 * @param o
	 * @return
	 */
	public boolean uptdateOrder (OrderDao o);
	/**
	 * 3.2修改订单状态
	 * @param id
	 * @param status
	 * @return
	 */
	public boolean updateOrderStatus (long id, Integer status);
	//-----------------------------------查---------------------------------------
	/**
	 * 4.1遍历当前用户的所有订单
	 * @param start
	 * @param limit
	 * @param useId
	 * @return
	 */
	public List<Orders> getOrderListById(Integer start, Integer limit, long userId);
	/**
	 * 4.2查询当前用户订单的总数
	 * @param userId
	 * @return
	 */
	public long getCount (long userId);
	/**
	 * 4.3根据订单状态遍历当前用户的订单
	 * @param start
	 * @param limit
	 * @param status
	 * @param userId
	 * @return
	 */
	public List<Orders> getOrderListByStatus (Integer start, Integer limit, Integer status, long userId);
	/**
	 * 4.4根据订单状态查询当前用户各种状态订单的总数
	 * @param userId
	 * @param status
	 * @return
	 */
	public long getCountByStatus (long userId, Integer status);
	/**
	 *4.5遍历所有订单 
	 * @param start
	 * @param limit
	 * @return
	 */
	public List<Orders> getOrderList (Integer start, Integer limit);
	/**
	 * 4.6查询订单的总数
	 * @return
	 */
	public long getAllCount ();
}
