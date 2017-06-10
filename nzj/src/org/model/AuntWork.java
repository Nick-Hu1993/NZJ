package org.model;

/**
 * AuntWork entity. @author MyEclipse Persistence Tools
 */

public class AuntWork implements java.io.Serializable {

	// Fields

	private Long id;
	private String time;
	private String work;
	private Long auntId;

	// Constructors

	/** default constructor */
	public AuntWork() {
	}

	/** full constructor */
	public AuntWork(String time, String work, Long auntId) {
		this.time = time;
		this.work = work;
		this.auntId = auntId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getWork() {
		return this.work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public Long getAuntId() {
		return this.auntId;
	}

	public void setAuntId(Long auntId) {
		this.auntId = auntId;
	}

}