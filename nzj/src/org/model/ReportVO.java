package org.model;

import java.io.Serializable;
import java.util.List;
import org.model.Pact;

/**
 * Created by Administrator on 2017/7/19.
 */
public class ReportVO implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer rankId;

    private List<JoinAccount> cityJoinAmountList;
    private List<JoinAccount> provinceJoinAmountList;
    private List<OrderAccount> provinceTrainAmountList;
    private List<OrderAccount> cityTrainAmountList;
    private List<String> monthList; 
    private List<Pact> guestAmountList;
    
    //总学费
    private List<Trainee> traineeList;
    
	public Integer getRankId() {
		return rankId;
	}
	public void setRankId(Integer rankId) {
		this.rankId = rankId;
	}
	public List<JoinAccount> getCityJoinAmountList() {
		return cityJoinAmountList;
	}
	public void setCityJoinAmountList(List<JoinAccount> cityJoinAmountList) {
		this.cityJoinAmountList = cityJoinAmountList;
	}
	public List<JoinAccount> getProvinceJoinAmountList() {
		return provinceJoinAmountList;
	}
	public void setProvinceJoinAmountList(List<JoinAccount> provinceJoinAmountList) {
		this.provinceJoinAmountList = provinceJoinAmountList;
	}
	public List<OrderAccount> getProvinceTrainAmountList() {
		return provinceTrainAmountList;
	}
	public void setProvinceTrainAmountList(
			List<OrderAccount> provinceTrainAmountList) {
		this.provinceTrainAmountList = provinceTrainAmountList;
	}
	public List<OrderAccount> getCityTrainAmountList() {
		return cityTrainAmountList;
	}
	public void setCityTrainAmountList(List<OrderAccount> cityTrainAmountList) {
		this.cityTrainAmountList = cityTrainAmountList;
	}
	public List<String> getMonthList() {
		return monthList;
	}
	public void setMonthList(List<String> monthList) {
		this.monthList = monthList;
	}
	public List<Pact> getGuestAmountList() {
		return guestAmountList;
	}
	public void setGuestAmountList(List<Pact> guestAmountList) {
		this.guestAmountList = guestAmountList;
	}
	public List<Trainee> getTraineeList() {
		return traineeList;
	}
	public void setTraineeList(List<Trainee> traineeList) {
		this.traineeList = traineeList;
	}
    
   
}
