package org.controller;

import javax.servlet.http.HttpSession;

import org.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PriceCotroller {
	
	@Autowired
	private PriceService pDao;
	
	@RequestMapping("/updatePrice")
	@ResponseBody
	public Object updatePrice (long id, Double price) {
		return pDao.updatePrice(id, price); 
	}
	
	@RequestMapping("/getPriceList")
	@ResponseBody
	public Object getPriceList () {
		return pDao.getPriceList();
	}
	
	@RequestMapping("/getPrice")
	@ResponseBody
	public Object getPrice (HttpSession session) {
		return pDao.getPrice(session);
	}
}
