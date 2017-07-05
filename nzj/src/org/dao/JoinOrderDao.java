package org.dao;

import java.util.List;

import org.model.JoinOrders;
import org.view.VJoinUserdetail;

public interface JoinOrderDao {
	//-----------------------------------增--------------------------------------
	/**
	 * 1.1添加加盟返点订单
	 * @param jo
	 * @param id
	 * @return
	 */
	public boolean addJoninOrder (JoinOrders jo, long[] id);
	//-----------------------------------删--------------------------------------
	/**
	 * 2.1删除加盟返点订单（仅管理员）
	 * @param id
	 * @return
	 */
	public boolean deleteJoinOrder (long id);
	//-----------------------------------改--------------------------------------
	/**
	 * 3.1修改加盟返点内容（仅管理员）
	 * JoinOrder中已经自带了加盟返点订单的id
	 * @param jo
	 * @return
	 */
	public boolean updateJoinOrder (JoinOrders jo);
	/**
	 * 3.2变更订单的状态（随业务逻辑变动）
	 * @param status
	 * @return
	 */
	public boolean updateJoinOrderStatus (Integer status, long joinorderid);
	//-----------------------------------查--------------------------------------
	/**
	 * 4.1根据当前登录的用户遍历出该用用户的所有订单
	 * @param start
	 * @param limit
	 * @param id
	 * @return
	 */
	public List<JoinOrders> getJoinOrderListById (Integer start, Integer limit, long id);
	/**
	 * 4.2根据订单号查询该订单的详情/订单中包含哪些加盟商
	 * @param start
	 * @param limit
	 * @param id
	 * @return
	 */
	public List<VJoinUserdetail> getJoinOrderDetailByJoinorderid (Integer start, Integer limit, long joinorderid);
	/**
	 * 4.3根据用户id查询该用户加盟返点订单总数
	 * @param id
	 * @return
	 */
	public long getContById(long userId);
	/**
	 * 4.4根据状态遍历该用户的加盟订单
	 * status：0审核中（默认状态）：1通过：-1驳回：-2完成
	 * @param start
	 * @param limit
	 * @param status
	 * @return
	 */
	public List<JoinOrders> getJoinOrderByStatus (Integer start, Integer limit, Integer status, long id);
	/**
	 * 4.5根据状态码查询当前登录用户各种状态的加盟返点订单的总数
	 * status：0审核中（默认状态）：1通过：-1驳回：-2完成
	 * @param id
	 * @param status
	 * @return
	 */
	public long getCountByStatus (long id, Integer status);
	/**
	 * 4.6根据订单号查询该订单user的数量
	 * @param id
	 * @return
	 */
	public long getJoinOrderDetailCount (long joinorderid);
	/**
	 * 4.7.判断加盟订单的状态是否为X,
	 * @param id
	 * @param status
	 * @return
	 */
	public JoinOrders getJoinOrderByStatusAndId (long id, Integer status);
	/**
	 * 4.8.仅仅根据不同状态遍历订单
	 * @param start
	 * @param limit
	 * @param status
	 * @return
	 */
	public Object getAllJoinOrderByStatus (Integer start, Integer limit, Integer status);
	/**
	 * 4.9查询不同状态下订单的数量
	 * @param status
	 * @return
	 */
	public long getCountJoinOrderByStatus (Integer status);
	
}
