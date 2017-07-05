package org.service;


import javax.servlet.http.HttpSession;

import org.model.JoinOrders;

public interface JoinOrderService {
	/**
	 * 1.添加加盟返点订单
	 * @param session
	 * @param jo
	 * @return
	 */
	public Object addJoinOrder (HttpSession session, JoinOrders jo, long[] id);
	/**
	 * 2.删除加盟返点订单（仅管理员）
	 * 连带订单中间表中的订单与用户关系一同删除
	 * @param id
	 * @return
	 */
	public Object deleteJoinOrder  (long id);
	/**
	 * 3.修改加盟返点订单的内容(仅管理员)
	 *原则上订单不可删除
	 * @param jo
	 * @return
	 */
	public Object updateJoinORder (JoinOrders jo);
	/**
	 * 4.修改加盟返点订单状态
	 * status：0审核中（默认状态）：1通过：-1驳回：-2完成
	 * @param status
	 * @param joinorderid
	 * @return
	 */
	public Object updateJoinOrderStatus (Integer status, long joinorderid);
	/**
	 * 5.根据当前登录的用户遍历出该用户的所有订单
	 * @param start
	 * @param limit
	 * @param id
	 * @return
	 */
	public Object getJoinOrderListById (HttpSession session, Integer start, Integer limit);
	/**
	 * 6.根据订单号查询该订单的详情/订单中包含哪些加盟商
	 * @param start
	 * @param limit
	 * @param id
	 * @return
	 */
	public Object getJoinOrderDetailByJoinorderid (Integer start, Integer limit, long joinorderid);
	/**
	 * 7.根据状态遍当前用户的加盟订单
	 * status：0审核中（默认状态）：1通过：-1驳回：-2完成
	 * @param start
	 * @param limit
	 * @param status
	 * @return
	 */
	public Object getJoinOrderByStatus (HttpSession session, Integer start, Integer limit, Integer status);
	/**
	 * 8.获取所有不同状态的加盟订单
	 * status：0审核中（默认状态）：1通过：-1驳回：-2完成
	 * @param start
	 * @param limit
	 * @param id
	 * @param status
	 * @return
	 */
	public Object getAllJoinOrderByStatus (Integer start, Integer limit, Integer status);
}
