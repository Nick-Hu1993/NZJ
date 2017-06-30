package org.dao.imp;

import java.util.List;

import org.dao.AmountRecordDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.AmountRecord;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class AmountRecordDaoImp implements AmountRecordDao {

	@Override
	public boolean addAmountRecord(AmountRecord ad) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			long id = (Long)session.save(ad);
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
	public List<AmountRecord> getAmountRecordList(Integer start, Integer limit, long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM AmountRecord ad WHERE ad.userId = ? ORDER BY ad.time");
			query.setParameter(0, id);
			if (start == null ) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(limit);
			List<AmountRecord> li = query.list();
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
	public long getCount(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM AmountRecord ar WHERE ar.userId = ?");
			query.setParameter(0, id);
			query.setMaxResults(1);
			long count = (Long)query.uniqueResult();
			ts.commit();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
