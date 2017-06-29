package org.dao;

import java.util.List;

import org.model.Amount;
import org.view.VUserUserdetailAmount;

public interface AmountDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1创建账户
	 * @param a
	 * @return
	 */
	public long addAmount (Amount a);
	//-----------------------------------删---------------------------------------
	//-----------------------------------改---------------------------------------
	/**
	 * 3.1订单提交时的扣款/充值
	 * @param Balance
	 * @return
	 */
	public boolean updateAmountBalance (Double Balance, long id);
	//-----------------------------------查---------------------------------------
	/**
	 * 4.1查看所有账户情况(仅管理员)
	 * @param start
	 * @param limit
	 * @return
	 */
	public List<VUserUserdetailAmount> getAmountList (Integer start, Integer limit);
	/**
	 * 4.2查询当前用户的账户余额
	 * @param id
	 * @return
	 */
	public Double getAmount (long id);
}
