package org.service.imp;

import org.dao.IReportDao;
import org.dao.TraineeDao;
import org.model.ReportVO;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.service.IReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.dao.PactDao;
import org.model.Pact;
import org.model.OrderAccount;
import org.model.Trainee;
import org.dao.UserLinkDao;
import org.model.JoinAccount;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administrator on 2017/7/19.
 */
@Service
public class ReportServiceImp implements IReportService {

    @Autowired
    private PactDao pactDao;
    @Autowired
    private IReportDao reportDao;
    @Autowired
    private UserLinkDao userLinkDao;
    @Autowired
    private TraineeDao traineeDao;

    /**
     * 查询客户总金额，培训总额，加盟总额，总金额
     * @param userId
     * @param rankId
     * @return
     */
    @Override
    public ReportVO getAmountList(Long userId, Integer rankId) {
        //查询客户总金额
        ReportVO reportVO = new ReportVO();
        reportVO.setRankId(rankId);
        List<Pact> pactList= pactDao.getGuestAmount(userId);
        reportVO.setGuestAmountList(pactList);
        //查询月份
        List<String> monthList =  reportDao.getMonthList();
        reportVO.setMonthList(monthList);
        //查询培训金额
        List<OrderAccount> provinceList = new ArrayList<OrderAccount>();
        List<OrderAccount> cityList = new ArrayList<OrderAccount>();
        //查询加盟总额
        List<JoinAccount> joinprovinceList = new ArrayList<JoinAccount>();
        List<JoinAccount> joincityList = new ArrayList<JoinAccount>();
        if(rankId == 2){
        	List<Long> cityUserId = userLinkDao.getChildListByParent(userId);
        	cityUserId.add(userId);
            //省级代表培训金额
            provinceList = reportDao.getProvinceAmount(cityUserId);
            
            //省级代表加盟金额
            joinprovinceList = reportDao.getProvinceJoinAmountByMonth(cityUserId);
        }else if(rankId == 3){
        	List<Long> users = new ArrayList<Long>();
        	users.add(userId);
            //市级代表培训金额
            cityList = reportDao.getProvinceAmount(users);

            //市级代表加盟金额
            joincityList = reportDao.getCityJoinAmountByMonth(users);
        }
        reportVO.setCityJoinAmountList(joincityList);
        reportVO.setProvinceJoinAmountList(joinprovinceList);
        reportVO.setProvinceTrainAmountList(provinceList);
        reportVO.setCityTrainAmountList(cityList);
        return reportVO;
    }

    /**
     * 查询饼图
     */
    @Override
    public ReportVO getPieAmountList(Long userId,Integer rankId){
    	ReportVO reportVO = new ReportVO();
    	//通过用户ID查询各服务人群的总金额
    	List<Pact> pactList =  pactDao.findTolCostByUserId(userId);
    	//查询总学费
    	List<Trainee> traineeList = traineeDao.getTolTuition(userId);
    	//查询加盟总额
        List<JoinAccount> joinprovinceList = new ArrayList<JoinAccount>();
        List<JoinAccount> joincityList = new ArrayList<JoinAccount>();
        if(rankId == 2){
        	List<Long> cityUserId = userLinkDao.getChildListByParent(userId);
        	cityUserId.add(userId);
            //省级代表加盟金额
            joinprovinceList = reportDao.getPieProvinceJoinAmount(cityUserId);
        }else if(rankId == 3){
        	List<Long> users = new ArrayList<Long>();
        	users.add(userId);

            //市级代表加盟金额
            joincityList = reportDao.getPieCityJoinAmount(users);
        }
        reportVO.setGuestAmountList(pactList);
        reportVO.setTraineeList(traineeList);
        reportVO.setProvinceJoinAmountList(joinprovinceList);
        reportVO.setCityJoinAmountList(joincityList);
        return reportVO;
    }
}
