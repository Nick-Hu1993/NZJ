package org.dao.imp;

import java.util.List;

import org.dao.HelpDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Help;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class HelpDaoImp  implements HelpDao {

	@Override
	public long addHelp(Help h) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(h);
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
	public boolean deleteHelp(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("DELETE FROM Help h WHERE id = ?");
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
	public boolean updateHelpStatus(long id, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("UPDATE Help h SET h.status = ? WHERE id = ?");
			query.setParameter(0, status);
			query.setParameter(1, id);
			query.executeUpdate();
			ts.commit();
			return true;
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Help> getHelpListByStatus(Integer start, Integer limit,
			Long userId, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Help h WHERE h.userId = ? AND h.status = ?");
			query.setParameter(0, userId);
			query.setParameter(1, status);
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
			List<Help> li = query.list();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<Help> getHelpListByStatus1(Integer start, Integer limit,
			Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Help h WHERE h.status = ?");
			query.setParameter(0, status);
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
			List<Help> li = query.list();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public String getIdentifierByid(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT h.identifier FROM Help h WHERE h.id = ?");
			query.setParameter(0, id);
			query.setMaxResults(1);//仅返回一条结果
			String identifier = (String)query.uniqueResult();
			return identifier;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getCountByStatus(Long userId, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("SELECT COUNT(*) FROM Help h WHERE h.userId = ? AND h.status = ?");
			query.setParameter(0, userId);
			query.setParameter(1, status);
			query.setMaxResults(1);
			long pageCount = (long) query.uniqueResult();
			return pageCount;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	
	@Override
	public long getCount () {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("SELECT COUNT(*) FROM Help h");
			query.setMaxResults(1);
			long pageCount = (long) query.uniqueResult();
			return pageCount;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Help getHelpByIdentifier(String identifier) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Help h WHERE h.identifier = ? ");
			query.setParameter(0, identifier);
			query.setMaxResults(1);
			Help h = (Help)query.uniqueResult();
			return h;
		} catch (Exception e) {
			e.printStackTrace();
			return new Help();
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	
}
