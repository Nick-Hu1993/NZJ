package org.test;

import org.dao.UserDetailDao;
import org.dao.imp.UserDetailDaoImp;

public class test13 {
	public static void main(String[] args) {
		UserDetailDao udDao = new UserDetailDaoImp();
		System.out.println(udDao.getUserDetailSupport(1L));
	}
}
