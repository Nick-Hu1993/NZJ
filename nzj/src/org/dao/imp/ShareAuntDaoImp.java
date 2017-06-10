package org.dao.imp;

import java.util.Date;
import java.util.List;

import org.dao.ShareAuntDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.ShareAunt;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class ShareAuntDaoImp implements ShareAuntDao {

	@Override
	public long addShareAunt(ShareAunt sa) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(sa);

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
	public boolean deleteShareAunt(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			ShareAunt sa = (ShareAunt) session.load(ShareAunt.class, id);
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
	public boolean updateShareAunt(ShareAunt sa) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			session.update(sa);

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
	public List getShareAuntList(Integer share, Integer start, Integer limit,
			Long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("from ShareAunt where userId=? and share=? order by id desc");
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

			List<ShareAunt> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean setShareAunt(long id, Integer share) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("update ShareAunt s set s.share=?,s.time=? where s.id=?");
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
	public List getAllShareAuntList(Integer share, Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("from ShareAunt where share=? order by id desc");
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

			List<ShareAunt> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Long getShareAuntCount(Long userId, Integer share) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("select count(id) from ShareAunt where userId=? and share=?");

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
	public Long getAllShareAuntCount(Integer share) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("select count(id) from ShareAunt where share=?");

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
	public List getSearchShareAuntList(String key, Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "from ShareAunt where share=1 and (skill like :key or address like :key)";
			Query query = session.createQuery(sql);
			
			query.setString("key", "%"+key+"%");

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

			List<ShareAunt> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Long getSearchShareAuntCount(String key) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "select count(id) from ShareAunt where share=1 and (skill like :key or address like :key)";
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
	public List<ShareAunt> getLocalShareAuntList(Integer share,String address, Integer start,
			Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "from ShareAunt where share=? and address like :key";
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

			List<ShareAunt> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getLocalShareAuntCount(Integer share,String address) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "select count(id) from ShareAunt where share=? and address like :key)";
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
