package org.dao.imp;

import java.util.List;

import org.dao.TraineeDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.OrderTrainee;
import org.model.Trainee;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

import sun.print.resources.serviceui;

@Service
public class TraineeDaoImp implements TraineeDao {

	@Override
	public long addTrainee(Trainee t) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(t);
			ts.commit();
			return id;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean deleteTrainee(long[] id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			//采用hibernate映射类的方法进行删除
			for (long idList: id) {
				Trainee t = (Trainee)session.load(Trainee.class, idList);
				if (t != null) 
					session.delete(t);
			}
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
	public boolean updateTrainee(Trainee t) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			session.update(t);
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
	public boolean updateTraineePay (long id, Integer pay) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("UPDATE Trainee t SET t.pay = ? WHERE id = ?");
			query.setParameter(0, pay);
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
	public List<Trainee> getTraineesListByPay(Integer start, Integer limit,
			Integer pay, long user_id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Trainee o WHERE user_id = ? AND pay = ?");
			query.setParameter(0, user_id);
			query.setParameter(1, pay);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				start = 15;
			}
			query.setMaxResults(15);
			List<Trainee> li = query.list();
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
	public List<Trainee> getTraineeListByBind(Integer start, Integer limit,
			Integer bind, long user_id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Trainee t Where bind = ? AND user_id = ?");
			query.setParameter(0, bind);
			query.setParameter(1, user_id);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(limit);
			List<Trainee> li = query.list();
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
	public long getCountByPay(Integer pay, long user_id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM Trainee t WHERE user_id = ? AND pay = ?");
			query.setParameter(0, user_id);
			query.setParameter(1, pay);
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
	public long geCountByBind(Integer bind, long user_id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM Trainee t WHERE user_id = ? AND bind = ?");
			query.setParameter(0, user_id);
			query.setParameter(1, bind);
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
	public List<Trainee> getTraineeById(Integer start, Integer limit, long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Trainee t WHERE t.userId = ?");
			query.setParameter(0, id);
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(15);
			List<Trainee> li = query.list();
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
	public long getCountById(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM Trainee t WHERE t.userId = ?");
			query.setParameter(0, id);
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
	public List<Trainee> getTraineeList (Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Trainee t");
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
			}
			query.setMaxResults(limit);
			List<Trainee> li = query.list();
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
	public long getCount() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM Trainee t");
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

//	@Override
//	public boolean getOrderTrainee(Long trainee_id) {
//		try {
//			Session session = HibernateSessionFactory.getSession();
//			Transaction ts = session.beginTransaction();
//
//			Query query = session
//					.createQuery("from OrderTrainee where traineeId=?");
//			query.setParameter(0, trainee_id);
//			query.setMaxResults(1);
//			OrderTrainee ot = (OrderTrainee) query.uniqueResult();
//			
//			if(ot==null)
//				return false;
//			else
//				return true;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return false;
//		}finally{
//			HibernateSessionFactory.closeSession();
//		}
//	}

}
