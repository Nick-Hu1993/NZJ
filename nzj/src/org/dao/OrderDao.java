package org.dao;

import java.util.List;

import org.model.AmountRecord;
import org.model.Orders;
import org.view.VOrderTraineedetail;

public interface OrderDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加订单（在线支付方式）
	 * 与1.2区别在于本接口需生成消费记录
	 * @param o
	 * @return
	 */
	public boolean addOrder(Orders o, long[] id, AmountRecord ad);
	/**
	 * 1.2添加订单（线下支付方式）
	 * 于1.1区别在于本接口无需生成消费记录支付
	 * @param o
	 * @param id
	 * @return
	 */
	public boolean addOrderByOfflion (Orders o, long[] id);
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
	public boolean uptdateOrder (Orders o);
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
	/**
	 * 4.7通过订单查询订单详情/订单中包含哪些学员
	 * @param start
	 * @param limit
	 * @param orderid
	 * @return
	 */
	public List<VOrderTraineedetail> getOrderTaineeDetailByOrderid (Integer start, Integer limit, long orderid);
	/**
	 * 4.8根据点单号查询该订单包含trainee的数量
	 * @param orderid
	 * @return
	 */
	public long getOrderTraineedetailCount (long orderid);
	/**
	 * 4.9根据订单号及状态码查询学员订单
	 * 服务于账单创建（状态为1时才可创建账单）
	 * @param id
	 * @param status
	 * @return
	 */
	public boolean getOrderTraineeByStatusAndId (long id, Integer status);
}
