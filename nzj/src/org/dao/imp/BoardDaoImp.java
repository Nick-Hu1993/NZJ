package org.dao.imp;

import java.util.Date;
import java.util.List;

import org.dao.BoardDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Board;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class BoardDaoImp implements BoardDao {

	@Override
	public long addBoard(Board b) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(b);
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
	public boolean deleteBoard(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Board b = (Board) session.load(Board.class, id);
			session.delete(b);

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
	public boolean updateBoard(Long id, String title, String description) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("update Board b set b.title=?,b.description=?,b.time=? where b.id=?");
			query.setParameter(0, title);
			query.setParameter(1, description);
			query.setParameter(2, new Date().getTime()/1000);
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
	public List getBoardList(Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("from Board order by time desc");
			if (start == null) {
				start = 0;
			}
			query.setFirstResult(start);
			if (limit == null) {
				limit = 15;
				query.setMaxResults(limit);
			}else if(limit==-1){
				
			}else{
				query.setMaxResults(limit);
			}
			List<Board> li = query.list();
			
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public String getUrlById(Long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts=  session.beginTransaction();
			
			SQLQuery sqlQuery = session.createSQLQuery("select url from board where id = ?");
			sqlQuery.setParameter(0,id);
			sqlQuery.setMaxResults(1);
			String u = (String) sqlQuery.uniqueResult();
			return u;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List getSearchBoardList(String key, Integer start, Integer limit) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts=session.beginTransaction();
			
			String sql = "from Board where title like :key or description like :key or name like :key";
			Query query = session.createQuery(sql);
			
			query.setString("key", "%"+key+"%");
			
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
			List<Board> li = query.list();
			
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Long getSearchBoardCount(String key) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			String sql = "select count(id) from Board where title like :key or description like :key";
			Query query = session.createQuery(sql);

			query.setString("key", "%"+key+"%");
			
			query.setMaxResults(1);
			Long count = (Long) query.uniqueResult();

			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1L;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public Long getBoardCount() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			Query query = session.createQuery("select count(id) from Board");
			query.setMaxResults(1);
			Long count  = (Long) query.uniqueResult();
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1L;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

}
