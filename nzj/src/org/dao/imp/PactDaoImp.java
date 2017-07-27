package org.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.Form.PactTrackingForm;
import org.dao.PactDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.jdbc.Work;
import org.model.Pact;
import org.model.PactTracking;
import org.springframework.stereotype.Service;
import org.tool.ChangeTime;
import org.util.HibernateSessionFactory;

import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class PactDaoImp implements PactDao {

	@Override
	public long addPact(Pact p) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long l = (Long) session.save(p);
			ts.commit();
			return l;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean deletePact(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Pact p = (Pact) session.load(Pact.class, id);
			session.delete(p);
			
			SQLQuery sqlQuery = session.createSQLQuery("delete from pact_tracking where pact_id=?");
			sqlQuery.setParameter(0, id);
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

	@Override
	public boolean updatePact(Pact p) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			session.update(p);
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
	public Pact getPactByCode(String code) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("FROM Pact p WHERE p.code = ?");
			query.setParameter(0, code);
			query.setMaxResults(1);
			Pact p = (Pact) query.uniqueResult();
			return p;
		} catch (Exception e) {
			e.printStackTrace();
			return new Pact();
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<Pact> getPactList(Long userId, Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("FROM Pact p WHERE p.userId = ? order by p.id desc");
			query.setParameter(0, userId);
			if (start == null) {
				start = 0;
			}
			query.setParameter(0, userId);
			if (limit == null) {
				limit = 15;
				query.setMaxResults(limit);
			} else if (limit == -1) {

			} else {
				query.setMaxResults(limit);
			}
			List<Pact> li = query.list();

			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getPactCountById(Long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("SELECT COUNT(id) FROM Pact WHERE userId = ?");
			query.setParameter(0, id);
			query.setMaxResults(1);
			long count = (long) query.uniqueResult();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	
	@Override
	public long getPactCountByStatus (Long id, Integer status) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("SELECT COUNT(*) FROM Pact WHERE userId = ? AND status = ?");
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
	public boolean addPactTracking(final Long pactId,final PactTrackingForm pt) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			session.doWork(new Work() {
				@Override
				public void execute(Connection conn) throws SQLException {
					String sql = "insert into pact_tracking(ttime,content,pact_id) value(?,?,?)";
					PreparedStatement stmt = conn.prepareStatement(sql);
					conn.setAutoCommit(false);
					for(int i=0;i<pt.getContent().length;i++){
						stmt.setLong(1, Long.parseLong(ChangeTime.date2TimeStamp(pt.getTtime()[i], "yyyy-MM-dd")));
						stmt.setString(2, pt.getContent()[i]);
						stmt.setLong(3, pactId);
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
	public boolean deletePactTracking(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts  = session.beginTransaction();
			
			PactTracking pt = (PactTracking) session.load(PactTracking.class, id);
			session.delete(pt);
			
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updatePactTracking(PactTracking pt) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			session.update(pt);
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
	public List<PactTracking> getPactTrackingList(Long packId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("from PactTracking where pactId=?");
			query.setParameter(0, packId);
			List<PactTracking> li = query.list();
			
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<Pact> getPactListByStatus(Integer start, Integer limit,
			Long userId, Integer status) {
		try {
			System.out.println(userId + status);
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Pact p WHERE p.userId = ? AND p.status = ?");
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
			List<Pact> li = query.list();
			System.out.println(new ObjectMapper().writeValueAsString(li));
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<Pact> getPactListByEmployerId(Integer start, Integer limit,
			Long employerId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Pact p WHERE p.employerId = ?");
			query.setParameter(0, employerId);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(limit);
			List<Pact> li = query.list();
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
	public long getCountByEmployerId(long employerId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM Pact p WHERE p.employerId = ?");
			query.setParameter(0, employerId);
			query.setMaxResults(1);
			long count = (Long)query.uniqueResult();
			ts.commit();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getCountByPactId(long packId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM PactTracking pt WHERE pt.pactId = ?");
			query.setParameter(0, packId);
			query.setMaxResults(1);
			long count = (Long)query.uniqueResult();
			ts.commit();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Pact getPactById(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Pact p WHERE id = ?");
			query.setParameter(0, id);
			query.setMaxResults(1);
			Pact p = (Pact)query.uniqueResult();
			ts.commit();
			return p;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<Pact> getGuestAmount(long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			Query query = session.createSQLQuery("select monthno as monthNo,ifnull(m.cost,0.0) as guestAmount from past_12_month_view "+
					"left join (select yearmonthno,sum(cost) as cost from (select DATE_FORMAT(FROM_UNIXTIME "+
					"(ptime),'%Y-%m') as yearmonthno,cost from pact where user_id=?) as ti group by yearmonthno) m on "+
					"monthno=m.yearmonthno order by monthNo");
			query.setParameter(0, userId);
			List<Pact> pactList = query.list();
			ts.commit();
			return pactList;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
	
	public List<Pact> findTolCostByUserId(Long userId){
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			Query query = session.createSQLQuery("select category,sum(cost) from pact where user_id=? group by category");
			query.setParameter(0, userId);
			List<Pact> pactList = query.list();
			ts.commit();
			return pactList;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
}
