package org.dao.imp;

import java.util.List;

import org.dao.SupportTypeDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.SupportType;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class SupportTypeDaoImp implements SupportTypeDao {

	@Override
	public long addSupportType(SupportType st) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(st);
			ts.commit();
			return id;
		} catch (Exception e1) {
			e1.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean deleteSupportType(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("DELETE FROM SupportType st WHERE id = ?");
			query.setParameter(0, id);
			Integer i = query.executeUpdate();
			ts.commit();
			// System.out.println("删除了" + i + "行");
			return true;
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updateSupportType(SupportType st) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			session.update(st);
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<SupportType> getSupporTypeList (Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM SupportType st");
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
				query.setMaxResults(limit);
			} else if (limit == -1) {
				
			} else {
				query.setMaxResults(limit);
			}
			List<SupportType> li = query.list();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getCount() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction tsTransaction = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM SupportType st");
			query.setMaxResults(1);
			long count = (long)query.uniqueResult();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
}

