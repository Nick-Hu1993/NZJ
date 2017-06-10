package org.dao.imp;

import java.util.Date;
import java.util.List;

import org.dao.ShareEmployerDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.ShareEmployer;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class ShareEmployerDaoImp implements ShareEmployerDao {

	@Override
	public long addShareEmployer(ShareEmployer se) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(se);

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
	public boolean deleteShareEmployer(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			ShareEmployer sa = (ShareEmployer) session.load(
					ShareEmployer.class, id);
			session.delete(sa);

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
	public boolean updateShareEmployer(ShareEmployer se) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			session.update(se);

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
	public boolean setShareEmployer(long id, Integer share) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("update ShareEmployer s set s.share=?,s.time=? where s.id=?");
			query.setParameter(0, share);
			query.setParameter(1, new Date().getTime() / 1000);
			query.setParameter(2, id);
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

	@Override
	public List getShareEmployerList(Integer share, Integer start,
			Integer limit, Long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("from ShareEmployer where userId=? and share=? order by id desc");
			query.setParameter(0, userId);
			query.setParameter(1, share);
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

			List<ShareEmployer> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List getAllShareEmployerList(Integer share, Integer start,
			Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("from ShareEmployer where share=? order by id desc");
			query.setParameter(0, share);
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

			List<ShareEmployer> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Long getShareEmployerCount(Long userId, Integer share) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("select count(id) from ShareEmployer where userId=? and share=?");

			query.setParameter(0, userId);
			query.setParameter(1, share);

			query.setMaxResults(1);
			Long count = (Long) query.uniqueResult();

			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1L;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Long getAllShareEmployerCount(Integer share) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("select count(id) from ShareEmployer where share=?");

			query.setParameter(0, share);
			query.setMaxResults(1);
			Long count = (Long) query.uniqueResult();

			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1L;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List getSearchShareEmployerList(String key, Integer start,
			Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "from ShareEmployer where share=1 and (content like :key or address like :key)";
			Query query = session.createQuery(sql);

			query.setString("key", "%" + key + "%");

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

			List<ShareEmployer> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Long getSearchShareEmployerCount(String key) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "select count(id) from ShareEmployer where share=1 and (content like :key or address like :key)";
			Query query = session.createQuery(sql);

			query.setString("key", "%"+key+"%");
			
			query.setMaxResults(1);
			Long count = (Long) query.uniqueResult();

			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1L;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<ShareEmployer> getLocalShareEmployerList(Integer share,
			String address, Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "from ShareEmployer where share=? and address like :key";
			Query query = session.createQuery(sql);
			query.setParameter(0, share);
			
			query.setString("key", "%"+address+"%");

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

			List<ShareEmployer> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getLocalShareEmployerCount(Integer share, String address) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "select count(id) from ShareEmployer where share=? and address like :key)";
			Query query = session.createQuery(sql);
			query.setParameter(0, share);
			
			query.setString("key", "%"+address+"%");
			
			query.setMaxResults(1);
			Long count = (Long) query.uniqueResult();

			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1L;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

}
