package org.dao.imp;

import org.dao.UserCheckDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.UserCheck;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class UserCheckDaoImp implements UserCheckDao {

	@Override
	public long addUserCheck(UserCheck uc) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(uc);
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
	public UserCheck getUserCheck(Long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from UserCheck where userId=?");
			query.setParameter(0, userId);
			query.setMaxResults(1);
			UserCheck uc = (UserCheck) query.uniqueResult();

			return uc;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updateUserCheck(Long userId, Integer status,
			String description) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("update UserCheck u set u.status=?,u.description=? where u.userId=?");
			query.setParameter(0, status);
			query.setParameter(1, description);
			query.setParameter(2, userId);
			
			query.executeUpdate();
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
