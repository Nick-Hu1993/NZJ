package org.dao.imp;

import java.util.List;

import org.dao.ModuleDao;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class ModuleDaoImp implements ModuleDao {

	@Override
	public List getModuleList() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from Module order by id");
			List li = query.list();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<Long> getModuleListByStaffId(long sid) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery = session
					.createSQLQuery("select module_id from v_staff_module where staff_id = ? ");
			sqlQuery.setParameter(0, sid);
			sqlQuery.addScalar("module_id", Hibernate.LONG);
			List<Long> li = (List<Long>) sqlQuery.list();
			ts.commit();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

}
