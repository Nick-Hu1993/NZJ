package org.service.imp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.dao.AmountDao;
import org.dao.AmountRecordDao;
import org.dao.OrderDao;
import org.dao.PriceDao;
import org.dao.TraineeDao;
import org.dao.UserDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.AmountRecord;
import org.model.Orders;
import org.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tool.ChangeTime;
import org.tool.GetUserId;
import org.tool.JsonObject;
import org.util.HibernateSessionFactory;
import org.view.VOrderTraineedetail;

@Service
public class OrderServiceImp implements OrderService {
	@Autowired
	private OrderDao oDao;

	@Autowired
	private TraineeDao tDao;

	@Autowired
	private AmountDao aDao;
	
	@Autowired
	private UserDao uDao;

	// @Autowired
	// private PriceDao pDao;

	@Override
	public Object addOrder(HttpSession session,Orders o, Long[] TraineeId) {
		Long userId = GetUserId.getUserId(session);
		if (userId == null) {
			return JsonObject.getResult(-999, "请先登录", false);
		}
		AmountRecord ad = new AmountRecord();
		Double amount = aDao.getAmount(userId);// 查询账户余额
		// 使用在线支付&余额大于订单金额&学员的未绑定其它订单（即bind值为0）
		if (o.getPayment().equals(0) && amount > o.getTotal()
				&& !tDao.getTraineeStatus(TraineeId).contains(1)) {
			// 订单状态默认为0：审核中
			o.setStatus(0);
			// 设置学员数量,思前想后还是在前端计算更符合常规，不然用户无法立即看到所需要支付的金额
			// int i = TraineeId.length;
			// double d = i;
			// o.setQuantity(d);
			// 计算总价
			// o.setTotal(pDao.getPrice(userId) * d);
			// 获取订单生成时间
			o.setTime(Long.parseLong(ChangeTime.timeStamp()));
			//自动填写填表人
			o.setPreparer(uDao.getUserById(userId).getCompany());
			//自动填写联系人号码
			o.setPhone(uDao.getUserById(userId).getPhone().toString());
			// 设置订单所属于哪个用户
			o.setUserId(userId);
			// 将被添加进订单的学员的bind值设置成1：已绑定订单
			tDao.upadteTraineebind(TraineeId, 1);
			// 设置消费记录的参数：扣款时间
			ad.setTime(Long.parseLong(ChangeTime.timeStamp()));
			// 设置款项支付的用途
			ad.setDescription("学员制证费");
			// 设置消费记录的所有者
			ad.setUserId(userId);
			if (oDao.addOrder(o, TraineeId, ad)) {
				return JsonObject.getResult(1, "添加订单成功", true);
			} else {
				return JsonObject.getResult(0, "添加订单失败", false);
			}
		} else if (o.getPayment().equals(1)
				&& !tDao.getTraineeStatus(TraineeId).contains(1)) {
			// 1：线下支付:当前方式为线下支付
			System.out.println(o.getPayment().equals(1));
			// 订单状态默认为0：审核中
			o.setStatus(0);
			// 获取订单生成时间
			o.setTime(Long.parseLong(ChangeTime.timeStamp()));
			// 设置订单所属于哪个用户
			o.setUserId(userId);
			// 将被添加进订单的学员的bind值设置成1：已绑定订单
			tDao.upadteTraineebind(TraineeId, 1);
			oDao.addOrderByOfflion(o, TraineeId);
			return JsonObject.getResult(1, "订单添加成功", true);
		} else {
			return JsonObject.getResult(0, "支付方式选择有误或选取的学员已制证", false);
		}
	}

	@Override
	public Object deleteOrder(Long[] id) {
		// 订单删除后绑定状态初始化0（未绑定）
		tDao.upadteTraineebind(id, 0);
		if (oDao.deletOrder(id)) {
			return JsonObject.getResult(1, "订单删除成功", true);
		} else {
			return JsonObject.getResult(0, "订单删除失败", false);
		}
	}

	@Override
	public Object updateOrder(HttpSession session, Orders o) {
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			o.setUserId(userId);
			if (oDao.uptdateOrder(o)) {
				return JsonObject.getResult(1, "订单修改完成", true);
			} else {
				return JsonObject.getResult(0, "订单修改失败", false);
			}
		} else {
			return JsonObject.getResult(-99, "请先登录", false);
		}
	}

	@Override
	public Object updateOrderStatus(Integer status, long orderid) {
		if (oDao.updateOrderStatus(orderid, status) && status == 0
				|| status == 1 || status == -1 || status == -2) {
			return JsonObject.getResult(1, "状态修改成功", true);
		} else {
			return JsonObject.getResult(0, "参数非法", false);
		}
	}

	@Override
	public Object getOrderList(HttpSession session, Integer start, Integer limit) {
		Long userId = GetUserId.getUserId(session);
		if (userId != null) {
			List<Orders> li = oDao.getOrderListById(start, limit, userId);
			long count = oDao.getCount(userId);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("OrdersList", li);
			map.put("count", count);
			return JsonObject.getResult(1, "所有订单", map);
		} else {
			return JsonObject.getResult(-999, "请先登录", false);
		}
	}

	@Override
	public Object getOrderDetailByOrderid(Integer start, Integer limit,
			long orderid) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<VOrderTraineedetail> li = oDao.getOrderTaineeDetailByOrderid(
				start, limit, orderid);
		long count = oDao.getOrderTraineedetailCount(orderid);
		map.put("TraineeDetail", li);
		map.put("count", count);
		return JsonObject.getResult(1, "订单详情", map);
	}

	@Override
	public Object getOrderByStatus(HttpSession session, Integer start,
			Integer limit, Integer status) {
		Long userId = GetUserId.getUserId(session);
		if (userId != null && status == 0 || status == 1 || status == -1
				|| status == -2) {
			List<Orders> li = oDao.getOrderListByStatus(start, limit, status,
					userId);
			long count = oDao.getCountByStatus(userId, status);
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("OrderList", li);
			map.put("count", count);
			return JsonObject.getResult(1, "学员订单", map);
		} else {
			return JsonObject.getResult(-999, "未登录或状态码错误", false);
		}
	}

	@Override
	public Object getAllOrderByStatus(Integer start, Integer limit,
			Integer status) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("TraineeOrderList", oDao.getAllTraineeByStatus(start, limit, status));
		map.put("count", oDao.getAllCountByStatus(status));
		return JsonObject.getResult(1, "学员订单列表", map);
	}
}
