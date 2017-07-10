package org.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.Form.SupportTrackingForm;
import org.dao.SupportTrackingDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.model.SupportTracking;
import org.springframework.stereotype.Service;
import org.tool.ChangeTime;
import org.util.HibernateSessionFactory;
import org.view.VSupport;

@Service
public class SupportTrackingDaoImp implements SupportTrackingDao {

	@Override
	public boolean addSupportTracking(final SupportTrackingForm stf) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			session.doWork(new Work() {
				@Override
				public void execute(Connection conn) throws SQLException {
					String sql = "insert into support_tracking(ttime, content, status, type_id, user_id) value(?, ?, ?, ?, ?)";
					PreparedStatement stmt = conn.prepareStatement(sql);
					conn.setAutoCommit(false);
					for (int i = 0; i < stf.getContent().length; i++) {
						stmt.setLong(1,Long.parseLong(ChangeTime.date2TimeStamp(stf.getTtime()[i], "yyyy-MM-dd")));
						stmt.setString(2, stf.getContent()[i]);
						stmt.setInt(3, stf.getStatus()[i]);
						stmt.setLong(4, stf.getTypeId()[i]);
						stmt.setLong(5, stf.getuserId());
						stmt.addBatch();
					}
					stmt.executeBatch();
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
	public boolean deleteSupportTracking(Long[] id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			//设定占位符的个数
			String sql = "";
			for (int i = 0; i < id.length; i++) {
				if (i == 0) {
					sql = sql + "?";
				} else {
					sql = sql + "," + "?";
				}
			}
			Query Query = session.createQuery("DELETE FROM SupportTracking WHERE id in(" + sql + ")");
			//设置占位符中的参数
			Long[] ints = new Long[id.length];
		    for(int i=0; i<id.length; i++){
		        ints[i] = id[i];
				Query.setParameter(i, ints[i]);
			}
				int k = Query.executeUpdate();
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
	public boolean updateSupportTracking(SupportTracking st) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			session.update(st);
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
	public List<SupportTracking> getSupportTrackingByStatus(Integer start,
			Integer limit, Integer status, Long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			SQLQuery sqlQuery = session.createSQLQuery("SELECT * FROM v_support WHERE status = ? AND user_id = ?");
			sqlQuery.addEntity(VSupport.class);
			sqlQuery.setParameter(1, userId);
			sqlQuery.setParameter(0, status);
			if (start == null) {
				start = 0;
			}
			sqlQuery.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			sqlQuery.setMaxResults(limit);
			List<SupportTracking> li = sqlQuery.list();
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
	public long getCountByStatus(Long userId, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT  COUNT(*) FROM SupportTracking st WHERE st.status = ? AND st.userId =?");
			query.setParameter(0, status);
			query.setParameter(1, userId);
			query.setMaxResults(1);
			long l = (Long)query.uniqueResult();
			ts.commit();
			return l;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

}
