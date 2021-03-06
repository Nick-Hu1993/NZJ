package org.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.dao.TraineeDao;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Trainee;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

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
	//学员的id本就是自增长的，无需输入userId
	public boolean upadteTraineebind (Long[] id, Integer bind) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("UPDATE Trainee t SET t.bind = ? WHERE t.id = ?");
			query.setParameter(0, bind);
			for (Long i: id) {
				query.setParameter(1, i);
			}
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
	public long getCountByBind(Integer bind, long user_id) {
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

	@Override
	public List<Integer> getTraineeStatus (Long[] id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			List<Integer> li = new ArrayList<>();
			Query query = session.createQuery("SELECT t.bind FROM Trainee t WHERE t.id = ?");
			
			for (Long l : id) {
				query.setParameter(0, l);
			Integer bind = (Integer)query.uniqueResult();
			li.add(bind);
			}
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
	@SuppressWarnings("unchecked")
	public List<Trainee> getTraineeByBindAndPay(Integer start, Integer limit,
			Integer bind, Integer pay, long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("FROM Trainee t WHERE t.bind = ? AND t.pay = ? AND t.userId = ? ORDER BY t.id");
			query.setParameter(0, bind);
			query.setParameter(1, pay);
			query.setParameter(2, userId);
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
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getCountByBindAndPay(Integer bind, Integer pay, long userId) {
		// TODO Auto-generated method stub
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("SELECT COUNT(*) FROM Trainee t WHERE t.bind = ? AND t.pay = ? AND t.userId = ?");
			query.setParameter(0, bind);
			query.setParameter(1, pay);
			query.setParameter(2, userId);
			query.setMaxResults(1);
			long count = (Long)query.uniqueResult();
			ts.commit();
			return count;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	/**
	 * 通过用户ID查询总学费
	 * @param userId
	 * @return
	 */
	@Override
	public List<Trainee> getTolTuition(Long userId){
		try {
         	List<Trainee> traineeList = new ArrayList<Trainee>();
             Session session = HibernateSessionFactory.getSession();
             Transaction ts = session.beginTransaction();
             SQLQuery query = session
                     .createSQLQuery("select sum(tuition) as tuition from trainee where user_id=?");
             query.setParameter(0, userId);
             traineeList = query.list();
             ts.commit();
             return traineeList;
         } catch (Exception e) {
             // TODO: handle exception
             e.printStackTrace();
             return null;
         } finally {
             HibernateSessionFactory.closeSession();
         }
	}

	@Override
	public List<Trainee> getTraineeListByTraineeId(Long[] TraineeId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			SQLQuery sqlQuery = session.createSQLQuery("SELECT * From trainee t WHERE t.id = :TraineeId");
			sqlQuery.setParameterList("TraineeId", TraineeId, Hibernate.LONG);
			sqlQuery.addEntity(Trainee.class);
			List<Trainee> li = sqlQuery.list();
			ts.commit();
			return li;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
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
