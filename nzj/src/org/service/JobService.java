package org.service;

import org.model.Job;

public interface JobService {
	/**
	 * 1添加岗位
	 * @param a
	 * @return
	 */
	public Object addJob(Job a);
	
	/**
	 * 2删除岗位
	 * @param id
	 * @return
	 */
	public Object deleteJob(long id);
	
	/**
	 * 3修改岗位
	 * @param a
	 * @return
	 */
	public Object updateJob(Job a);
	
	/**
	 * 4获取岗位列表
	 * @return
	 */
	public Object getJobList();
}
