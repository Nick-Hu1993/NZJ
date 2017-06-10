package org.service;

import javax.servlet.http.HttpServletRequest;

public interface ArticleService {
	/**
	 * 1添加一篇文章
	 * @param request
	 * @param title
	 * @param digest
	 * @param content
	 * @return
	 */
	public Object addArticle(HttpServletRequest request, String title,
			String digest, String content);
	
	/**
	 * 2获取文章列表
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getArticleList(Integer start,Integer limit);
	
	/**
	 * 3删除文章
	 * @param id
	 * @return
	 */
	public Object deleteArticle(HttpServletRequest request,Long id);
	
	/**
	 * 4通过关键字查询文章
	 * @param key
	 * @param start
	 * @param limit
	 * @return
	 */
	public Object getSearchArticleList(String key,Integer start,Integer limit);
	
	/**
	 * 5修改文章标题和摘要
	 * @param id
	 * @param title
	 * @param digest
	 * @return
	 */
	public Object updateArticle(long id,String title,String digest);
}
