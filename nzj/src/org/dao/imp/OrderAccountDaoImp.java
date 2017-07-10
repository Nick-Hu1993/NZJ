package org.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.dao.OrderAccountDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.model.OrderAccount;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VOrderAccount;

@Service
public class OrderAccountDaoImp implements OrderAccountDao{

	@Override
	public long addOrderAccount(final OrderAccount oa, final Integer status) {
		try {
			Session session =HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			long accountId =(Long) session.save(oa);
			session.doWork(new Work() {
				
				@Override
				public void execute(Connection conn) throws SQLException {
					String sql = "UPDATE orders o SET o.status = ? WHERE o.id = ?";
					PreparedStatement stmt = conn.prepareStatement(sql);
					stmt.setInt(1, status);
					stmt.setLong(2, oa.getOrderId());
					conn.setAutoCommit(false);
					stmt.addBatch();
					stmt.executeBatch();
				}
			});
			ts.commit();
			return accountId;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean deleteOrderAccount(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			OrderAccount oa = (OrderAccount)session.load(OrderAccount.class, id);
			if (oa != null) {
				session.delete(oa);
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
	public boolean updateOrderAccount(OrderAccount oa) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			session.update(oa);
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
	public long getOrderIdById(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			SQLQuery sqlQuery = session.createSQLQuery("SELECT order_id FROM order_account oa WHERE oa.id = ?");
			sqlQuery.setParameter(0, id);
			sqlQuery.setMaxResults(1);
			long orderId = (Long)sqlQuery.uniqueResult();
			return orderId;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public OrderAccount getOrderAccountByOrderId(long orderid) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM OrderAccount oa WHERE oa.orderId = ?");
			query.setParameter(0, orderid);
			query.setMaxResults(1);
			OrderAccount oa = (OrderAccount)query.uniqueResult();
			ts.commit();
			return oa;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new OrderAccount();
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<VOrderAccount> getOrderAndAccountByUserId(Integer start,
			Integer limit, long userid) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM VOrderAccount va WHERE va.id.userId = ?");
			query.setParameter(0, userid);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(limit);
			List<VOrderAccount> li = query.list();
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
	public long getCountByUserId(long userid) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM VOrderAccount va WHERE va.id.userId = ?");
			query.setParameter(0, userid);
			query.setMaxResults(1);
			long count = (Long)query.uniqueResult();
			ts.commit();
			return count;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
}