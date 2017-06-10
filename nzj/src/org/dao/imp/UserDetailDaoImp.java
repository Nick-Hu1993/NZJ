package org.dao.imp;

import java.util.List;

import org.dao.UserDetailDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.UserDetail;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class UserDetailDaoImp implements UserDetailDao {
	public long addUserDetail(UserDetail ud) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(ud);
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
	public boolean updateUserDetail(UserDetail ud) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			session.update(ud);
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
	public UserDetail getUserDetail(String username) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("from UserDetail where username=?");
			query.setParameter(0, username);
			query.setMaxResults(1);
			UserDetail ud = (UserDetail) query.uniqueResult();
			
			return ud;
		} catch (Exception e) {
			e.printStackTrace();
			return new UserDetail();
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean getUserDetail(Long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("from UserDetail where userId=?");
			query.setParameter(0, userId);
			query.setMaxResults(1);
			UserDetail ud = (UserDetail) query.uniqueResult();
			
			if(ud==null)
				return false;
			else
				return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public UserDetail getUserDetailById(Long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("from UserDetail where userId=?");
			query.setParameter(0, userId);
			query.setMaxResults(1);
			UserDetail ud = (UserDetail) query.uniqueResult();
			return ud;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean getUserDetailSupport(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM VUser v WHERE v.id.id = ? AND v.id.support = ?");
			query.setParameter(0, id);
			query.setParameter(1, 0);
			query.setMaxResults(1);
			query.uniqueResult();
			//可以添加（未被服务过）
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
