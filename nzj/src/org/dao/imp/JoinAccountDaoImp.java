package org.dao.imp;

import org.dao.JoinAccountDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.JoinAccount;
import org.util.HibernateSessionFactory;

public class JoinAccountDaoImp implements JoinAccountDao{

	@Override
	public long addJoinAccount(JoinAccount ja) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			long id = (Long)session.save(ja);
			ts.commit();
			return id;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean deleteJoinAccount(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			JoinAccount ja = (JoinAccount)session.load(JoinAccount.class, id);
			if (ja != null) {
				session.delete(ja);
			}
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updateJoinAccount(JoinAccount ja) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			session.update(ja);
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

}
