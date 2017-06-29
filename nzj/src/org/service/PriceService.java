package org.service;

import javax.servlet.http.HttpSession;

public interface PriceService {
	/**
	 * 1.修改各个等级的价格（仅管理员）
	 * @param p
	 * @return
	 */
	public Object updatePrice (long id, Double price);
	/**
	 * 2.遍历所有等级加盟商的价格（仅管理员）
	 * @return
	 */
	public Object getPriceList ();
	/**
	 * 3.根据用户id确认其制证单价
	 * @param userId
	 * @return
	 */
	public Object getPrice (HttpSession session);

}
