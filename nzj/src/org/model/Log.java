package org.model;

/**
 * Log entity. @author MyEclipse Persistence Tools
 */

public class Log implements java.io.Serializable {

	// Fields

	private Long id;
	private Long phone;
	private String operation;
	private Long time;

	// Constructors

	/** default constructor */
	public Log() {
	}

	/** full constructor */
	public Log(Long phone, String operation, Long time) {
		this.phone = phone;
		this.operation = operation;
		this.time = time;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPhone() {
		return this.phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

}