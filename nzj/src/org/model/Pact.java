package org.model;

/**
 * Pact entity. @author MyEclipse Persistence Tools
 */

public class Pact implements java.io.Serializable {

	// Fields

	private Long id;
	private Long ptime;
	private String code;
	private String ename;
	private String ephone;
	private String eaddress;
	private String econtent;
	private String duration;
	private Double cost;
	private String aname;
	private String aphone;
	private String time;
	private String salary;
	private String remark;
	private Integer status;
	private Long userId;
	private Long employerId;

	// Constructors

	/** default constructor */
	public Pact() {
	}

	/** minimal constructor */
	public Pact(Long ptime, String code, String ename, String ephone,
			String eaddress, String econtent, String duration, Double cost,
			String aname, String aphone, String time, String salary,
			Integer status, Long userId, Long employerId) {
		this.ptime = ptime;
		this.code = code;
		this.ename = ename;
		this.ephone = ephone;
		this.eaddress = eaddress;
		this.econtent = econtent;
		this.duration = duration;
		this.cost = cost;
		this.aname = aname;
		this.aphone = aphone;
		this.time = time;
		this.salary = salary;
		this.status = status;
		this.userId = userId;
		this.employerId = employerId;
	}

	/** full constructor */
	public Pact(Long ptime, String code, String ename, String ephone,
			String eaddress, String econtent, String duration, Double cost,
			String aname, String aphone, String time, String salary,
			String remark, Integer status, Long userId, Long employerId) {
		this.ptime = ptime;
		this.code = code;
		this.ename = ename;
		this.ephone = ephone;
		this.eaddress = eaddress;
		this.econtent = econtent;
		this.duration = duration;
		this.cost = cost;
		this.aname = aname;
		this.aphone = aphone;
		this.time = time;
		this.salary = salary;
		this.remark = remark;
		this.status = status;
		this.userId = userId;
		this.employerId = employerId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPtime() {
		return this.ptime;
	}

	public void setPtime(Long ptime) {
		this.ptime = ptime;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEphone() {
		return this.ephone;
	}

	public void setEphone(String ephone) {
		this.ephone = ephone;
	}

	public String getEaddress() {
		return this.eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public String getEcontent() {
		return this.econtent;
	}

	public void setEcontent(String econtent) {
		this.econtent = econtent;
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAphone() {
		return this.aphone;
	}

	public void setAphone(String aphone) {
		this.aphone = aphone;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getSalary() {
		return this.salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getEmployerId() {
		return this.employerId;
	}

	public void setEmployerId(Long employerId) {
		this.employerId = employerId;
	}

}