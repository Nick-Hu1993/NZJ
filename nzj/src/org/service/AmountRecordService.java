package org.service;

import java.util.List;

import javax.servlet.http.HttpSession;

public interface AmountRecordService {
	/**
	 * 1.根据用户的id号查询其消费记录（管理员）
	 * @param start
	 * @param limit
	 * @param id
	 * @return
	 */
	public Object getAmountRcordList (Integer start, Integer limit, long id);
	/**
	 * 2.获取当前登录用户的消费记录
	 * @param start
	 * @param limit
	 * @param id
	 * @return
	 */
	public Object getAmountRcordById (HttpSession session, Integer start, Integer limit);
	/**
	 * 3.查询当前登录者的账户余额
	 * @param session
	 * @param userId
	 * @return
	 */
	public Object getBalanceByUserId (HttpSession session);
}
