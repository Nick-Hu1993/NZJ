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
	public List<VUser> getChildByParent(Integer start, Integer limit, Long[] parent) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery = session
					.createSQLQuery("SELECT * FROM v_user WHERE id in (SELECT ul.child FROM user_link ul WHERE ul.parent in (:parent))");
//			for (int i = 0; i <= parent.length; i++) {
//				sqlQuery.setParameter(0, parent[i]);
//			}
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
			sqlQuery.addEntity(VUser.class);//对应实体类
			List<VUser> li = sqlQuery.setParameterList("parent", parent, Hibernate.LONG).list();
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
