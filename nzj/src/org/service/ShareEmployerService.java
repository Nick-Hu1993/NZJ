package org.service;

import javax.servlet.http.HttpSession;

import org.model.ShareEmployer;

public interface ShareEmployerService {
	/**
	 * 1添加共享的客户
	 * 
	 * @param session
	 * @param se
	 * @return
	 */
	public Object addShareEmployer(HttpSession session, ShareEmployer se);

	/**
	 * 2删除共享的客户
	 * 
	 * @param id
	 * @return
	 */
	public Object deleteShareEmployer(long id);

	/**
	 * 3修改共享的客户信息
	 * 
	 * @param se
	 * @return
	 */
	public Object updateShareEmployer(ShareEmployer se);

	/**
	 * 4查询已共享的客户列表
	 * 
	 * @param session
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getShareEmployerList(HttpSession session, Integer start,
			Integer limit);

	/**
	 * 5查询未共享的客户列表
	 * 
	 * @param session
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getUnShareEmployerList(HttpSession session, Integer start,
			Integer limit);

	/**
	 * 6共享客户
	 * 
	 * @param id
	 * @return
	 */
	public Object setShareEmployer(long id);

	/**
	 * 7取消共享客户
	 * 
	 * @param id
	 * @return
	 */
	public Object setUnShareEmployer(long id);

	/**
	 * 8查询全部已共享的客户列表
	 * 
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getAllShareEmployerList(Integer start, Integer limit);

	/**
	 * 9获取搜索后的共享列表
	 * 
	 * @param key
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getSearchShareEmployerList(String key, Integer start,
			Integer limit);

	/**
	 * 10获取本地的共享客户列表
	 * @param session
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getLocalShareEmployerList(HttpSession session, Integer start,
			Integer limit);
}
