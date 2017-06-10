package org.dao;

import java.util.List;

import org.model.ShareAunt;

public interface ShareAuntDao {
	// -----------------------------------增---------------------------------------
	/**
	 * 1.1添加共享阿姨信息
	 * 
	 * @param sa
	 * @return
	 */
	public long addShareAunt(ShareAunt sa);

	// -----------------------------------删---------------------------------------
	/**
	 * 2.1删除共享阿姨信息
	 * 
	 * @param id
	 * @return
	 */
	public boolean deleteShareAunt(long id);

	// -----------------------------------改---------------------------------------
	/**
	 * 3.1修改共享阿姨信息
	 * 
	 * @param sa
	 * @return
	 */
	public boolean updateShareAunt(ShareAunt sa);

	/**
	 * 3.2修改共享状态，share为0表示取消共享，为1表示共享
	 * 
	 * @param id
	 * @param share
	 * @return
	 */
	public boolean setShareAunt(long id, Integer share);

	// -----------------------------------查---------------------------------------
	/**
	 * 4.1根据共享字段查询阿姨信息，share为0表示取消共享的，share为1表示正在共享的
	 * 
	 * @param share
	 * @return
	 */
	public List getShareAuntList(Integer share, Integer start, Integer limit,
			Long userId);

	/**
	 * 4.2获取全部的已共享的阿姨列表
	 * 
	 * @param share
	 * @param start
	 * @param limit
	 * @return
	 */
	public List getAllShareAuntList(Integer share, Integer start, Integer limit);

	/**
	 * 4.3获取自己的共享或未共享的列表数目
	 * 
	 * @param userId
	 * @param share
	 * @return
	 */
	public Long getShareAuntCount(Long userId, Integer share);

	/**
	 * 4.4获取全部共享的数目
	 * 
	 * @param share
	 * @return
	 */
	public Long getAllShareAuntCount(Integer share);

	/**
	 * 4.5根据搜索框的内容，从已共享的列表中搜索有关的字段
	 * 
	 * @param key
	 * @return
	 */
	public List getSearchShareAuntList(String key, Integer start, Integer limit);

	/**
	 * 4.6获取搜索结果的总数
	 * 
	 * @param key
	 * @return
	 */
	public Long getSearchShareAuntCount(String key);

	/**
	 * 4.7获取某地区的共享阿姨列表
	 * 
	 * @param address
	 * @param start
	 * @param limit
	 * @return
	 */
	public List<ShareAunt> getLocalShareAuntList(Integer share, String address,
			Integer start, Integer limit);

	/**
	 * 4.8获取某地区的共享阿姨总数
	 * 
	 * @param address
	 * @return
	 */
	public long getLocalShareAuntCount(Integer share, String address);
}
