package org.dao;

import java.util.List;

import org.model.Trainee;

public interface TraineeDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加学员
	 * @param o
	 * @return
	 */
	public long addTrainee(Trainee t);
	//-----------------------------------删---------------------------------------
	/**
	 * 2.1删除学员（可批量）
	 * @param id
	 * @return
	 */
	public boolean deleteTrainee (long[] id);
	//-----------------------------------改---------------------------------------
	/**
	 * 3.1修改学员信息
	 * @param t
	 * @return
	 */
	public boolean updateTrainee (Trainee t);
	/**
	 * 3.1修改学员缴费状态
	 * @param id
	 * @param pay
	 * @return
	 */
	public boolean updateTraineePay (long id, Integer pay);
	/**
	 * 3.2修改学员绑定订单的状态
	 * 只要被被加入订单中就会将状态0（未绑定订单）改为1（已绑定订单）
	 * @param id
	 * @param bind
	 * @return
	 */
	public boolean upadteTraineebind (long[] id, Integer bind);
	//-----------------------------------查---------------------------------------	
	/**
	 * 4.1根据学员缴费状态遍历学员
	 * pay：0:未付1：已付
	 * @param start
	 * @param limit
	 * @param pay
	 * @param user_id
	 * @return
	 */
	public List<Trainee> getTraineesListByPay (Integer start, Integer limit, Integer pay, long user_id);
	/**
	 * 4.2根据是否绑定定单遍历学员
	 * ps：即是否申请制证
	 * @param start
	 * @param limit
	 * @param bind
	 * @param user_id
	 * @return
	 */
	public List<Trainee> getTraineeListByBind (Integer start, Integer limit, Integer bind, long user_id);
	/**
	 * 4.3根据支付状态查询当前用户的学员数量
	 * pay：0:未付1：已付
	 * @param pay
	 * @param user_id
	 * @return
	 */
	public long getCountByPay (Integer pay, long user_id);
	/**
	 * 4.4根据是否申请制证查询学员数量
	 * 注意：已经申请制证的学员不可添加到新的订单中
	 * @param bind
	 * @param user_id
	 * @return
	 */
	public long getCountByBind (Integer bind, long user_id);
	/**
	 * 4.5遍历当前用户的的所有学员
	 * @param start
	 * @param limit
	 * @param id
	 * @return
	 */
	public List<Trainee> getTraineeById (Integer start, Integer limit, long id);
	/**
	 * 4.5查询当前用户下学员的总数
	 * @param id
	 * @return
	 */
	public long getCountById (long id);
	/**
	 * 4.6获取所有学员信息（仅管理员）
	 * @param start
	 * @param Integer
	 * @return
	 */
	public List<Trainee> getTraineeList (Integer start, Integer limit);
	/**
	 * 4.7获取所有学员总数（仅管理员）
	 * @return
	 */
	public long getCount (); 
	/**
	 * 4.8获取被添加到订单中学员的状态
	 * ps：当状态为0时，可正常加入订单
	 * 	      当状态为1时，代表该学员已经绑定其它订单
	 * @param id
	 * @return
	 */
	public List<Integer> getTraineeStatus (long[] id);
}
