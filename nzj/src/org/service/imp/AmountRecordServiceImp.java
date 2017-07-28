package org.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.dao.AmountRecordDao;
import org.model.AmountRecord;
import org.service.AmountRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.GetUserId;
import org.tool.JsonObject;

@Service
public class AmountRecordServiceImp implements AmountRecordService {
	
	@Autowired
	private AmountRecordDao arDao;

	@Override
	public Object getAmountRcordList(Integer start,
			Integer limit, long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<AmountRecord> li = arDao.getAmountRecordList(start, limit, id);
		long count = arDao.getCount(id);
		map.put("AmountRecord", li);
		map.put("count", count);
		return JsonObject.getResult(0, "消费记录", map);
	}

	@Override
	public Object getAmountRcordById(HttpSession session, Integer start,
			Integer limit) {
		Map<String, Object> map = new HashMap<String, Object>();
		Long userId = GetUserId.getUserId(session);
		if (userId != null ) {
			List<AmountRecord> li = arDao.getAmountRecordList(start, limit, userId);
			long count = arDao.getCount(userId);
			map.put("AmountRecordList", li);
			map.put("count", count);
			return JsonObject.getResult(1, "当前用户消费记录", map);
		} else {
			return JsonObject.getResult(-999, "请先登录才可查看", false);
		}
	}

	@Override
	public Object getBalanceByUserId(HttpSession session) {
		if (arDao.getAmountByUserId(GetUserId.getUserId(session)) != null) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("balance", arDao.getAmountByUserId(GetUserId.getUserId(session)).getBalance());
			return JsonObject.getResult(1, "账户余额", map);
		} else {
			return JsonObject.getResult(0, "未开账户/账户余额查询失败", false);
		}
	}
	
}
