package org.dao;

import java.util.List;

import org.model.Help;

public interface HelpDao {
	//-----------------------------------增--------------------------------------
	/**
	 * 1.1添加求助单
	 * @param h
	 * @return
	 */
	public long addHelp (Help h);
	//-----------------------------------删--------------------------------------
	/**
	 * 2.1根据id号删除求助单（仅管理员）
	 * @param id
	 * @return
	 */
	public boolean deleteHelp (long id);
	//-----------------------------------改--------------------------------------
	/**
	 * 3.1更改求助单状态码
	 * "-1:已完成（提交人已查看）0：待处理 1：已处理（提交人未查看）"
	 * @param id
	 * @param status
	 * @return
	 */
	public boolean updateHelpStatus (long id, Integer status);
	//-----------------------------------查--------------------------------------
	/**
	 * 4.1根据不同状态码查询不同状态的求助单
	 * "-1:已完成（提交人已查看）0：待处理 1：已处理（提交人未查看）"
	 * @param start
	 * @param limit
	 * @param userId
	 * @param status
	 * @return
	 */
	public List<Help> getHelpListByStatus (Integer start, Integer limit, Long userId, Integer status);
	/**
	 * 4.2根据不同状态码查询所有不同状态的求助单（仅总部）
	 * "-1:已完成（提交人已查看）0：待处理 1：已处理（提交人未查看）"
	 * @param start
	 * @param limit
	 * @param status
	 * @return
	 */
	public List<Help> getHelpListByStatus1 (Integer start, Integer limit, Integer status);
	/**
	 * 4.3通过addHelp()返回的id查询Identifier（唯一标识码）
	 * 作用：添加帮助单之后返回用户一个单号
	 * 配合addHelp使用
	 * @param id
	 * @return
	 */
	public String getIdentifierByid (long id);
	/**
	 * 4.4获取每种状态求助单的数量
	 * @param uerId
	 * @param status
	 * @return
	 */
	public long getCountByStatus (Long userId, Integer status);
	/**
	 * 4.5根据求助单的状态查询帮助信息的总数量
	 * @return
	 */
	public long getAllCountByStatus (Integer status);
	/**
	 * 4.6使用唯一标识符快速查找工单
	 * @param identifier
	 * @return
	 */
	public Help getHelpByIdentifier (String identifier);
	
}
