package org.model;


/**
 * EmployerTracking entity. @author MyEclipse Persistence Tools
 */

public class EmployerTracking implements java.io.Serializable {

	// Fields
	
	private  Long id;
	private Long etime;
	private String econtent;
	private Long employerId;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getEtime() {
		return etime;
	}
	public void setEtime(Long etime) {
		this.etime = etime;
	}
	public String getEcontent() {
		return econtent;
	}
	public void setEcontent(String econtent) {
		this.econtent = econtent;
	}
	public Long getEmployerId() {
		return employerId;
	}
	public void setEmployerId(Long employerId) {
		this.employerId = employerId;
	}
}