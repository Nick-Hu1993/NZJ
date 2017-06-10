package org.dao;

import java.util.List;

import org.model.Board;

public interface BoardDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加一条公告信息，同时将文件保存到服务器目录下
	 * @param b
	 * @return
	 */
	public long addBoard(Board b);
	//-----------------------------------删---------------------------------------
	/**
	 * 2.1通过id删除公告，同时删除本地文件
	 * @param id
	 * @return
	 */
	public boolean deleteBoard(long id);
	//-----------------------------------改---------------------------------------
	/**
	 * 3.1修改公告的标题和描述
	 * @param id
	 * @param title
	 * @param description
	 * @return
	 */
	public boolean updateBoard(Long id,String title,String description);
	//-----------------------------------查---------------------------------------
	/**
	 * 4.1获取全部的公告文件列表
	 * @param start
	 * @param limit
	 * @return
	 */
	public List getBoardList(Integer start, Integer limit);
	/**
	 * 4.2获取公告总数
	 * @return
	 */
	public Long getBoardCount();
	/**
	 * 4.3通过id查询公告文件的url
	 * @param id
	 * @return
	 */
	public String getUrlById(Long id);
	/**
	 * 4.4根据搜索框的内容，从公告文件列表中搜索有关的字段
	 * @param key
	 * @param start
	 * @param limit
	 * @return
	 */
	public List getSearchBoardList(String key,Integer start,Integer limit);
	/**
	 * 4.5获取搜索结果的总数
	 * @param key
	 * @return
	 */
	public Long getSearchBoardCount(String key);
}
