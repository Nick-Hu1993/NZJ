package org.controller;

import org.model.ReportVO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.service.IReportService;

/**
 * Created by Administrator on 2017/7/19.
 */

@Controller
@RequestMapping("reportController")
public class ReportController {

    @Autowired
    private IReportService reportService;

    /**
     * 查询折线图
     * @param userId
     * @param rankId
     * @return
     */
    @RequestMapping("/getTolAmountList")
    @ResponseBody
    public ReportVO getAmountList (Long userId, Integer rankId) {
        //
        return reportService.getAmountList(userId, rankId);

    }
    
    /**
     * 查询饼图金额
     * @param userId
     * @return
     */
    @RequestMapping("/getPieAmountList")
    @ResponseBody
    public ReportVO getPieAmountList(Long userId,Integer rankId){
    	 //
        return reportService.getPieAmountList(userId,rankId);
    }
}
