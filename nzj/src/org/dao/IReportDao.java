package org.dao;
import org.model.OrderAccount;
import java.util.List;
import org.model.JoinAccount;
/**
 * Created by Administrator on 2017/7/19.
 */
public interface IReportDao {

    /**
     * 通过每月获取省级用户总金额
     * @param userId
     * @return
     */
    public List<OrderAccount>  getProvinceAmount(List<Long> userIds);

    /**
     * 通过每月获取市级用户总金额
     * @param userId
     * @return
     */
    public List<OrderAccount>  getCityAmount(Long userId);

    /**
     * 通过每月获取市级用户加盟总金额
     * @param userId
     * @return
     */
    public List<JoinAccount>  getCityJoinAmountByMonth(List<Long> userId);

    /**
     * 通过每月获取省级用户加盟总金额
     * @param userId
     * @return
     */
    public List<JoinAccount>  getProvinceJoinAmountByMonth(List<Long> userId);
    
    /**
     * 查询月份
     * @return
     */
    public List<String> getMonthList(); 
    /**
     * 为饼图展示加盟省级总金额
     * @param userIds
     * @return
     */
    public List<JoinAccount>  getPieProvinceJoinAmount(List<Long> userIds);
    
    /**
     * 为饼图获取市级用户加盟总金额
     * @param userId
     * @return
     */
    public List<JoinAccount>  getPieCityJoinAmount(List<Long> userId);
}
