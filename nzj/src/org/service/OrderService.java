package org.service;

import javax.servlet.http.HttpSession;

import org.model.AmountRecord;
import org.model.Orders;

public interface OrderService {
	/**
	 * 1添加订单
	 * ps;1.当用户使用在线支付的方式的时候产生消费记录
	 * 	  2.使用线下支付的时候则无法生成消费记录，需人工确认是否收款完成
	 * 	  3.订单创建中的学员事由遍历bind=0的学员组曾
	 * @param o
	 * @return
	 */
	public Object addOrder(HttpSession session,Orders o, Long[] TraineeId );
	/**
	 * 2.删除订单（仅管理员）
	 * 连带中间关系表一同删除
	 * 可批量删除
	 * @param id
	 * @return
	 */
	public Object deleteOrder (Long[] id);
	/**
	 * 3.修改订单内容（仅管理员）
	 * @param o
	 * @return
	 */
	public Object updateOrder (HttpSession session, Orders o);
	/**
	 * 4.修改学员订单状态
	 * status：0审核中（默认状态）：1通过 ：-1驳回： -2完成
	 * @param status
	 * @param order_id
	 * @return
	 */
	public Object updateOrderStatus (Integer status, long orderid);
	/**
	 * 5.获取当前用户所有的订单
	 * @param session
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getOrderList (HttpSession session, Integer start, Integer limit);
	/**
	 * 6.根据订单号查询当前订单的详情
	 * @param start
	 * @param limit
	 * @param orderid
	 * @return
	 */
	public Object getOrderDetailByOrderid (Integer start, Integer limit, long orderid);
	/**
	 * 7.根据订单状态遍历该用户的学员订单
	 * status：0审核中（默认状态）：1通过：-1驳回：-2完成
	 * @param session
	 * @param start
	 * @param limit
	 * @param status
	 * @return
	 */
	public Object getOrderByStatus (HttpSession session, Integer start, Integer limit, Integer status);
	/**
	 * 8.根据状态遍历所有订单
	 * status：0审核中（默认状态）：1通过：-1驳回：-2完成
	 * @param start
	 * @param limit
	 * @param status
	 * @return
	 */
	public Object getAllOrderByStatus (Integer start, Integer limit, Integer status);
}
