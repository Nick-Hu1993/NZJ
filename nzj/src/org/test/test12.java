package org.test;

import java.util.ArrayList;
import java.util.List;

/*
 * 测试加盟商的服务支持*/
public class test12 {
	public static void main(String[] args) {
		// SupportTrackingDao stDao = new SupportTrackingDaoImp();
		// Long[] ids = {8L, 5L};
		// System.out.println(stDao.deleteSupportTracking(ids));
		// SupportTrackingForm stf = new SupportTrackingForm();
		// SupportTracking st = new SupportTracking();
		// String[] ttime = {"2017-06-02", "2017-06-01", "2017-05-31",
		// "2017-05-30"};
		// String[] content = {
		// "今天的天气很好，你说是不是啊。",
		// "我就是最帅的帅哥，你知道么，你就是个渣渣",
		// "这个世界没有做不成的事情只有坚持不了的人",
		// "企业必须要有坚定的信念，与明确的发展方向",
		// };
		// Integer[] status = {1, -1, -1, 1};
		// Integer[] typeId = {1, 5, 4, 6};
		// Long vuserId = 1L;
		// stf.setTtime(ttime);
		// stf.setContent(content);
		// stf.setStatus(status);
		// stf.setTypeId(typeId);
		// stf.setuserId(1L);

		// System.out.println(stDao.addSupportTracking(stf));
		// st.setContent("我现在要修改了哈哈");
		// st.setId(4L);
		// st.setStatus(1);
		// st.setVuserId(1L);
		// st.setTtime(1496246400L);
		// st.setTypeId(-1);
		// System.out.println(stDao.updateSupportTracking(st));
		// try {
		// System.out.println(new
		// ObjectMapper().writeValueAsString(stDao.getSupportTrackingByStatus(0,
		// 2, 1)));
		// System.out.println(stDao.getCountByStatus(1L, 1));
		// } catch (JsonProcessingException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		// SupportTrackingController stc = new SupportTrackingController();
		// Long[] id = {5L};
		// System.out.println(stc.deleteSupportTracking(id));
		// ModuleDao mDao = new ModuleDaoImp();
		// try {
		// System.err.println(new
		// ObjectMapper().writeValueAsString(mDao.getModuleListByStaffId(24L)));
		// } catch (JsonProcessingException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// };
		// List<Long> i = new ArrayList<Long>();
		// i.add(2L);
		// i.add(3L);
		// Long k = 2L;
		// System.out.println(i.contains(k));
		// ModuleDao mDao = new ModuleDaoImp();
		// List<Long> li = (List<Long>) mDao.getModuleListByStaffId(24L);
		// System.out.println("取出的权限是：" + li);
		// System.out.println("传来的权限是：" + 2L);
		// for (int i = 0; i <= li.size(); i++) {
		// if ("2L".equals(li.get(i))) {
		// System.out.println("在");
		// } else {
		// System.out.println("不在");
		// }
		// }
//		List<Long> list = new ArrayList<Long>();
//		list.add(2L);
//		list.add(3L);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list[i]);
//		}
		List<Long> list = new ArrayList<Long>();
		list.add(2L);
		list.add(3L);
		System.out.println(list.contains(2L));
	}
}
