package org.test;

import org.dao.UserDao;
import org.dao.UserDetailDao;
import org.dao.imp.UserDaoImp;
import org.dao.imp.UserDetailDaoImp;
import org.model.User;
import org.model.UserDetail;
import org.tool.readProperties;

public class test01 {
	public static void main(String[] args) {
		//--------UserDao测试--------
		
		//添加用户测试
		/*
		UserDao uDao = new UserDaoImp();
		User u = new User(1L,"dd",new Date().getTime()/1000,2,0);
		System.out.println(uDao.addUser(u));
		*/
		
		//修改用户测试
		/*UserDao uDao = new UserDaoImp();
		User u = uDao.getUserById(4L);
		u.setPhone(34543535L);
		u.setAck(3);
		System.out.println(uDao.updateUser(u));*/
		
		//--------UserDetailDao测试--------
//		UserDetailDao udDao = new UserDetailDaoImp();
//		UserDetail ud = new UserDetail(4L, "zgj", "sy", "小明", 345345435L, 123L, "sa","http://fsdfa.jpg",null);
//		
//		System.out.println(udDao.addUserDetail(ud));
		
//		System.out.println(new readProperties().getP("IP"));
		UserDao uDao = new UserDaoImp();
		System.out.println(uDao.getRankByUserId(1));
	}
}