package org.dao.imp;

import org.dao.OrderAccountDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.OrderAccount;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class OrderAccountDaoImp implements OrderAccountDao{

	@Override
	public long addOrderAccount(OrderAccount oa) {
		try {
			Session session =HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			long accountId =(Long) session.save(oa);
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
}
