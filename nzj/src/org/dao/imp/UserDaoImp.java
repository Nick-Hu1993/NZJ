package org.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.dao.UserDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.User;
import org.springframework.stereotype.Service;
import org.tool.readProperties;
import org.util.HibernateSessionFactory;
import org.view.VUser;
import org.view.VUserId;

@Service
public class UserDaoImp implements UserDao {

	@Override
	public long addUser(User u) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(u);
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
	public boolean deleteUser(Long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			User u = (User) session.load(User.class, id);
			session.delete(u);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public User getUser(Long phone) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from User where phone=?");
			query.setParameter(0, phone);
			query.setMaxResults(1);
			User u = (User) query.uniqueResult();
			return u;
		} catch (Exception e) {
			e.printStackTrace();
			return new User(); // 注意，这里应该返回对象，因为phone能用，返回的是null
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public User getUser(Long phone, String password) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("from User where phone=? and password=?");
			query.setParameter(0, phone);
			query.setParameter(1, password);
			query.setMaxResults(1);
			User u = (User) query.uniqueResult();
			return u;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public VUserId getUserById(Long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			SQLQuery sqlQuery = session
					.createSQLQuery("select * from v_user where id=?");
			sqlQuery.setParameter(0, id);
			sqlQuery.addEntity(VUser.class);
			sqlQuery.setMaxResults(1);

			VUser v = (VUser) sqlQuery.uniqueResult();

			return v.getId();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updateUserPassword(Long id, String password) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			Query query = session
					.createQuery("update User u set u.password=? where u.id=?");
			query.setParameter(0, password);
			query.setParameter(1, id);
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
	public boolean updateUser(Long id, Integer rank, Integer ack) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			Query query = session
					.createQuery("update User u set u.rank=?,u.ack=? where u.id=?");
			query.setParameter(0, rank);
			query.setParameter(1, ack);
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
	public List getUnAckUserList(Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery = session
					.createSQLQuery("select * from v_user where ack=0 order by id desc");
			sqlQuery.addEntity(VUser.class);

			if (start == null) {
				start = 0;
			}
			sqlQuery.setFirstResult(start);
			if (limit == null) {
				limit = 15;
				sqlQuery.setMaxResults(limit);
			} else if (limit == -1) {

			} else {
				sqlQuery.setMaxResults(limit);
			}

			List<VUser> li = sqlQuery.list();
			List<VUserId> list = new ArrayList<>();
			for (VUser v : li) {
				list.add(v.getId());
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Long getUnAckUserCount() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("select count(u.id.id) from VUser u where u.id.ack=0");
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
	public List getAckUserList(Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery = session
					.createSQLQuery("select * from v_user where ack=1 order by id desc");
			sqlQuery.addEntity(VUser.class);

			if (start == null) {
				start = 0;
			}
			sqlQuery.setFirstResult(start);
			if (limit == null) {
				limit = 15;
				sqlQuery.setMaxResults(limit);
			} else if (limit == -1) {

			} else {
				sqlQuery.setMaxResults(limit);
			}

			List<VUser> li = sqlQuery.list();
			List<VUserId> list = new ArrayList<>();
			for (VUser v : li) {
				list.add(v.getId());
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Long getAckUserCount() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("select count(u.id.id) from VUser u where u.id.ack=1 order by u.id.rank");
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
	public Integer getRankByUserId(long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT u.rank FROM User u WHERE u.id = ?");
			query.setParameter(0, userId);
			query.setMaxResults(1);
			Integer rank = (Integer)query.uniqueResult();
			ts.commit();
			return rank;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<VUser> getUserListByRank(Integer start, Integer limit, Integer rank) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM VUser vu WHERE vu.id.rank = ?");
			query.setParameter(0, rank);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(limit);
			List<VUser> li = (List<VUser>)query.list();
			ts.commit();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getRankCount(Integer rank) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM VUser vu WHERE vu.id.rank = ?");
			query.setParameter(0, rank);
			query.setMaxResults(1);
			long count = (Long)query.uniqueResult();
			ts.commit();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
}
