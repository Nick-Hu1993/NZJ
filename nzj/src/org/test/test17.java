package org.test;

import org.dao.OrderAccountDao;
import org.dao.imp.OrderAccountDaoImp;
import org.model.OrderAccount;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.bcel.internal.generic.NEW;

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
//		System.out.println(oaDao.deleteOrderAccount(5l));
//		try {
//			System.out.println(new ObjectMapper().writeValueAsString(oaDao.getOrderAccountListById(1L)));
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			System.out.println(new ObjectMapper().writeValueAsString(oaDao.getCountById(1L)));
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			System.out.println(new ObjectMapper().writeValueAsString(oaDao.getOrderAccountListByOrderId(54L)));
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
