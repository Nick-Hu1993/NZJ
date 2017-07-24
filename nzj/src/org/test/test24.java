package org.test;

import org.dao.AuntDao;
import org.dao.imp.AuntDaoImp;

public class test24 {
	public static void main(String[] args) {
		AuntDao aDao = new AuntDaoImp();
		Long[] a = {1L,2L,3l,4l};
		Long[] b = {1L,2L};
		Long[] c = {1L,2L};
		Long[] d = {1L,2L};
		Long[] e = {1L,2L};
		Long[] f = {1L,2L};
		System.out.println(aDao.updateAuntSkills(65L,a,b,c,d,e,f));
	}
}
