package org.test;

import java.util.List;

import org.dao.AuntDao;
import org.dao.LanguageDao;
import org.dao.SkillDao;
import org.dao.imp.AuntDaoImp;
import org.dao.imp.LanguageDaoImp;
import org.dao.imp.SkillDaoImp;
import org.model.Aunt;
import org.view.VAuntId;

public class test03 {
	public static void main(String[] args) {
//		AuntDao aDao = new AuntDaoImp();
//		
//		List<VAuntId> li= aDao.getAuntList(null, 15, 6L);
//		System.out.println(li.size());
		
//		LanguageDao lDao = new LanguageDaoImp();
//		List li = lDao.getLanguageByAuntId(23L);
//		System.out.println(li.size());
		
		SkillDao sDao = new SkillDaoImp();
		List li = sDao.getSkillByAuntId(29L);
		System.out.println(li.size());
	}
}
