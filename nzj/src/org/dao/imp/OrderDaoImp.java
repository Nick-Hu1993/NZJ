package org.dao.imp;

import java.util.List;

import org.dao.OrderDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Orders;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class OrderDaoImp implements OrderDao{

	@Override
	public long addOrder(Orders o) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts=  session.beginTransaction();
			
			long id = (Long) session.save(o);
			ts.commit();
			return id;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List getOrderList() {
		// TODO Auto-generated method stub
		return null;
	}

}
