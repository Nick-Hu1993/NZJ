package org.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.Board;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public interface BoardService {
	/**
	 * 1添加公告
	 * 
	 * @param b
	 * @return
	 */
	public Object addBoard(HttpServletRequest request, Board b,
			@RequestParam("file") CommonsMultipartFile file)
			throws IllegalStateException, IOException;

	/**
	 * 2删除公告
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Object deleteBoard(HttpServletRequest request,Long id) throws Exception;

	/**
	 * 3修改公告主题和描述
	 * @param id
	 * @param title
	 * @param description
	 * @return
	 * @throws Exception
	 */
	public Object updateBoard(Long id, String title, String description)
			throws Exception;

	/**
	 * 4获取公告列表
	 * @param start
	 * @param limit
	 * @return
	 * @throws Exception
	 */
	public Object getBoardList(HttpSession session,Integer start, Integer limit) throws Exception;
	/**
	 * 5获取搜索后的共享列表
	 * @param key
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getSearchBoardList(HttpSession session,String key,Integer start,Integer limit);
}
