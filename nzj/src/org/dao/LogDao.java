package org.dao;

import java.util.List;

import org.model.Log;

public interface LogDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加日志
	 * @param l
	 * @return
	 */
	public long addLog(Log l);
	//-----------------------------------删---------------------------------------
	//-----------------------------------改---------------------------------------
	//-----------------------------------查---------------------------------------
	/**
	 * 4.1获取日志列表，视图形
	 * @param start
	 * @param limit
	 * @return
	 */
	public List getLogList(Integer start,Integer limit);
	/**
	 * 4.2获取日志数量
	 * @return
	 */
	public long getLogCount();
}
