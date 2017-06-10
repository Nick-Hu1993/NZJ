package org.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.Form.AuntWorkForm;
import org.dao.AuntWorkDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.model.AuntWork;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class AuntWorkDaoImp implements AuntWorkDao{

	@Override
	public List getWorkByAuntId(long auntId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from AuntWork where auntId=?");
			query.setParameter(0, auntId);
			
			List<AuntWork> li = query.list();
			
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updateWorkByAuntId(final long AuntId, final AuntWorkForm w) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery = session
					.createSQLQuery("delete from aunt_work where aunt_id=?");
			sqlQuery.setParameter(0, AuntId);
			sqlQuery.executeUpdate();

			session.doWork(new Work() {
				@Override
				public void execute(Connection conn) throws SQLException {
					// TODO Auto-generated method stub
					String sql7 = "insert into aunt_work(time,work,aunt_id) values(?,?,?)";
					PreparedStatement stmt7 = conn.prepareStatement(sql7);
					conn.setAutoCommit(false);
					for (int i = 0; i < w.getWork().length; i++) {
						stmt7.setString(1, w.getTime()[i]);
						stmt7.setString(2, w.getWork()[i]);
						stmt7.setLong(3, AuntId);
						stmt7.addBatch();
					}
					stmt7.executeBatch();
//					stmt7.close();
//					conn.close();
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

}
