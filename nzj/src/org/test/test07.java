package org.test;

import org.dao.BoardDao;
import org.dao.UserDao;
import org.dao.imp.BoardDaoImp;
import org.dao.imp.UserDaoImp;

public class test07 {
	public static void main(String[] args) {
		BoardDao bDao = new BoardDaoImp();
		System.out.println(bDao.getUrlById(4L));
	}
}