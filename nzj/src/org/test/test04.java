package org.test;

import java.util.List;

import org.dao.AuntDao;
import org.dao.LanguageDao;
import org.dao.SkillDao;
import org.dao.UserDao;
import org.dao.imp.AuntDaoImp;
import org.dao.imp.LanguageDaoImp;
import org.dao.imp.SkillDaoImp;
import org.dao.imp.UserDaoImp;
import org.model.Aunt;
import org.view.VAuntId;
import org.view.VUserId;

public class test04 {
	public static void main(String[] args) {
		UserDao uDao = new UserDaoImp();
		VUserId v = uDao.getUserById(1L);
		System.out.println(v.getUsername());
	}
}
