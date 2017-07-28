package org.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.dao.OrderDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.model.AmountRecord;
import org.model.Orders;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VOrderTraineedetail;

import sun.net.www.content.text.plain;

@Service
public class OrderDaoImp implements OrderDao {

	@Override
	public boolean addOrder(final Orders o, final Long[] TraineeId, final AmountRecord ad) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			final long orderId = (Long) session.save(o);
			session.doWork(new Work() {

				@Override
				public void execute(Connection conn) throws SQLException {
					String sql = "INSERT INTO order_trainee (order_id, trainee_id) value (?, ?)";
					PreparedStatement stmt = conn.prepareStatement(sql);
					conn.setAutoCommit(false);
					for (Long i : TraineeId) {
						System.out.println(i);
						stmt.setLong(1, orderId);
						stmt.setLong(2, i);
						stmt.addBatch();
					}

					stmt.executeBatch();
					String sql2 = "INSERT INTO amount_record (time, order_id, amount, description, user_id) value (?, ?, ?, ?, ?)";
					PreparedStatement stmt2 = conn.prepareStatement(sql2);
					// 设置消费记录属于哪张订单
					stmt2.setLong(1, ad.getTime());
					stmt2.setLong(2, orderId);
					stmt2.setDouble(3, o.getTotal());
					stmt2.setString(4, ad.getDescription());
					stmt2.setLong(5, ad.getUserId());
					stmt2.addBatch();
					stmt2.executeUpdate();
				}
			});
			ts.commit();
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
	public boolean addOrderByOfflion(Orders o, final Long[] id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			final long orderId = (Long) session.save(o);
			session.doWork(new Work() {

				@Override
				public void execute(Connection conn) throws SQLException {
					String sql = "INSERT INTO order_trainee (order_id, trainee_id) value (?, ?)";
					PreparedStatement stmt = conn.prepareStatement(sql);
					conn.setAutoCommit(false);
					for (Long i : id) {
						stmt.setLong(1, orderId);
						stmt.setLong(2, i);
						stmt.addBatch();
						stmt.executeUpdate();
					}
				}
			});
			ts.commit();
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
	public boolean deletOrder(final Long[] id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			for (Long idList : id) {
				Orders o = (Orders) session.load(Orders.class, idList);
				if (o != null) {
					session.delete(o);
					session.doWork(new Work() {

						@Override
						public void execute(Connection conn)
								throws SQLException {
							String sql = "DELETE FROM order_trainee WHERE order_id = ?";
							PreparedStatement stmt = conn.prepareStatement(sql);
							conn.setAutoCommit(false);
							for (long i : id) {
								stmt.setLong(1, i);
							}
							stmt.executeUpdate();
						}
					});
					ts.commit();
				}
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean uptdateOrder(Orders o) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			session.update(o);
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
	public boolean updateOrderStatus(long id, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("UPDATE Orders o SET o.status = ? WHERE o.id = ?");
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
	public List<Orders> getOrderListById(Integer start, Integer limit,
			long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("FROM Orders o WHERE o.userId = ?");
			query.setParameter(0, userId);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(15);
			List<Orders> li = query.list();
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
	public long getCount(long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("SELECT COUNT(*) FROM Orders o");
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
	public List<Orders> getOrderListByStatus(Integer start, Integer limit,
			Integer status, long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("FROM Orders o WHERE o.userId = ? AND o.status = ?");
			query.setParameter(0, userId);
			query.setParameter(1, status);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(limit);
			List<Orders> li = query.list();
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
	public long getCountByStatus(long userId, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("SELECT COUNT(*) FROM Orders o WHERE o.userId = ? AND o.status = ?");
			query.setParameter(0, userId);
			query.setParameter(1, status);
			query.setMaxResults(1);
			long count = (Long) query.uniqueResult();
			ts.commit();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public List<Orders> getOrderList(Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("FROM Orders o");
			List<Orders> li = query.list();
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
	public long getAllCount() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("SELECT COUNT(*) FROM Orders o");
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
	public List<VOrderTraineedetail> getOrderTaineeDetailByOrderid(
			Integer start, Integer limit, long orderid) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("FROM VOrderTraineedetail o WHERE o.id.orderId = ?");
			query.setParameter(0, orderid);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(limit);
			List<VOrderTraineedetail> li = query.list();
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
	public long getOrderTraineedetailCount(long orderid) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("SELECT COUNT(*) FROM VOrderTraineedetail o WHERE o.id.orderId = ?");
			query.setParameter(0, orderid);
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
	public boolean getOrderTraineeByStatusAndId(long id, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("FROM Orders o WHERE id = ? AND status = ?");
			query.setParameter(0, id);
			query.setParameter(1, status);
			query.setMaxResults(1);
			query.uniqueResult();
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Orders> getAllTraineeByStatus(Integer start, Integer limit, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Orders o WHERE o.status = ? ORDER BY o.id desc");
			query.setParameter(0, status);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(limit);
			List<Orders> li = query.list();
			ts.commit();
			return li;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getAllCountByStatus(Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM Orders o WHERE o.status = ? ");
			query.setParameter(0, status);
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
