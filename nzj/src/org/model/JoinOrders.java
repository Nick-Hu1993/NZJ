package org.model;

/**
 * JoinOrders entity. @author MyEclipse Persistence Tools
 */

public class JoinOrders implements java.io.Serializable {

	// Fields

	private Long id;
	private String perparer;
	private String phone;
	private Integer status;
	private Long time;
	private Long userId;

	// Constructors

	/** default constructor */
	public JoinOrders() {
	}

	/** full constructor */
	public JoinOrders(Long id, String perparer, String phone, Integer status,
			Long time, Long userId) {
		this.id = id;
		this.perparer = perparer;
		this.phone = phone;
		this.status = status;
		this.time = time;
		this.userId = userId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPerparer() {
		return this.perparer;
	}

	public void setPerparer(String perparer) {
		this.perparer = perparer;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}