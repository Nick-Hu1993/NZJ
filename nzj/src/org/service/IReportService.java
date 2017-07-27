package org.service;

import org.model.ReportVO;

/**
 * Created by Administrator on 2017/7/19.
 */
public interface IReportService {

    /**
     * 查询客户总金额，培训总额，加盟总额，总金额
     * @param userId
     * @param rankId
     * @return
     */
    public ReportVO getAmountList (Long userId, Integer rankId);
    /**
     * 查询饼图
     * @param userId
     * @return
     */
    public ReportVO getPieAmountList(Long userId,Integer rankId);
}
