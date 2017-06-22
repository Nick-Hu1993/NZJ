package org.service.imp;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.dao.JoinAccountDao;
import org.dao.JoinOrderDao;
import org.model.JoinAccount;
import org.service.JoinAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.JsonObject;
import org.tool.readProperties;

@Service
public class JoinAccountServiceImp implements JoinAccountService {
	
	@Autowired
	private JoinAccountDao jaDao;
	
	@Autowired
	private JoinOrderDao joDao;

	@Override
	public Object addJoinAccount(JoinAccount ja) {
		//只有当订单状态为1时（订单审核通过）才可创建账单
		if (joDao.getJoinOrderByStatusAndId(ja.getJoinId(), 1)) {
			ja.setAtime(new Date().getTime());
			jaDao.addJoinAccount(ja);
			//账单创建后加盟返点订单的状态变更为-2（已完成）状态
			joDao.updateJoinOrderStatus(-2, ja.getJoinId());
			return JsonObject.getResult(1, "添加成功", true);
		} else {
			return JsonObject.getResult(0, "订单未处理或已生成订单", false);
		}
	}

	@Override
	public Object deleteJoinAccount(long id) {
		if (jaDao.deleteJoinAccount(id)) {
			//账单删除后订单退回到1（审核通过状态）
			joDao.updateJoinOrderStatus(1, jaDao.getJoinOrderIdById(id));
			return JsonObject.getResult(1, "删除成功", true);
		} else {
			return JsonObject.getResult(0, "删除失败", false);
		}
	}

	@Override
	public Object updateJoinAccount(JoinAccount ja) {
		if (jaDao.updateJoinAccount(ja)) {
			return JsonObject.getResult(1, "修改成功", true);
		} else {
			return JsonObject.getResult(0, "修改失败", false);
		}
	}

	@Override
	public Object getJoinAccountByJoinId(long joinid) {
		JoinAccount ja = jaDao.getJoinAccountByJoinAccountId(joinid);
		if (ja != null) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("JoinAccount", ja);
			return JsonObject.getResult(1, "账单详情", map);
		} else {
			return JsonObject.getResult(0, "此订单无账单详情", false);
		}
	}

}
