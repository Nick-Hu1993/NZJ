package org.test;

import org.dao.OrderDao;
import org.dao.imp.OrderDaoImp;
import org.model.Orders;
import org.tool.ChangeTime;

public class test16 {

	public static void main(String[] args) {
		OrderDao oDao = new OrderDaoImp();
		long[] ids = {56L,57L };
//		System.out.println(oDao.deletOrder(ids));
		Orders o = new Orders();
		o.setPreparer("马三立");
		o.setPhone("13595623458");
		o.setStatus(0);
		o.setTime(Long.parseLong(ChangeTime.date2TimeStamp("2017-05-12", "yyyy-MM-dd")));
		o.setUserId(1L);
		System.out.println(oDao.addOrder(o, ids));
	}
}
