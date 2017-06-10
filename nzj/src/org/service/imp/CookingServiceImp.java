package org.service.imp;

import java.util.List;

import org.dao.CookingDao;
import org.model.Cooking;
import org.service.CookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.JsonObject;

@Service
public class CookingServiceImp implements CookingService{
	@Autowired
	private CookingDao cDao;
	
	@Override
	public Object addCooking(Cooking a) {
		if(cDao.addCooking(a)!=-1)
			return JsonObject.getResult(1, "添加烹饪成功", true);
		else
			return JsonObject.getResult(0, "添加烹饪失败", false);
	}

	@Override
	public Object deleteCooking(long id) {
		if(cDao.deleteCooking(id))
			return JsonObject.getResult(1, "删除烹饪成功", true);
		else
			return JsonObject.getResult(0, "删除烹饪成功", false);
	}

	@Override
	public Object updateCooking(Cooking a) {
		if(cDao.updateCooking(a))
			return JsonObject.getResult(1, "修改烹饪成功", true);
		else
			return JsonObject.getResult(0, "修改烹饪成功", false);
	}

	@Override
	public Object getCookingList() {
		List li = cDao.getCookingList();
		return JsonObject.getResult(1, "获取烹饪列表", li);
	}

}
