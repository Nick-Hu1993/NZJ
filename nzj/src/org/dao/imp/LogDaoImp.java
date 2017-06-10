package org.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.dao.LogDao;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.Log;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;
import org.view.VLog;
import org.view.VLogId;

@Service
public class LogDaoImp implements LogDao{

	@Override
	public long addLog(Log l) {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts= session.beginTransaction();
			
			long id = (Long) session.save(l);
			ts.commit();
			return id;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public List getLogList(Integer start, Integer limit) {
		try {
			Session session =HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();
			
			String sql ="select * from v_log order by time desc";
			SQLQuery sqlQuery = session.createSQLQuery(sql);
			sqlQuery.addEntity(VLog.class);
			if (start == null) {
				start = 0;
			}
			sqlQuery.setFirstResult(start);
			if (limit == null) {
				limit = 15;
				sqlQuery.setMaxResults(limit);
			}else if(limit==-1){
				
			}else{
				sqlQuery.setMaxResults(limit);
			}
			List<VLog> li = sqlQuery.list();
			List<VLogId> list = new ArrayList<>();
			for(VLog v:li){
				list.add(v.getId());
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

	@Override
	public long getLogCount() {
		try {
			Session session = HibernateSessionFactory.getSession();
			Transaction ts = session.beginTransaction();

			Query query = session.createQuery("select count(v.id.id) from VLog v");
			query.setMaxResults(1);
			long count = (long) query.uniqueResult();
			
			return count;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}finally{
			HibernateSessionFactory.closeSession();
		}
	}

}
