package org.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.Form.SupportTrackingForm;
import org.dao.SupportTrackingDao;
import org.dao.UserDetailDao;
import org.model.SupportTracking;
import org.service.SupportTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.ChangeTime;
import org.tool.GetUserId;
import org.tool.JsonObject;

@Service
public class SupportTrackingServiceImp implements SupportTrackingService {
	@Autowired
	private SupportTrackingDao stDao;
	
	@Autowired
	private UserDetailDao udDao;

	@Override
	public Object addSupportTracking(HttpSession session, SupportTrackingForm stf, long id) { //时间戳在dao中已经转换了
		//获取加盟商user的id号(getUserId方法中已判定是否登录)
		stf.setuserId(GetUserId.getUserId(session));
		if (udDao.getUserDetailSupport(id)) {
			if (stDao.addSupportTracking(stf) == true) {
				return JsonObject.getResult(1, "添加成功", true);
			} else {
				return JsonObject.getResult(0, "添加失败", false);
			}
		} else {
			return JsonObject.getResult(0, "无需再次服务", false);
		}
	}

	@Override
	public Object deleteSupportTracking(Long[] id) {
		if (stDao.deleteSupportTracking(id) == true) {
			return JsonObject.getResult(1, "删除成功", true);
		} else {
			return JsonObject.getResult(0, "删除失败", false);
		}
	}

	@Override
	public Object updateSupportTranking(SupportTracking st, String time) {
		//将时间格式转换成时间戳存入javabean
		st.setTtime(Long.parseLong(ChangeTime.date2TimeStamp(time, "yyyy-MM-dd")));
		if (stDao.updateSupportTracking(st) == true) {
			return JsonObject.getResult(1, "修改成功", true);
		} else {
			return JsonObject.getResult(0, "修改失败", false);
		}
	}

	@Override
	public Object getSupportTrackingByStatus(HttpSession session, Integer start, Integer limit, Integer status) {
		Map<String, Object> map = new HashMap<String, Object>();
		//拿useId查总行数（需要先登录）
		long count = stDao.getCountByStatus(GetUserId.getUserId(session), status);
		List<SupportTracking> li  = stDao.getSupportTrackingByStatus(start, limit, status);
		map.put("count", count);
		map.put("result", li);
		return JsonObject.getResult(1, "获取不同阶段追踪标签", map);
	}

}
