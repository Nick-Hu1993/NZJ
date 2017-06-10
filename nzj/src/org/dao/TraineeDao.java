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
	public long addTrainee(Trainee o);
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
	 * @param o
	 * @return
	 */
	public boolean updateTrainee (Trainee o);
	/**
	 * 3.1修改学员缴费状态
	 * @param id
	 * @param pay
	 * @return
	 */
	public boolean updateTraineePay (long id, Integer pay);
	//-----------------------------------查---------------------------------------	
	/**
	 * 4.1根据学员缴费状态遍历学员
	 * @param start
	 * @param limit
	 * @param pay
	 * @param user_id
	 * @return
	 */
	public List<Trainee> geTraineesListByPay (Integer start, Integer limit, Integer pay, long user_id);
	
}
