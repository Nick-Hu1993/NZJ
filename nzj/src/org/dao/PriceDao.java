package org.dao;

import java.util.List;

import org.model.Price;

public interface PriceDao {
	//-----------------------------------改---------------------------------------
	/**
	 * 3.1修改各个等级的价格（仅管理员）
	 * @param p
	 * @return
	 */
	public boolean updatePrice (long id, Double price);
	//-----------------------------------查---------------------------------------
	/**
	 * 4.1根据当前登录用户的userId确定其学员制证的费用
	 * @param id
	 * @return
	 */
	public Double getPrice (long userId);
	/**
	 * 4.2遍历所有等级加盟商的价格（仅管理员）
	 * @return
	 */
	public List<Price> getPriceList ();
	/**
	 * 4.3通过rank值获取当前用户制证的的单价
	 * ps：员工不可用（用户专用）
	 * @param id
	 * @return
	 */
	public Double getPriceByRank (Integer rank);
}
