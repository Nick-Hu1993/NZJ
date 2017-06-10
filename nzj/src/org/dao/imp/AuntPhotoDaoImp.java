package org.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.Form.AuntWorkForm;
import org.dao.AuntPhotoDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.model.AuntPhoto;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class AuntPhotoDaoImp implements AuntPhotoDao{

	@Override
	public List getPhotoByAuntId(long auntId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from AuntPhoto where auntId=?");
			query.setParameter(0, auntId);
			
			List<AuntPhoto> li = query.list();
			
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updatePhotoByAuntId(final long AuntId,final String url) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery = session
					.createSQLQuery("update aunt_photo p set p.url=? where aunt_id=?");
			sqlQuery.setParameter(0, url);
			sqlQuery.setParameter(1, AuntId);
			sqlQuery.executeUpdate();
			
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	
}
