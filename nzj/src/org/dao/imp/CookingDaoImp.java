package org.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.dao.CookingDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Cooking;
import org.model.Language;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VCooking;
import org.view.VCookingId;

@Service
public class CookingDaoImp implements CookingDao{

	@Override
	public long addCooking(Cooking l) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			long id = (Long) session.save(l);
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
	public boolean deleteCooking(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			Cooking l = (Cooking) session.load(Cooking.class, id);
			session.delete(l);

			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updateCooking(Cooking l) {
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
	public List getCookingList() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from Cooking order by id");
			List l = (List) query.list();
			return l;
		} catch (Exception e) {
			e.printStackTrace();
			return null; 
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List getCookingByAuntId(long auntId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

//			String sql = "select c.name from aunt_cooking ac,cooking c where ac.cooking_id=c.id and ac.aunt_id=?";
			SQLQuery sqlQuery = session.createSQLQuery("select * from v_cooking where aunt_id=?");
			sqlQuery.setParameter(0, auntId);
			sqlQuery.addEntity(VCooking.class);
			
			List<VCooking> li = sqlQuery.list();
			List<VCookingId> list = new ArrayList<>();
			for(VCooking v:li){
				list.add(v.getId());
			}
			
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public boolean updateCookingByAuntId(long AuntId, long[] coId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery1 = session
					.createSQLQuery("delete from aunt_cooking where aunt_id=?");
			sqlQuery1.setParameter(0, AuntId);
			sqlQuery1.executeUpdate();

			for (long l : coId) {
				SQLQuery sqlQuery2 = session
						.createSQLQuery("insert into aunt_cooking(aunt_id,cooking_id) values(?,?)");

				sqlQuery2.setParameter(0, AuntId);
				sqlQuery2.setParameter(1, l);
				sqlQuery2.executeUpdate();
			}
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
