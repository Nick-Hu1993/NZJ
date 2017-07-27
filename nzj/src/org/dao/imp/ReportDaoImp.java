package org.dao.imp;

import java.util.ArrayList;
import java.util.List;

import org.dao.IReportDao;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.model.JoinAccount;
import org.model.OrderAccount;
import org.springframework.stereotype.Service;
import org.util.HibernateSessionFactory;

/**
 * Created by Administrator on 2017/7/19.
 */
@Service
public class ReportDaoImp implements IReportDao {

    /**
     * 获取省级用户培训总金额
     * @param userId
     * @return
     */
    @SuppressWarnings("unchecked")
	@Override
    public List<OrderAccount> getProvinceAmount(List<Long> userIds) {
        try {
        	List<OrderAccount> orderList = new ArrayList<OrderAccount>();
            Session session = HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            SQLQuery sqlQuery = session
                    .createSQLQuery("select t.monthno as monthNo,ifnull(m.provinceprice,0.0) as tolProvincePrice from past_12_month_view t left join (select DATE_FORMAT(FROM_UNIXTIME" +
                            "(atime),'%Y-%m') as yearmonthno,sum(provinceprice) as provinceprice from v_order_account where user_id=(:userIds) group by yearmonthno) m on t.monthno=m.yearmonthno order by monthNo");
            //query.setParameter(0, userId);
            sqlQuery.setParameterList("userIds", userIds, Hibernate.LONG);
            orderList = sqlQuery.list();
            ts.commit();
            return orderList;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        } finally {
            HibernateSessionFactory.closeSession();
        }
    }

        /**
         * 获取市级用户培训总金额
         * @param userId
         * @return
         */
        @SuppressWarnings("unchecked")
		@Override
        public List<OrderAccount>  getCityAmount(Long userId){
            try {
            	List<OrderAccount> orderList = new ArrayList<OrderAccount>();
                Session session = HibernateSessionFactory.getSession();
                Transaction ts = session.beginTransaction();
                SQLQuery query = session
                        .createSQLQuery("select t.monthno as monthNo,ifnull(m.cityprice,0.0) as tolCityPrice from past_12_month_view t left join (select DATE_FORMAT(FROM_UNIXTIME" +
                                "(atime),'%Y-%m') as yearmonthno,sum(cityprice) as cityprice from v_order_account where user_id=? group by yearmonthno) m on t.monthno=m.yearmonthno order by monthNo");
                query.setParameter(0, userId);
				orderList = query.list();
                ts.commit();
                return orderList;
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
                return null;
            } finally {
                HibernateSessionFactory.closeSession();
            }
        }

    /**
     * 获取市级用户加盟总金额
     * @param userId
     * @return
     */
    @SuppressWarnings("unchecked")
	@Override
    public List<JoinAccount>  getCityJoinAmountByMonth(List<Long> userIds){
        try {
        	List<JoinAccount> orderList = new ArrayList<JoinAccount>();
            Session session = HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            SQLQuery query = session
                    .createSQLQuery("select t.monthno as monthNo,ifnull(m.cityprice,0.0) as tolCityprice from past_12_month_view t left join (select DATE_FORMAT(FROM_UNIXTIME" +
                            "(atime),'%Y-%m') as yearmonthno,sum(cityprice) as cityprice from v_joinorder_account where user_id in (:userIds) group by yearmonthno) m on t.monthno=m.yearmonthno order by monthNo");
            query.setParameterList("userIds", userIds,Hibernate.LONG);
			orderList = query.list();
            ts.commit();
            return orderList;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        } finally {
            HibernateSessionFactory.closeSession();
        }
    }

    /**
     *通过每月获取省级用户加盟总金额
     * @param userId
     * @return
     */
    @SuppressWarnings("unchecked")
	@Override
    public List<JoinAccount>  getProvinceJoinAmountByMonth(List<Long> userIds){
        try {
        	List<JoinAccount> orderList = new ArrayList<JoinAccount>();
            Session session = HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            SQLQuery query = session
                    .createSQLQuery("select t.monthno as monthNo,ifnull(m.provinceprice,0.0) as tolProvinceprice from past_12_month_view t left join (select DATE_FORMAT(FROM_UNIXTIME" +
                            "(atime),'%Y-%m') as yearmonthno,sum(provinceprice) as provinceprice from v_joinorder_account where user_id in (:userIds) group by yearmonthno) m on t.monthno=m.yearmonthno order by monthNo");
            query.setParameterList("userIds", userIds, Hibernate.LONG);
			orderList = query.list();
            ts.commit();
            return orderList;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        } finally {
            HibernateSessionFactory.closeSession();
        }
    }
    
    /**
     * 查询月份
     */
    @SuppressWarnings("unchecked")
    @Override
	public List<String> getMonthList(){
    	try {
        	List<String> orderList = new ArrayList<String>();
            Session session = HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            Query query = session
                    .createSQLQuery("select t.monthno as monthNo from past_12_month_view t order by monthNo");
			orderList = query.list();
            ts.commit();
            return orderList;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        } finally {
            HibernateSessionFactory.closeSession();
        }
    }
    
    /**
     *为饼图展示加盟省级总金额
     * @param userId
     * @return
     */
    @SuppressWarnings("unchecked")
	@Override
    public List<JoinAccount>  getPieProvinceJoinAmount(List<Long> userIds){
        try {
        	List<JoinAccount> orderList = new ArrayList<JoinAccount>();
            Session session = HibernateSessionFactory.getSession();
            Transaction ts = session.beginTransaction();
            SQLQuery query = session
                    .createSQLQuery("select sum(provinceprice) as tolProvinceprice from v_joinorder_account where user_id in (:userIds)");
            query.setParameterList("userIds", userIds, Hibernate.LONG);
			orderList = query.list();
            ts.commit();
            return orderList;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return null;
        } finally {
            HibernateSessionFactory.closeSession();
        }
    }
    
    /**
     * 为饼图获取市级用户加盟总金额
     * @param userId
     * @return
     */
    @SuppressWarnings("unchecked")
	@Override
    public List<JoinAccount>  getPieCityJoinAmount(List<Long> userId){
    	 try {
         	List<JoinAccount> orderList = new ArrayList<JoinAccount>();
             Session session = HibernateSessionFactory.getSession();
             Transaction ts = session.beginTransaction();
             SQLQuery query = session
                     .createSQLQuery("select sum(cityprice) as tolCityprice from v_joinorder_account where user_id in (:userIds)");
             query.setParameterList("userIds", userId,Hibernate.LONG);
 			orderList = query.list();
             ts.commit();
             return orderList;
         } catch (Exception e) {
             // TODO: handle exception
             e.printStackTrace();
             return null;
         } finally {
             HibernateSessionFactory.closeSession();
         }
    }
}
