package org.model;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Long id;
	private String preparer;
	private Long time;
	private Long userId;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** full constructor */
	public Orders(String preparer, Long time, Long userId) {
		this.preparer = preparer;
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

	public String getPreparer() {
		return this.preparer;
	}

	public void setPreparer(String preparer) {
		this.preparer = preparer;
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