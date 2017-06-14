package org.test;

import java.sql.Date;

import org.dao.TraineeDao;
import org.dao.imp.TraineeDaoImp;
import org.model.Trainee;

public class test15 {
	public static void main(String[] args) {
		Trainee t = new Trainee();
		TraineeDao tDao = new TraineeDaoImp();
//		t.setAddress("广东省深圳市龙岗区坂田顺兴工业区E栋601");
//		//是否绑定订单的标志
//		t.setBind(0);
//		//设置出生日期
//		t.setBirthday(Long.parseLong(ChangeTime.timeStamp()));
//		//身份证正面图片地址
//		t.setIdcardurl1("我是身份证正面路径（修改过的）");
//		//身份证背面图片地址
//		t.setIdcardurl2("我是修改后的反面路径");
//		//设置身份证编号
//		t.setIdnumber("362329199602058465");
//		//设置建立扫描件图片地址
//		t.setInfourl("www.baidu.com");
//		t.setName("曲筱萧");
//		//设置付状态
//		t.setPay(1);
//		t.setPhotourl("我是照片路径");
//		t.setSex(0);
//		t.setUserId(1L);
//		t.setId(56l);
//		for (int i = 0; i < 10; i++) {
//			System.out.println(tDao.updateTrainee(t));
//		}
//		long[] idlist = {64L, 65L};
//		System.out.println(tDao.deleteTrainee(idlist));
//		System.out.println(tDao.updateTraineePay(56L, 0));
//		try {
//			System.out.println(new ObjectMapper().writeValueAsString(tDao.getCount()));
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
}
