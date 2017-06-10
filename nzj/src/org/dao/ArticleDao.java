package org.dao;

import java.util.List;

import org.model.Article;

public interface ArticleDao {
	//-----------------------------------增---------------------------------------
	/**
	 * 1.1添加文章
	 * @param a
	 * @return
	 */
	public long addArticle(Article a);
	//-----------------------------------删---------------------------------------
	/**
	 * 2.1删除文章，并删除文件
	 * @param id
	 * @return
	 */
	public boolean deleteArticle(long id);
	//-----------------------------------改---------------------------------------
	/**
	 * 3.1修改文章的标题和摘要
	 * @param title
	 * @param digest
	 * @return
	 */
	public boolean updateArticle(long id,String title,String digest);
	//-----------------------------------查---------------------------------------
	/**
	 * 4.1通过id查询该文件的文件存储名
	 * @return
	 */
	public String getArticleFstrById(long id);
	/**
	 * 4.2获取文章列表
	 * @param start
	 * @param limit
	 * @return
	 */
	public List getArticleList(Integer start,Integer limit);
	/**
	 * 4.3获取文章总数
	 * @return
	 */
	public long getArticleCount();
	/**
	 * 4.4通过关键字搜索文章
	 * @param key
	 * @param start
	 * @param limit
	 * @return
	 */
	public List getSearchArticleList(String key,Integer start,Integer limit);
	/**
	 * 4.5获取通过关键字搜索后的总数
	 * @param key
	 * @return
	 */
	public long getSearchArticleCount(String key);
}
