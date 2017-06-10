package org.Form;
/*
 * 可批量添加多个追踪标签的接参类*/
public class EmployerTrackingForm implements java.io.Serializable {
	private Long[] id;
	private String[] etime;		//时间
	private String[] econtent;	//进展
	private Long employerId;
	
	public Long[] getId() {
		return id;
	}
	public void setId(Long[] id) {
		this.id = id;
	}
	public String[] getEtime() {
		return etime;
	}
	public void setEtime(String[] etime) {
		this.etime = etime;
	}
	public String[] getEcontent() {
		return econtent;
	}
	public void setEcontent(String[] econtent) {
		this.econtent = econtent;
	}
	public Long getEmployerId() {
		return employerId;
	}
	public void setEmployerId(Long employerId) {
		this.employerId = employerId;
	}
}
