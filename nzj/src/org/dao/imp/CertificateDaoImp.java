package org.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.dao.CertificateDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Certificate;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VAppliance;
import org.view.VApplianceId;
import org.view.VCertificate;
import org.view.VCertificateId;

@Service
public class CertificateDaoImp implements CertificateDao{

	@Override
	public long addCertificate(Certificate l) {
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
	public boolean deleteCertificate(long id) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			Certificate l = (Certificate) session.load(Certificate.class, id);
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
	public boolean updateCertificate(Certificate l) {
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
	public List getCertificateList() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("from Certificate order by id");
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
	public List getCertificateByAuntId(long auntId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

//			String sql = "select c.name from aunt_certificate ac,certificate c where ac.certificate_id=c.id and ac.aunt_id=?";
			
			SQLQuery sqlQuery = session.createSQLQuery("select * from v_certificate where aunt_id=?");
			sqlQuery.setParameter(0, auntId);
			
			sqlQuery.addEntity(VCertificate.class);

			List<VCertificate> li = sqlQuery.list();
			List<VCertificateId> list = new ArrayList<>();
			for (VCertificate v : li) {
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
	public boolean updateCertificateByAuntId(long AuntId, long[] ceId) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			SQLQuery sqlQuery1 = session
					.createSQLQuery("delete from aunt_certificate where aunt_id=?");
			sqlQuery1.setParameter(0, AuntId);
			sqlQuery1.executeUpdate();

			for (long l : ceId) {
				SQLQuery sqlQuery2 = session
						.createSQLQuery("insert into aunt_certificate(aunt_id,certificate_id) values(?,?)");

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
