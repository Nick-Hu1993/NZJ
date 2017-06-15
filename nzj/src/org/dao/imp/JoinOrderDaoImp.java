package org.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.dao.JoinOrderDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.model.JoinOrders;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VJoinUserdetail;

@Service
public class JoinOrderDaoImp implements JoinOrderDao {

	@Override
	public boolean addJoninOrder(JoinOrders jo, final long[] id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			final long joId = (Long) session.save(jo);
			session.doWork(new Work() {
				@Override
				public void execute(Connection conn) throws SQLException {
					String sql = "INSERT INTO join_userdetail (joinorder_id, userdetail_id) value (?, ?)";
					PreparedStatement stmt = conn.prepareStatement(sql);
					conn.setAutoCommit(false);
					for (int i = 0; i < id.length; i++) {
						stmt.setLong(1, joId);
						stmt.setLong(2, id[i]);
						stmt.addBatch();
					}
					stmt.executeBatch();
				}
			});
			ts.commit();
			// 清除二级缓存，防止数据因数量过多而插入失败
			session.flush();
			session.clear();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean deleteJoinOrder(final long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			session.delete(session.load(JoinOrders.class, id));
			session.doWork(new Work() {

				@Override
				public void execute(Connection conn) throws SQLException {
					String sql = "DELETE FROM join_userdetail WHERE joinorder_id = ?";
					PreparedStatement stmt = conn.prepareStatement(sql);
					conn.setAutoCommit(false);
					stmt.setLong(1, id);
					stmt.executeUpdate();
				}
			});
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
	public boolean updateJoinOrder(JoinOrders jo) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			session.update(jo);
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
	public boolean updateJoinOrderStatus(Integer status, long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("UPDATE JoinOrders jo SET jo.status = ? WHERE id = ?");
			query.setParameter(0, status);
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
	public List<JoinOrders> getJoinOrderListById (Integer start, Integer limit,
			long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("FROM JoinOrders jo WHERE jo.userId = ?");
			query.setParameter(0, id);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(limit);
			List<JoinOrders> li = query.list();
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
	public List<VJoinUserdetail> getJoinOrderDetailByJoinorderid(Integer start,
			Integer limit, long joinorderid) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("FROM VJoinUserdetail jo WHERE jo.id.joinorderId = ? ");
			query.setParameter(0, joinorderid);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(15);
			List<VJoinUserdetail> li = query.list();
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
	public long getContById(long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("SELECT COUNT(*) FROM JoinOrders jo WHERE userId = ?");
			query.setParameter(0, userId);
			query.setMaxResults(1);
			long count = (Long) query.uniqueResult();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<JoinOrders> getJoinOrderByStatus(Integer start, Integer limit,
			Integer status, long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("FROM JoinOrders jo WHERE jo.status = ? AND jo.userId = ?");
			query.setParameter(0, status);
			query.setParameter(1, id);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(limit);
			List<JoinOrders> li = query.list();
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
	public long getCountByStatus(long id, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("SELECT COUNT(*) FROM JoinOrders WHERE userId = ? AND status = ?");
			query.setParameter(0, id);
			query.setParameter(1, status);
			query.setMaxResults(1);
			long count = (Long) query.uniqueResult();
			ts.commit();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getJoinOrderDetailCount(long joinorderid) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM VJoinUserdetail jo WHERE jo.id.joinorderId = ?");
			query.setParameter(0, joinorderid);
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
