package org.service;

import java.text.ParseException;

import javax.servlet.http.HttpSession;

import org.model.ShareAunt;

public interface ShareAuntService {
	/**
	 * 1添加共享的阿姨
	 * 
	 * @param sa
	 * @return
	 */
	public Object addShareAunt(HttpSession session, ShareAunt sa);

	/**
	 * 2删除共享的阿姨
	 * 
	 * @param id
	 * @return
	 */
	public Object deleteShareAunt(long id);

	/**
	 * 3修改共享的阿姨信息
	 * 
	 * @param sa
	 */
	public Object updateShareAunt(ShareAunt sa);

	/**
	 * 4查询自己已共享的阿姨列表
	 * 
	 * @param session
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getShareAuntList(HttpSession session, Integer start,
			Integer limit);

	/**
	 * 5查询自己未共享的阿姨列表
	 * 
	 * @param session
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getUnShareAuntList(HttpSession session, Integer start,
			Integer limit);

	/**
	 * 6共享某个阿姨
	 * 
	 * @param id
	 * @return
	 */
	public Object setShareAunt(long id);

	/**
	 * 7取消共享某个阿姨
	 * 
	 * @param id
	 * @return
	 */
	public Object setUnShareAunt(long id);

	/**
	 * 8查询全部已共享的阿姨列表
	 * 
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getAllShareAuntList(Integer start, Integer limit);

	/**
	 * 9获取搜索后的共享列表
	 * 
	 * @param key
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getSearchShareAuntList(String key, Integer start,
			Integer limit);

	/**
	 * 10获取本地的共享阿姨列表
	 * 
	 * @param sessions
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getLocalShareAuntList(HttpSession session, Integer start,
			Integer limit);
	/**
	 * 11.以时间区间遍历阿姨分享数据
	 * @param stime
	 * @param etime
	 * @param share
	 * @param start
	 * @param limit
	 * @return
	 * @throws ParseException 
	 */
	public Object getShareAuntListByTime (String stime, String etime, Integer share, Integer start, Integer limit) throws ParseException;
}
