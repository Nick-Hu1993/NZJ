package org.service;

import javax.servlet.http.HttpSession;

import org.model.Orders;

public interface OrderService {
	/**
	 * 1添加订单
	 * @param o
	 * @return
	 */
	public Object addOrder(HttpSession session,Orders o);
}
