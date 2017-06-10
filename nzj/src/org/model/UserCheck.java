package org.model;

/**
 * UserCheck entity. @author MyEclipse Persistence Tools
 */

public class UserCheck implements java.io.Serializable {

	// Fields

	private Long id;
	private Long userId;
	private Integer status;
	private String description;

	// Constructors

	/** default constructor */
	public UserCheck() {
	}

	/** full constructor */
	public UserCheck(Long userId, Integer status, String description) {
		this.userId = userId;
		this.status = status;
		this.description = description;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}