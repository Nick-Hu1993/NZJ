package org.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dao.SupportTypeDao;
import org.model.SupportType;
import org.service.SupportTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.JsonObject;

@Service
public class SupportTypeServiceImp implements SupportTypeService {
	@Autowired
	private SupportTypeDao stDao;

	@Override
	public Object addSuportType(SupportType st) {
		if (stDao.addSupportType(st) != -1) {
			return JsonObject.getResult(1, "添加成功", true);
		} else {
			return JsonObject.getResult(0, "添加失败", false);
		}
	}

	@Override
	public Object deleteSupportType(long id) {
		if (stDao.deleteSupportType(id) == true) {
			return JsonObject.getResult(1, "删除成功", true);
		} else {
			return JsonObject.getResult(0, "删除失败", false);
		}
	}

	@Override
	public Object updateSupportType(SupportType st) {
		if (stDao.updateSupportType(st) == true) {
			return JsonObject.getResult(1, "修改成功", true);
		} else {
			return JsonObject.getResult(0, "修改失败", false);
		}
	}

	@Override
	public Object getSupportTypeList(Integer start, Integer limit) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<SupportType> li = stDao.getSupporTypeList(start, limit);
		long count = stDao.getCount();
		map.put("result", li);
		map.put("count", count);
		return JsonObject.getResult(1, "加盟支持类型数据", map);
	}

}
