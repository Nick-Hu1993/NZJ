package org.dao.imp;

import org.dao.OrderAccountDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.OrderAccount;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class OrderAccountDaoImp implements OrderAccountDao{

	@Override
	public long addOrderAccount(OrderAccount a) {
		try {
			Session session =HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			long id =(Long) session.save(a);
			ts.commit();
			return id;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

}
