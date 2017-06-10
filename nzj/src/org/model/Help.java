package org.model;

/**
 * Help entity. @author MyEclipse Persistence Tools
 */

public class Help implements java.io.Serializable {

	// Fields

	private Long id;
	private String company;
	private String name;
	private String phone;
	private String content;
	private Integer status;
	private Long time;
	private Long userId;
	private String identifier;

	// Constructors

	/** default constructor */
	public Help() {
	}

	/** full constructor */
	public Help(String company, String name, String phone, String content,
			Integer status, Long time, Long userId, String identifier) {
		this.company = company;
		this.name = name;
		this.phone = phone;
		this.content = content;
		this.status = status;
		this.time = time;
		this.userId = userId;
		this.identifier = identifier;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getIdentifier() {
		return this.identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

}