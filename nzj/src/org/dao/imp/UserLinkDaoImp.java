package org.dao.imp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dao.UserLinkDao;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.UserLink;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VUser;

@Service
public class UserLinkDaoImp implements UserLinkDao {

	@Override
	public long addUserLink(UserLink ul) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(ul);
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
	public long getParentByChild(Long child) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("select parent from UserLink where child=?");

			query.setParameter(0, child);
			query.setMaxResults(1);
			long id = (long) query.uniqueResult();

			return id;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<VUser> getChildByParentAndSupport(Integer start, Integer limit,
			Long[] parent, Integer support) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery = session
					.createSQLQuery("SELECT * FROM v_user vu WHERE id in (SELECT ul.child FROM user_link ul WHERE ul.parent in (:parent)) AND vu.support = :support ORDER BY vu.id DESC");
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
			sqlQuery.addEntity(VUser.class);// 对应实体类
			sqlQuery.setParameterList("parent", parent, Hibernate.LONG);//使用数组赋值
			sqlQuery.setParameter("support", support);
			List<VUser> li = sqlQuery.list();
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
	public long getCountByParentAndSupport(Long[] parent, Integer support) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			SQLQuery sqlquery = session.createSQLQuery("SELECT COUNT(*) FROM v_user vu WHERE id in (SELECT ul.child FROM user_link ul WHERE ul.parent in (:parent)) AND vu.support = :support");
			sqlquery.setParameterList("parent", parent, Hibernate.LONG);
			sqlquery.setParameter("support", support);
			sqlquery.addScalar("COUNT(*)", Hibernate.LONG);
			sqlquery.setMaxResults(1);
			long count = (Long)sqlquery.uniqueResult();
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
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Long> getChildListByParent(Long parent) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery = session
					.createSQLQuery("SELECT id FROM v_user WHERE id in (SELECT ul.child FROM user_link ul WHERE ul.parent =?)");
			List<Long> li = sqlQuery.setParameter(0, parent).list();
			ts.commit();
			return li;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
}
