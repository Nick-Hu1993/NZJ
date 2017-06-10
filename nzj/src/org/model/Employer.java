package org.model;

/**
 * Employer entity. @author MyEclipse Persistence Tools
 */

public class Employer implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Long time;
	private String phone;
	private String address;
	private String content;
	private Integer status;
	private Long userId;

	// Constructors

	/** default constructor */
	public Employer() {
	}

	/** minimal constructor */
	public Employer(String name, Long time, String phone, String content,
			Integer status, Long userId) {
		this.name = name;
		this.time = time;
		this.phone = phone;
		this.content = content;
		this.status = status;
		this.userId = userId;
	}

	/** full constructor */
	public Employer(String name, Long time, String phone, String address,
			String content, Integer status, Long userId) {
		this.name = name;
		this.time = time;
		this.phone = phone;
		this.address = address;
		this.content = content;
		this.status = status;
		this.userId = userId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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

}