//package org.test;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.dao.UserDao;
//import org.dao.UserLinkDao;
//import org.dao.imp.UserDaoImp;
//import org.dao.imp.UserLinkDaoImp;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
///*
// *测试SupportTypeDao*/
//public class test11 {
//	public static void main(String[] args) {
////		SupportTypeDao stDao = new SupportTypeDaoImp();
////		SupportType st = new SupportType();
////		st.setName("上门叫鸭");
////		System.out.println(stDao.addSupportType(st));
////		st.setName("地下室叫老男人");
////		st.setId(11L);
////		System.out.println(stDao.updateSupportType(st));
////		try {
////			System.out.println(new ObjectMapper().writeValueAsString(stDao.getSupporTypetListByStatus(5, 5)));
////		} catch (JsonProcessingException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		};
////		System.out.println(stDao.deleteSupportType(11L));
////		List<Long> k = new ArrayList<>();
////		k.add(5L);
////		k.add(4L);
////		k.add(7L);
////		Iterator it = k.iterator();
////		while(it.hasNext()) {
////		  System.out.println(it.next());
////		}
////		UserLinkDao ulDao = new UserLinkDaoImp();
////		try {
////			System.out.println(new ObjectMapper().writeValueAsString(ulDao.getChildByParent(12)));
////		} catch (JsonProcessingException e) {
////			e.printStackTrace();
////		}
////		UserDao uDao = new UserDaoImp();
////		try {
////			System.out.println(new ObjectMapper().writeValueAsString(uDao.getVUserListByRank(2)));
////		} catch (JsonProcessingException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		};
////		Map<Long, Object> map = new HashMap<Long, Object>();
////		int[] a = {1,2,3,4,5,6};
////		map.put(11L, a);
////		System.out.println(map);
//		UserLinkDao ulDao = new UserLinkDaoImp();
//		Long[] parent = {1L, 12L};
//		try {
////			System.out.println(new ObjectMapper().writeValueAsString(ulDao.getChildByParent(0, 15, parent)));
////		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		};
//	}
//}
