package org.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dao.LogDao;
import org.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.JsonObject;

@Service
public class LogServiceImp implements LogService{
	@Autowired
	private LogDao lDao;
	
	@Override
	public Object getLogList(Integer start, Integer limit) {
		List li = lDao.getLogList(start, limit);
		long count= lDao.getLogCount();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", li);
		map.put("count", count);
		
		return JsonObject.getResult(1, "日志列表", map);
	}

}
