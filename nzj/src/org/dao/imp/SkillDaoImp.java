package org.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.dao.SkillDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Cooking;
import org.model.Skill;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VLanguage;
import org.view.VLanguageId;
import org.view.VSkill;
import org.view.VSkillId;

@Service
public class SkillDaoImp implements SkillDao {

	@Override
	public long addSkill(Skill l) {
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
	public boolean deleteSkill(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			Skill l = (Skill) session.load(Skill.class, id);
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
	public boolean updateSkill(Skill l) {
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
	public List getSkillList() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from Skill order by id");
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
	public List getSkillByAuntId(long auntId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			// String sql =
			// "select s.name from aunt_skill ask,skill s where ask.skill_id=s.id and ask.aunt_id=?";
			SQLQuery sqlQuery = session
					.createSQLQuery("select * from v_skill where aunt_id=?");
			sqlQuery.setParameter(0, auntId);

			sqlQuery.addEntity(VSkill.class);

			List<VSkill> li = sqlQuery.list();
			List<VSkillId> list = new ArrayList<>();
			for (VSkill v : li) {
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
	public boolean updateSkillByAuntId(long AuntId, long[] skId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery1 = session
					.createSQLQuery("delete from aunt_skill where aunt_id=?");
			sqlQuery1.setParameter(0, AuntId);
			sqlQuery1.executeUpdate();

			for (long l : skId) {
				SQLQuery sqlQuery2 = session
						.createSQLQuery("insert into aunt_skill(aunt_id,skill_id) values(?,?)");

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
