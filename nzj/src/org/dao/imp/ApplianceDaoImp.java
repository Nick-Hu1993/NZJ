package org.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.dao.ApplianceDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Appliance;
import org.model.Language;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VAppliance;
import org.view.VApplianceId;
import org.view.VSkill;
import org.view.VSkillId;

@Service
public class ApplianceDaoImp implements ApplianceDao {

	@Override
	public long addAppliance(Appliance l) {
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
	public boolean deleteAppliance(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			Appliance l = (Appliance) session.load(Appliance.class, id);
			session.delete(l);
			
//			Query query = session.createQuery("delete from table");
			
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
	public boolean updateAppliance(Appliance l) {
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
	public List getApplianceList() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from Appliance order by id");
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
	public List getApplianceByAuntId(long auntId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
//			String sql = "select a.name from aunt_appliance aa,appliance a where aa.appliance_id=a.id and aa.aunt_id=?";
			SQLQuery sqlQuery = session.createSQLQuery("select * from v_appliance where aunt_id=?");
			sqlQuery.setParameter(0, auntId);

			sqlQuery.addEntity(VAppliance.class);

			List<VAppliance> li = sqlQuery.list();
			List<VApplianceId> list = new ArrayList<>();
			for (VAppliance v : li) {
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
	public boolean updateApplianceByAuntId(long AuntId, long[] apId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery1 = session
					.createSQLQuery("delete from aunt_appliance where aunt_id=?");
			sqlQuery1.setParameter(0, AuntId);
			sqlQuery1.executeUpdate();

			for (long l : apId) {
				SQLQuery sqlQuery2 = session
						.createSQLQuery("insert into aunt_appliance(aunt_id,appliance_id) values(?,?)");

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
