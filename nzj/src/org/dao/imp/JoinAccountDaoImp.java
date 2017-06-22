package org.dao.imp;

import org.dao.JoinAccountDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.JoinAccount;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
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

	@Override
	public long getJoinOrderIdById(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			SQLQuery sqlQuery = session.createSQLQuery("SELECT join_id FROM join_account ja WHERE ja.id = ?");
			sqlQuery.setParameter(0, id);
			sqlQuery.setMaxResults(1);
			long joinorderid = (Long)sqlQuery.uniqueResult();
			ts.commit();
			return joinorderid;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public JoinAccount getJoinAccountByJoinAccountId(long joinaccountid) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM JoinAccount ja WHERE ja.joinId = ?");
			query.setParameter(0, joinaccountid);
			query.setMaxResults(1);
			JoinAccount ja = (JoinAccount)query.uniqueResult();
			ts.commit();
			return ja;
		} catch (Exception e) {
			e.printStackTrace();
			return new JoinAccount();
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

}
