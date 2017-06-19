package org.service.imp;

import java.util.Date;

import org.dao.OrderAccountDao;
import org.dao.OrderDao;
import org.model.OrderAccount;
import org.service.OrderAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.JsonObject;

@Service
public class OrderAccountServiceImp implements OrderAccountService {

	@Autowired
	private OrderAccountDao oaDao;
	
	@Autowired
	private OrderDao oDao;
	
	@Override
	public Object addOrderAccount(OrderAccount oa) {
		//只有当订单状态为1（审核通过）时才可创建订单
		if (oDao.getOrderTraineeByStatusAndId(oa.getOrderId(), 1)) {
			oa.setAtime(new Date().getTime());
			oaDao.addOrderAccount(oa);
			//账单创建后学员返点订单状态将变更为-2（已完成）状态
			oDao.updateOrderStatus(oa.getOrderId(), -2);
			return JsonObject.getResult(1, "添加成功", true);
		} else {
			return JsonObject.getResult(0, "订单未处理或已生成订单", false);
		}
	}

	@Override
	public Object deleteOrderAccount(long id) {
		if (oaDao.deleteOrderAccount(id)) {
			//账单删除后自动将订单回退到1（审核通过）状态
			oDao.updateOrderStatus(oaDao.getOrderIdById(id), 1);
			return JsonObject.getResult(1, "删除账单成功", true);
		} else {
			return JsonObject.getResult(0, "删除失败", false);
		}
	}

	@Override
	public Object updateOrderAccount(OrderAccount oa) {
		if (oaDao.updateOrderAccount(oa)) {
			return JsonObject.getResult(1, "修改成功", true);
		} else {
			return JsonObject.getResult(0, "修改失败", false);
		}
	}
}
