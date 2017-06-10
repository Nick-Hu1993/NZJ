package org.model;

/**
 * SupportTracking entity. @author MyEclipse Persistence Tools
 */

public class SupportTracking implements java.io.Serializable {

	// Fields

	private Long id;
	private Long ttime;
	private String content;
	private Integer status;
	private Integer typeId;
	private Long userId;

	// Constructors

	/** default constructor */
	public SupportTracking() {
	}

	/** full constructor */
	public SupportTracking(Long ttime, String content, Integer status,
			Integer typeId, Long userId) {
		this.ttime = ttime;
		this.content = content;
		this.status = status;
		this.typeId = typeId;
		this.userId = userId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTtime() {
		return this.ttime;
	}

	public void setTtime(Long ttime) {
		this.ttime = ttime;
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

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Long getuserId() {
		return this.userId;
	}

	public void setuserId(Long userId) {
		this.userId = userId;
	}

}