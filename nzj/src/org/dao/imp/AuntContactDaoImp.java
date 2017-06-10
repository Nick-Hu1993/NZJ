package org.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.Form.AuntContactForm;
import org.dao.AuntContactDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.model.AuntContact;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class AuntContactDaoImp implements AuntContactDao {

	@Override
	public List getContactByAuntId(long auntId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("from AuntContact where auntId=?");
			query.setParameter(0, auntId);

			List<AuntContact> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updateContactByAuntId(final long AuntId,final AuntContactForm c) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery = session
					.createSQLQuery("delete from aunt_contact where aunt_id=?");
			sqlQuery.setParameter(0, AuntId);
			sqlQuery.executeUpdate();

			session.doWork(new Work() {
				@Override
				public void execute(Connection conn) throws SQLException {
					// TODO Auto-generated method stub
					String sql7 = "insert into aunt_contact(cname,relation,workstatus,cphone,aunt_id) values(?,?,?,?,?)";
					PreparedStatement stmt7 = conn.prepareStatement(sql7);
					conn.setAutoCommit(false);
					for (int i = 0; i < c.getCname().length; i++) {
						stmt7.setString(1, c.getCname()[i]);
						stmt7.setString(2, c.getRelation()[i]);
						stmt7.setString(3, c.getWorkstatus()[i]);
						stmt7.setString(4, c.getCphone()[i]);
						stmt7.setLong(5, AuntId);
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
