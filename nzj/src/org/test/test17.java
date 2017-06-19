package org.test;

import org.dao.OrderAccountDao;
import org.dao.imp.OrderAccountDaoImp;
import org.model.OrderAccount;
import java.util.Date;


public class test17 {
	public static void main(String[] args) {
		OrderAccountDao oaDao = new OrderAccountDaoImp();
//		OrderAccount oa = new OrderAccount();
//		oa.setAtime(new Date().getTime());
//		oa.setCityprice(1100.78);
//		oa.setOrderId(60L);
//		oa.setPrepare("镜香");
//		oa.setProvinceprice(2500.22);
//		oa.setQuantity(35.00);
//		oa.setId(5l);
//		System.out.println(oaDao.addOrderAccount(oa));
//		System.out.println(oaDao.updateOrderAccount(oa));
		System.out.println(oaDao.deleteOrderAccount(5l));
	}
}
