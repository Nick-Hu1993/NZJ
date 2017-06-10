package org.controller;

import javax.servlet.http.HttpServletRequest;

import org.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticleController {
	@Autowired
	private ArticleService aService;

	@RequestMapping("/addArticle")
	@ResponseBody
	public Object publish(HttpServletRequest request, String title,
			String digest, String content) throws Exception {

		return aService.addArticle(request, title, digest, content);
	}

	@RequestMapping("/getArticleList")
	@ResponseBody
	public Object getArticleList(Integer start, Integer limit) throws Exception {
		return aService.getArticleList(start, limit);
	}

	@RequestMapping("/deleteArticle")
	@ResponseBody
	public Object deleteArticle(HttpServletRequest request, Long id)
			throws Exception {
		return aService.deleteArticle(request, id);
	}

	@RequestMapping("/getSearchArticleList")
	@ResponseBody
	public Object getSearchArticleList(String key, Integer start, Integer limit)
			throws Exception {
		return aService.getSearchArticleList(key, start, limit);
	}
	
	@RequestMapping("/updateArticle")
	@ResponseBody
	public Object updateArticle(long id,String title,String digest)throws Exception{
		return aService.updateArticle(id, title, digest);
	}
}
