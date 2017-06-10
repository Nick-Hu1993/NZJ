package org.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.model.Help;

public interface HelpService {
	/**
	 * 1.添加求助单，默认状态码为0：未处理
	 * @param h
	 * @return
	 */
	public Object addHelp (HttpSession session, Help h);
	/**
	 * 2.根据id号删除求助单（仅限管理员）
	 * @param id
	 * @return
	 */
	public Object deleteHelp (long id);
	/**
	 * 3.更改求助单状态码
	 * "-1:已完成（提交人已查看）0：待处理 1：已处理（提交人未查看）"
	 * id:求助单的id
	 * @param id
	 * @param status
	 * @return
	 */
	public Object updateHelpStatus (long id, Integer status);
	/**
	 * 4.根据不同状态码查询不同状态的求助单
	 * "-1:已完成（提交人已查看）0：待处理 1：已处理（提交人未查看）"
	 * @param start
	 * @param limit
	 * @param userId
	 * @param status
	 * @return
	 */
	public Object getHelpListByStatus (HttpSession session, Integer start, Integer limit, Integer status);
	/**
	 * 5.根据不同状态码查询所有不同状态的求助单（仅总部：不区分用户id）
	 * "-1:已完成（提交人已查看）0：待处理 1：已处理（提交人未查看）"
	 * @param start
	 * @param limit
	 * @param status
	 * @return
	 */
	public Object getAllHelpListByStatus (Integer start, Integer limit, Integer status);
	/**
	 * 6.使用唯一标识符快速查找工单
	 * @param identifier
	 * @return
	 */
	public Object getHelpByIdentifier (String identifier);

}
