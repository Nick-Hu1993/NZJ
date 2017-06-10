package org.dao;

import java.util.List;

import org.model.ShareEmployer;

public interface ShareEmployerDao {
	// -----------------------------------增---------------------------------------
	/**
	 * 1.1添加共享客户信息
	 * 
	 * @param se
	 * @return
	 */
	public long addShareEmployer(ShareEmployer se);

	// -----------------------------------删---------------------------------------
	/**
	 * 2.1删除共享客户信息
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteShareEmployer(long id);

	// -----------------------------------改---------------------------------------
	/**
	 * 3.1修改共享客户信息
	 * 
	 * @param se
	 * @return
	 */
	public boolean updateShareEmployer(ShareEmployer se);

	/**
	 * 3.2修改共享状态，share为0表示取消共享，为1表示共享
	 * 
	 * @param id
	 * @param share
	 * @return
	 */
	public boolean setShareEmployer(long id, Integer share);

	// -----------------------------------查---------------------------------------
	/**
	 * 4.1根据共享字段查询当前用户的客户信息，share为0表示取消共享的，share为1表示正在共享的
	 * 
	 * @param share
	 * @param start
	 * @param limit
	 * @param userId
	 * @return
	 */
	public List getShareEmployerList(Integer share, Integer start,
			Integer limit, Long userId);

	/**
	 * 4.2获取全部的已共享的客户列表
	 * 
	 * @param share
	 * @param start
	 * @param limit
	 * @return
	 */
	public List getAllShareEmployerList(Integer share, Integer start,
			Integer limit);

	/**
	 * 4.3获取自己的共享的或未共享的列表数目
	 * 
	 * @param userId
	 * @param share
	 * @return
	 */
	public Long getShareEmployerCount(Long userId, Integer share);

	/**
	 * 4.4获取全部共享的数目
	 * 
	 * @param share
	 * @return
	 */
	public Long getAllShareEmployerCount(Integer share);

	/**
	 * 4.5根据搜索框的内容，从已共享的列表中搜索有关的字段
	 * 
	 * @param key
	 * @param start
	 * @param limit
	 * @return
	 */
	public List getSearchShareEmployerList(String key, Integer start,
			Integer limit);

	/**
	 * 4.6获取搜索结果的总数
	 * 
	 * @param key
	 * @return
	 */
	public Long getSearchShareEmployerCount(String key);

	/**
	 * 4.7获取某地区的共享客户列表
	 * @param share
	 * @param address
	 * @param start
	 * @param limit
	 * @return
	 */
	public List<ShareEmployer> getLocalShareEmployerList(Integer share,
			String address, Integer start, Integer limit);
	
	/**
	 * 4.8获取某地区的共享客户总数
	 * @param share
	 * @param address
	 * @return
	 */
	public long getLocalShareEmployerCount(Integer share,String address);
}
