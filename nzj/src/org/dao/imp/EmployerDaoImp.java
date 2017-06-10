package org.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.Form.EmployerTrackingForm;
import org.dao.EmployerDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.model.Employer;
import org.model.EmployerTracking;
import org.springframework.stereotype.Service;
import org.tool.ChangeTime;
import org.util.HibernateSessionFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class EmployerDaoImp implements EmployerDao {

	@Override
	// 正常就返回id号，否则返回-1
	public long addEmployer(Employer e) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(e);
			ts.commit();
			return id;
		} catch (Exception e1) {
			e1.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean addEmployerTacking(final EmployerTrackingForm et) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			// 采用JDBC API进行插入，提升系统性能
			session.doWork(new Work() {
				@Override
				public void execute(Connection conn) throws SQLException {
					String sql = "insert into employer_tracking(etime,econtent,employer_id) value(?,?,?)";
					PreparedStatement stmt = conn.prepareStatement(sql);
					conn.setAutoCommit(false);
					for (int i = 0; i < et.getEtime().length; i++) {
						stmt.setLong(1,Long.parseLong(ChangeTime.date2TimeStamp(et.getEtime()[i], "yyyy-MM-dd")));
						stmt.setString(2, et.getEcontent()[i]);
						stmt.setLong(3, et.getEmployerId());
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
	public boolean deleteEmployer(Long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("DELETE FROM Employer e WHERE id = ?");
			query.setParameter(0, id);
			Query query1 = session.createQuery("DELETE FROM EmployerTracking et WHERE employerId = ?");
			query1.setParameter(0, id);
			Integer i = query.executeUpdate();
			Integer k = query1.executeUpdate();
			ts.commit();
			// System.out.println("删除了" + i + "行");
			return true;
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	
	@Override
	public boolean deleteEmployerTracking (long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("DELETE FROM EmployerTracking et WHERE id = ?");
			query.setParameter(0, id);
			Integer i = query.executeUpdate();
			ts.commit();
			// System.out.println("删除了" + i + "行");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updateEmployer(Employer e) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("UPDATE Employer e SET e.time = ?, e.name = ?, e.phone = ?, e.address = ?, e.content = ? WHERE id = ?");
			query.setParameter(0, e.getTime());
			query.setParameter(1, e.getName());
			query.setParameter(2, e.getPhone());
			query.setParameter(3, e.getAddress());
			query.setParameter(4, e.getContent());
			query.setParameter(5, e.getId());
			Integer i = query.executeUpdate();
			System.out.println(i);
			ts.commit();
			return true;
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		}
	}
	
	@Override
	public boolean updateEmployerTacking (EmployerTracking et) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			session.update(et);
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Employer getEmployer(Long userId, String name, String phone) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("FROM Employer e WHERE e.userId = ? AND e.name = ? AND e.phone = ?");
			query.setParameter(0, userId);
			query.setParameter(1, name);
			query.setParameter(2, phone);
			query.setMaxResults(1); // 一开始就避免了重复所以即使有返回也只有一条。
			Employer e = (Employer) query.uniqueResult();
			return e; // 当数据库无此项记录时，返回的是null
		} catch (Exception e1) {
			e1.printStackTrace();
			return new Employer(); // 如果这里也写返回null，当网络异常等问题出现时也会返回null，业务逻辑中返回null才是可继续操作的标准，
									// 这种情况时，会使本来不可继续操作的情况，变成可以操作。
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Employer getEmployerById(Long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("FROM Employer WHERE id = ?");
			query.setParameter(0, id);
			query.setMaxResults(1);
			Employer e = (Employer) query.uniqueResult();
			return e;
		} catch (Exception e1) {
			e1.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	
	@Override
	public long getEmployerCountById (Long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("SELECT COUNT(*) FROM Employer WHERE userId = ?");
			query.setParameter(0, id);
			query.setMaxResults(1);
			long pageCount = (long) query.uniqueResult();
			return pageCount;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}	

	@Override
	public long getEmployerCountByIdStatus(Long id, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("SELECT COUNT(*) FROM Employer WHERE userId = ? AND status = ?");
			query.setParameter(0, id);
			query.setParameter(1, status);
			query.setMaxResults(1);
			long pageCount = (long) query.uniqueResult();
			return pageCount;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<Employer> getEmployerList(Integer start, Integer limit,
			Long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("from Employer where userId=? order by id desc");
			query.setParameter(0, userId);
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

			List<Employer> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	
	@Override
	public List<EmployerTracking> getEmployerTrackingByemployerId (Integer start, Integer limit, Long employerId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			String sql = "FROM EmployerTracking WHERE employerId = ? ORDER BY id DESC";
			Query query = session.createQuery(sql);
			query.setParameter(0, employerId);
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
			List<EmployerTracking> li = query.list();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<Employer> getEmpolyerListByStatus(Integer start, Integer limit,
			Long userId, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Employer e WHERE e.userId = ? AND e.status = ?");
			query.setParameter(0, userId);
			query.setParameter(1, status);
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
			List<Employer> li = query.list();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
}
