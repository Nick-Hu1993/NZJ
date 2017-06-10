package org.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.Form.AuntContactForm;
import org.Form.AuntWorkForm;
import org.dao.AuntDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.model.Aunt;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VAunt;
import org.view.VAuntId;

@Service
public class AuntDaoImp implements AuntDao {

	@Override
	public boolean addAunt(Aunt a, final Long[] languageId,
			final Long[] cookingId, final Long[] skillId,
			final Long[] applianceId, final Long[] certificateId,
			final Long[] jobId, final AuntContactForm c, final AuntWorkForm w,
			final String url) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			final Long id = (Long) session.save(a);
			session.doWork(new Work() {
				@Override
				public void execute(Connection conn) throws SQLException {
					String sql1 = "insert into aunt_language(aunt_id,language_id) values(?,?)";
					PreparedStatement stmt1 = conn.prepareStatement(sql1);
					conn.setAutoCommit(false);
					for (Long l : languageId) {
						stmt1.setLong(1, id);
						stmt1.setLong(2, l);
						stmt1.addBatch();
					}
					stmt1.executeBatch();

					String sql2 = "insert into aunt_cooking(aunt_id,cooking_id) values(?,?)";
					PreparedStatement stmt2 = conn.prepareStatement(sql2);
					conn.setAutoCommit(false);
					for (Long l : cookingId) {
						stmt2.setLong(1, id);
						stmt2.setLong(2, l);
						stmt2.addBatch();
					}
					stmt2.executeBatch();

					String sql3 = "insert into aunt_skill(aunt_id,skill_id) values(?,?)";
					PreparedStatement stmt3 = conn.prepareStatement(sql3);
					conn.setAutoCommit(false);
					for (Long l : skillId) {
						stmt3.setLong(1, id);
						stmt3.setLong(2, l);
						stmt3.addBatch();
					}
					stmt3.executeBatch();

					String sql4 = "insert into aunt_appliance(aunt_id,appliance_id) values(?,?)";
					PreparedStatement stmt4 = conn.prepareStatement(sql4);
					conn.setAutoCommit(false);
					for (Long l : applianceId) {
						stmt4.setLong(1, id);
						stmt4.setLong(2, l);
						stmt4.addBatch();
					}
					stmt4.executeBatch();

					String sql5 = "insert into aunt_certificate(aunt_id,certificate_id) values(?,?)";
					PreparedStatement stmt5 = conn.prepareStatement(sql5);
					conn.setAutoCommit(false);
					for (Long l : certificateId) {
						stmt5.setLong(1, id);
						stmt5.setLong(2, l);
						stmt5.addBatch();
					}
					stmt5.executeBatch();

					String sql6 = "insert into aunt_job(aunt_id,job_id) values(?,?)";
					PreparedStatement stmt6 = conn.prepareStatement(sql6);
					conn.setAutoCommit(false);
					for (Long l : jobId) {
						stmt6.setLong(1, id);
						stmt6.setLong(2, l);
						stmt6.addBatch();
					}
					stmt6.executeBatch();

					String sql7 = "insert into aunt_contact(cname,relation,workstatus,cphone,aunt_id) values(?,?,?,?,?)";
					PreparedStatement stmt7 = conn.prepareStatement(sql7);
					conn.setAutoCommit(false);
					for (int i = 0; i < c.getCname().length; i++) {
						stmt7.setString(1, c.getCname()[i]);
						stmt7.setString(2, c.getRelation()[i]);
						stmt7.setString(3, c.getWorkstatus()[i]);
						stmt7.setString(4, c.getCphone()[i]);
						stmt7.setLong(5, id);
						stmt7.addBatch();
					}
					stmt7.executeBatch();

					String sql8 = "insert into aunt_work(time,work,aunt_id) values(?,?,?)";
					PreparedStatement stmt8 = conn.prepareStatement(sql8);
					conn.setAutoCommit(false);
					for (int i = 0; i < w.getTime().length; i++) {
						stmt8.setString(1, w.getTime()[i]);
						stmt8.setString(2, w.getWork()[i]);
						stmt8.setLong(3, id);
						stmt8.addBatch();
					}
					stmt8.executeBatch();

					String sql9 = "insert into aunt_photo(url,aunt_id) values(?,?)";
					PreparedStatement stmt9 = conn.prepareStatement(sql9);
					conn.setAutoCommit(false);
					stmt9.setString(1, url);
					stmt9.setLong(2, id);
					stmt9.addBatch();
					stmt9.executeBatch();

					// stmt1.close();
					// stmt2.close();
					// stmt3.close();
					// stmt4.close();
					// stmt5.close();
					// stmt6.close();
					// stmt7.close();
					// stmt8.close();
					// stmt9.close();
					// conn.close();
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
	public boolean deleteAunt(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Aunt a = (Aunt) session.load(Aunt.class, id);
			session.delete(a);

			SQLQuery sqlQuery1 = session
					.createSQLQuery("delete from aunt_language where aunt_id=?");
			sqlQuery1.setParameter(0, id);
			sqlQuery1.executeUpdate();

			SQLQuery sqlQuery2 = session
					.createSQLQuery("delete from aunt_cooking where aunt_id=?");
			sqlQuery2.setParameter(0, id);
			sqlQuery2.executeUpdate();

			SQLQuery sqlQuery3 = session
					.createSQLQuery("delete from aunt_skill where aunt_id=?");
			sqlQuery3.setParameter(0, id);
			sqlQuery3.executeUpdate();

			SQLQuery sqlQuery4 = session
					.createSQLQuery("delete from aunt_appliance where aunt_id=?");
			sqlQuery4.setParameter(0, id);
			sqlQuery4.executeUpdate();

			SQLQuery sqlQuery5 = session
					.createSQLQuery("delete from aunt_certificate where aunt_id=?");
			sqlQuery5.setParameter(0, id);
			sqlQuery5.executeUpdate();

			SQLQuery sqlQuery6 = session
					.createSQLQuery("delete from aunt_job where aunt_id=?");
			sqlQuery6.setParameter(0, id);
			sqlQuery6.executeUpdate();

			SQLQuery sqlQuery7 = session
					.createSQLQuery("delete from aunt_contact where aunt_id=?");
			sqlQuery7.setParameter(0, id);
			sqlQuery7.executeUpdate();

			SQLQuery sqlQuery8 = session
					.createSQLQuery("delete from aunt_work where aunt_id=?");
			sqlQuery8.setParameter(0, id);
			sqlQuery8.executeUpdate();

			SQLQuery sqlQuery9 = session
					.createSQLQuery("delete from aunt_photo where aunt_id=?");
			sqlQuery9.setParameter(0, id);
			sqlQuery9.executeUpdate();

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
	public boolean updateAunt(Aunt l) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			session.update(l);
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
	public List<VAuntId> getAuntList(Integer start, Integer limit, Long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "select * from v_aunt where user_id=? order by id desc";
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.addEntity(VAunt.class);
			sqlQuery.setParameter(0, userId);
			if (start == null) {
				start = 0;
			}
			sqlQuery.setFirstResult(start);
			if (limit == null) {
				limit = 15;
				sqlQuery.setMaxResults(limit);
			} else if (limit == -1) {

			} else {
				sqlQuery.setMaxResults(limit);
			}
			List<VAunt> li = sqlQuery.list();
			List<VAuntId> list = new ArrayList<>();
			for (VAunt a : li)
				list.add(a.getId());

			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Aunt getAunt(String idnumber) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from Aunt where idnumber=?");
			query.setParameter(0, idnumber);
			query.setMaxResults(1);
			Aunt a = (Aunt) query.uniqueResult();

			return a;
		} catch (Exception e) {
			e.printStackTrace();
			return new Aunt();
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Long getAuntCount(Long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query;
			query = session
					.createQuery("select count(id) from Aunt where userId=?");
			query.setParameter(0, userId);
			// if(userId!=1){ //分部
			// query =
			// session.createQuery("select count(id) from Aunt where userId=?");
			// query.setParameter(0, userId);
			// }else{ //总部
			// query = session.createQuery("select count(id) from Aunt");
			// }
			query.setMaxResults(1);
			Long count = (Long) query.uniqueResult();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1L;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public VAuntId getAuntById(Long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery = session
					.createSQLQuery("select * from v_aunt where id=? order by id desc");
			sqlQuery.setParameter(0, id);
			sqlQuery.addEntity(VAunt.class);
			sqlQuery.setMaxResults(1);
			VAunt v = (VAunt) sqlQuery.uniqueResult();
			
			return v.getId();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<VAuntId> getAuntListByStatus(Integer status, Integer start,
			Integer limit, Long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "select * from v_aunt where user_id=? and status=? order by id desc";
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.addEntity(VAunt.class);
			sqlQuery.setParameter(0, userId);
			sqlQuery.setParameter(1, status);
			
			if (start == null) {
				start = 0;
			}
			sqlQuery.setFirstResult(start);
			if (limit == null) {
				limit = 15;
				sqlQuery.setMaxResults(limit);
			} else if (limit == -1) {

			} else {
				sqlQuery.setMaxResults(limit);
			}
			List<VAunt> li = sqlQuery.list();
			List<VAuntId> list = new ArrayList<>();
			for (VAunt a : li)
				list.add(a.getId());

			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getAuntCountByStatus(Integer status, long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query;
			query = session
					.createQuery("select count(id) from Aunt where userId=? and status=?");
			query.setParameter(0, userId);
			query.setParameter(1, status);

			query.setMaxResults(1);
			Long count = (Long) query.uniqueResult();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1L;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updateAuntStatus(Long id, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("update Aunt u set u.status=? where u.id=?");
			query.setParameter(0, status);
			query.setParameter(1, id);
			query.executeUpdate();
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

}
