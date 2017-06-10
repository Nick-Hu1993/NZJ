package org.test;

import org.dao.AuntDao;
import org.dao.imp.AuntDaoImp;
import org.model.Aunt;

public class test02 {
	public static void main(String[] args) {
		AuntDao aDao = new AuntDaoImp();
		Aunt a = new Aunt();
		a.setName("d");
		a.setAge(1);
		a.setSign("3");
		a.setNative_("d");
		a.setSex(0);
		a.setEducation("dfd");
		a.setMarriage(1);
		a.setNation("br");
		a.setHeight(2.2);
		a.setWeight(23.45);
		a.setSigh(2.1123);
		a.setIdnumber("ss13213");
		a.setPhone("2323423423412");
		a.setAddress("sdfgeqger");
		a.setUserId(3L);
		Long[] languageId = {3L,1L};
//		aDao.addAunt(a, languageId);
	}
}
