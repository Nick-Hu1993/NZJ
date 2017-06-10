package org.test;

import java.util.List;

import org.dao.ShareAuntDao;
import org.dao.imp.ShareAuntDaoImp;
import org.model.ShareAunt;


public class test08 {
	public static void main(String[] args) {
		ShareAuntDao saDao = new ShareAuntDaoImp();
		List<ShareAunt> li = saDao.getLocalShareAuntList(1, "2", null, -1);
		for(ShareAunt s:li){
			System.out.println(s.getId()+"--"+s.getAddress());
		}
	}
}