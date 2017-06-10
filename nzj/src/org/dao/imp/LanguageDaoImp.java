package org.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.dao.LanguageDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Language;
import org.model.User;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VLanguage;
import org.view.VLanguageId;

@Service
public class LanguageDaoImp implements LanguageDao {

	@Override
	public long addLanguage(Language l) {
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
	public boolean deleteLanguage(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			Language l = (Language) session.load(Language.class, id);
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
	public boolean updateLanguage(Language l) {
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
	public List getLanguageList() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from Language order by id");
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
	public List getLanguageByAuntId(long auntId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

//			String sql = "select l.id,l.name from aunt_language al,language l where al.language_id=l.id and al.aunt_id=?";
			SQLQuery sqlQuery = session.createSQLQuery("select * from v_language where aunt_id=?");
			sqlQuery.setParameter(0, auntId);
			sqlQuery.addEntity(VLanguage.class);
			
			List<VLanguage> li = sqlQuery.list();
			List<VLanguageId> list = new ArrayList<>();
			for(VLanguage v:li){
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
	public boolean updateLanguageByAuntId(long AuntId, long[] laId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery1 = session
					.createSQLQuery("delete from aunt_language where aunt_id=?");
			sqlQuery1.setParameter(0, AuntId);
			sqlQuery1.executeUpdate();

			for (long l : laId) {
				SQLQuery sqlQuery2 = session
						.createSQLQuery("insert into aunt_language(aunt_id,language_id) values(?,?)");

				sqlQuery2.setParameter(0, AuntId);
				sqlQuery2.setParameter(1, l);
				sqlQuery2.executeUpdate();
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

}
