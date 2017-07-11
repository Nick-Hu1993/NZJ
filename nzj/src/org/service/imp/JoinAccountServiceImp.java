package org.service.imp;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.dao.JoinAccountDao;
import org.dao.JoinOrderDao;
import org.model.JoinAccount;
import org.model.JoinOrders;
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
		JoinOrders jo = joDao.getJoinOrderByStatusAndId(ja.getJoinId(), 1);
		if (jo != null) {
			ja.setAtime(new Date().getTime());
			//账单创建后加盟返点订单的状态变更为-2（已完成）状态
			jaDao.addJoinAccount(ja, -2);
//			joDao.updateJoinOrderStatus(-2, ja.getJoinId());
			return JsonObject.getResult(1, "添加成功", true);
		} else {
			return JsonObject.getResult(0, "订单未处理或已生成订单", false);
		}
	}

	@Override
	public Object deleteJoinAccount(long id) {
		//账单删除后订单退回到1（审核通过状态）
		if (jaDao.deleteJoinAccount(id, jaDao.getJoinOrderIdById(id), 1)) {
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

	@Override
	public Object getJoinOrderAndAccountByUserId(Integer start, Integer limit,
			long userid) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("JoingOrderAccountList", jaDao.getJoinOrderAndAccountByUserId(start, limit, userid));
		map.put("count", jaDao.getCountByUserId(userid));
		return JsonObject.getResult(1, "订单/账单列表", map);
	}

}
