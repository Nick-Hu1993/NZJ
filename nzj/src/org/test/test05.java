package org.test;

import org.Form.AuntContactForm;
import org.Form.AuntWorkForm;
import org.dao.ApplianceDao;
import org.dao.AuntContactDao;
import org.dao.AuntPhotoDao;
import org.dao.AuntWorkDao;
import org.dao.imp.ApplianceDaoImp;
import org.dao.imp.AuntContactDaoImp;
import org.dao.imp.AuntPhotoDaoImp;
import org.dao.imp.AuntWorkDaoImp;

public class test05 {
	public static void main(String[] args) {
		//修改阿姨附属信息测试
		
//		ApplianceDao aDao=new ApplianceDaoImp();
//		long[] a = {6L};
//		aDao.updateApplianceByAuntId(888L,a);
		
		
//		AuntContactDao acDao = new AuntContactDaoImp();
//		AuntContactForm ac = new AuntContactForm();
//		String[] cname={"s","fer","4g"};
//		String[] relation = {"323","f34g","ds"};
//		String[] workstatus={"dsfa","vvafd","vsd"};
//		String[] cphone={"fwef","vsdfv","vd"};
//		
//		ac.setCname(cname);
//		ac.setRelation(relation);
//		ac.setWorkstatus(workstatus);
//		ac.setCphone(cphone);
//		acDao.updateContactByAuntId(32L, ac);
		
//		AuntWorkDao awDao=new AuntWorkDaoImp();
//		AuntWorkForm w = new AuntWorkForm();
//		String[] work = {"sd","f"};
//		String[] time = {"v","vdsv"};
//		w.setWork(work);
//		w.setTime(time);
//		awDao.updateWorkByAuntId(32L, w);
		
		AuntPhotoDao apDao = new AuntPhotoDaoImp();
		apDao.updatePhotoByAuntId(32, "vdv");
	}
}
