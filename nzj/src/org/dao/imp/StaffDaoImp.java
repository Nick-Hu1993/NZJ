package org.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.dao.StaffDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.model.Staff;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class StaffDaoImp implements StaffDao {

	@Override
	public long addStaff(Staff o, final Long[] mid) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			final long id = (Long) session.save(o);
			session.doWork(new Work() {

				@Override
				public void execute(Connection conn) throws SQLException {
					String sql = "insert into staff_module(module_id,staff_id) values(?,?)";
					PreparedStatement stmt = conn.prepareStatement(sql);
					conn.setAutoCommit(false);
					for (long l : mid) {
						stmt.setLong(1, l);
						stmt.setLong(2, id);
						stmt.addBatch();
					}
					stmt.executeBatch();
				}

			});

			ts.commit();
			session.flush();
			session.clear();
			return id;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Staff getStaff(Long phone) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from Staff where phone =?");
			query.setParameter(0, phone);
			query.setMaxResults(1);
			Staff s = (Staff) query.uniqueResult();
			return s;
		} catch (Exception e) {
			e.printStackTrace();
			return new Staff();
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean deleteStaff(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Staff s = (Staff) session.load(Staff.class, id);
			session.delete(s);

			SQLQuery sqlQuery = session
					.createSQLQuery("delete from staff_module where staff_id=?");
			sqlQuery.setParameter(0, id);
			sqlQuery.executeUpdate();

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
	public boolean updateStaff(long id,String name,String address,String job) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("update Staff s set s.name=?,s.address=?,s.job=? where s.id=?");
			query.setParameter(0, name);
			query.setParameter(1, address);
			query.setParameter(2, job);
			query.setParameter(3, id);
			
			query.executeUpdate();
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
	public List getStaffList(Long id, Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "from Staff where userId=?";
			Query query = session.createQuery(sql);

			query.setParameter(0, id);

			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
				query.setMaxResults(limit);
			} else if (limit == -1) {

			} else {
				query.setMaxResults(limit);
			}
			List<Staff> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getStaffCount(Long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("select count(id) from Staff where userId=?");
			query.setParameter(0, id);
			query.setMaxResults(1);
			long count = (Long) query.uniqueResult();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Staff getStaff(Long phone, String password) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("from Staff where phone=? and password=?");
			query.setParameter(0, phone);
			query.setParameter(1, password);
			query.setMaxResults(1);
			Staff s = (Staff) query.uniqueResult();
			return s;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List getAllStaffList(Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "from Staff";
			Query query = session.createQuery(sql);

			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
				query.setMaxResults(limit);
			} else if (limit == -1) {

			} else {
				query.setMaxResults(limit);
			}
			List<Staff> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getAllStaffCount() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("select count(id) from Staff");
			query.setMaxResults(1);
			long count = (Long) query.uniqueResult();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Staff getStaffById(long sid) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts=session.beginTransaction();
			
			Query query = session.createQuery("from Staff where id=?");
			query.setParameter(0, sid);
			query.setMaxResults(1);
			Staff s = (Staff) query.uniqueResult();
			
			return s;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updateStaffPassword(long id, String password) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("update Staff s set s.password=? where s.id=?");
			query.setParameter(0, password);
			query.setParameter(1, id);
			
			query.executeUpdate();
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
	public boolean updateStaffPhotourl(long id, String photourl) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("update Staff s set s.photourl=? where s.id=?");
			query.setParameter(0, photourl);
			query.setParameter(1, id);
			
			query.executeUpdate();
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
	public String getStaffPhotourlById(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts=  session.beginTransaction();
			
			Query query = session.createQuery("select photourl from Staff where id=?");
			query.setParameter(0, id);
			query.setMaxResults(1);
			String s = (String) query.uniqueResult();
			return s;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

}
