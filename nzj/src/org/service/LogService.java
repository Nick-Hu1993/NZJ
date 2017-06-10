package org.service;


public interface LogService {
	/**
	 * 1查询日志
	 * @param a
	 * @return
	 */
	public Object getLogList(Integer start, Integer limit);
}
