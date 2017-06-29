package org.dao.imp;

import java.util.List;

import org.dao.PriceDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Price;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

@Service
public class PriceDaoImp implements PriceDao {

	@Override
	public boolean updatePrice(long id, Double price) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("UPDATE Price p SET p.price = ? WHERE id = ?  ");
			query.setParameter(0, price);
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
	public Double getPrice(long userId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery = session
					.createSQLQuery("SELECT p.price FROM price p WHERE p.rank = (SELECT u.rank FROM user u WHERE u.id = ? )");
			sqlQuery.setParameter(0, userId);
			sqlQuery.setMaxResults(1);// 仅有一个结果
			Double price = (Double) sqlQuery.uniqueResult();
			ts.commit();
			return price;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List<Price> getPriceList() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("FROM Price p");
			List<Price> li = query.list();
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
	public Double getPriceByRank(Integer rank) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session
					.createQuery("SELECT p.price FROM Price p WHERE P.rank = ?");
			query.setParameter(0, rank);
			query.setMaxResults(1);
			Double price = (Double) query.uniqueResult();
			ts.commit();
			return price;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}
}
