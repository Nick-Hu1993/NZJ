package org.dao;

import java.util.List;

import org.model.Job;

public interface JobDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加岗位
	 * @param l
	 * @return
	 */
	public long addJob(Job l);
	//-----------------------------------删---------------------------------------
	/**
	 * 2.1删除岗位
	 * @param id
	 * @return
	 */
	public boolean deleteJob(long id);
	//-----------------------------------改---------------------------------------
	/**
	 * 3.1修改岗位
	 * @param l
	 * @return
	 */
	public boolean updateJob(Job l);
	/**
	 * 3.2修改阿姨的岗位信息
	 * @param AuntId
	 * @param joId
	 * @return
	 */
	public boolean updateJobByAuntId(long AuntId,long[] joId);
	//-----------------------------------查---------------------------------------
	/**
	 * 4.1查询岗位
	 * @return
	 */
	public List getJobList();
	/**
	 * 4.2通过阿姨的id查出会的所有的岗位
	 * @param auntId
	 * @return
	 */
	public List getJobByAuntId(long auntId);
}
