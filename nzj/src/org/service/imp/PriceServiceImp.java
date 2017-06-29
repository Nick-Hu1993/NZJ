package org.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.dao.PriceDao;
import org.model.Price;
import org.model.User;
import org.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.GetUserId;
import org.tool.JsonObject;

@Service
public class PriceServiceImp implements PriceService {
	
	@Autowired
	private PriceDao pDao;

	@Override
	public Object updatePrice(long id, Double price) {
		if (pDao.updatePrice(id, price)) {
			return JsonObject.getResult(1, "单价修改成功", true);
		} else {
			return JsonObject.getResult(0, "单价修改失败", false);
		}
	}

	@Override
	public Object getPriceList() {
		Map<String, Object> map = new HashMap<String, Object>();
		List<Price> li = pDao.getPriceList();
		map.put("price", li);
		return JsonObject.getResult(1, "所有单价数据", map);
	}

	@Override
	public Object getPrice(HttpSession session) {
		Long userId = GetUserId.getUserId(session);
		Map<String, Object> map = new HashMap<String, Object>();
		if (userId != null) {
			Double price = pDao.getPrice(userId);
			map.put("price", price);
			return JsonObject.getResult(1, "制证单价", map);
		} else {
			return JsonObject.getResult(0, "单价获取失败", false);
		}
	}
}