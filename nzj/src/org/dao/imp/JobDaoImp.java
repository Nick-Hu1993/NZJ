package org.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.dao.JobDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Job;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VCertificate;
import org.view.VCertificateId;
import org.view.VJob;
import org.view.VJobId;

@Service
public class JobDaoImp implements JobDao{

	@Override
	public long addJob(Job l) {
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
	public boolean deleteJob(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			Job l = (Job) session.load(Job.class, id);
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
	public boolean updateJob(Job l) {
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
	public List getJobList() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from Job order by id");
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
	public List getJobByAuntId(long auntId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

//			String sql = "select j.name from aunt_job aj,job j where aj.job_id=j.id and aj.aunt_id=?";
			
			SQLQuery sqlQuery = session.createSQLQuery("select * from v_job where aunt_id=?");
			sqlQuery.setParameter(0, auntId);
			
			sqlQuery.addEntity(VJob.class);

			List<VJob> li = sqlQuery.list();
			List<VJobId> list = new ArrayList<>();
			for (VJob v : li) {
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
	public boolean updateJobByAuntId(long AuntId, long[] joId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery1 = session
					.createSQLQuery("delete from aunt_job where aunt_id=?");
			sqlQuery1.setParameter(0, AuntId);
			sqlQuery1.executeUpdate();

			for (long l : joId) {
				SQLQuery sqlQuery2 = session
						.createSQLQuery("insert into aunt_job(aunt_id,job_id) values(?,?)");

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
