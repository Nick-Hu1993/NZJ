package org.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.model.Board;
import org.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class BoardController {
	@Autowired
	private BoardService bService;

	@RequestMapping("/addBoard")
	@ResponseBody
	public Object addBoard(HttpServletRequest request, Board b,
			@RequestParam("file") CommonsMultipartFile file)
			throws IllegalStateException, IOException {

		return bService.addBoard(request, b, file);
	}

	@RequestMapping("/deleteBoard")
	@ResponseBody
	public Object deleteBoard(HttpServletRequest request, Long id)
			throws Exception {
		return bService.deleteBoard(request, id);
	}

	@RequestMapping("/updateBoard")
	@ResponseBody
	public Object updateBoard(Long id, String title, String description)
			throws Exception {
		return bService.updateBoard(id, title, description);
	}

	@RequestMapping("/getBoardList")
	@ResponseBody
	public Object getBoardList(HttpSession session,Integer start, Integer limit) throws Exception {
		return bService.getBoardList(session,start, limit);
	}

	@RequestMapping("/getSearchBoardList")
	@ResponseBody
	public Object getSearchBoardList(HttpSession session,String key, Integer start, Integer limit)
			throws Exception {
		System.out.println("	key:"+key);
		return bService.getSearchBoardList(session,key, start, limit);
	}
}
