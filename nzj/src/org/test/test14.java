package org.test;

import org.dao.JoinOrderDao;
import org.dao.imp.JoinOrderDaoImp;
import org.model.JoinOrders;
import org.tool.ChangeTime;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test14 {
	public static void main(String[] args) {
		JoinOrderDao joDao = new JoinOrderDaoImp();
//		JoinOrders jo = new JoinOrders();
//		jo.setId(7L);
//		jo.setPerparer("王二麻子");
//		jo.setPhone("13146589877");
//		jo.setStatus(-1);
//		jo.setTime(Long.parseLong(ChangeTime.timeStamp()));
//		jo.setUserId(1L);
//		long[] id = {6L, 12L};
//		System.out.println(joDao.addJoninOrder (jo, id));
//		System.out.println(joDao.deleteJoinOrder(6L));
//		System.out.printl(joDao.updateJoinOrder(jo));
//		System.out.println(joDao.getAllContById(1L));
//		try {
//			System.out.println(new ObjectMapper().writeValueAsString(joDao.getAllJoinOrderById(0, 5, 1L)));
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			System.out.println(new ObjectMapper().writeValueAsString(joDao.getJoinOrderDetailByJoinorderid(null, null, 7L)));
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			System.out.println(new ObjectMapper().writeValueAsString(joDao.getAllContById(1L)));
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			System.out.println(new ObjectMapper().writeValueAsString(joDao.getJoinOrderByStatus(0, 5, -1, 1L)));
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			System.out.println(new ObjectMapper().writeValueAsString(joDao.getCountByStatus(1L, -1)));
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			System.out.println(new ObjectMapper().writeValueAsString(joDao.getJoinOrderDetailCount(7L)));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
