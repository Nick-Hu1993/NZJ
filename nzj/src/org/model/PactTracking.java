package org.model;

/**
 * PactTracking entity. @author MyEclipse Persistence Tools
 */

public class PactTracking implements java.io.Serializable {

	// Fields

	private Long id;
	private Long ttime;
	private String content;
	private Long pactId;

	// Constructors

	/** default constructor */
	public PactTracking() {
	}

	/** full constructor */
	public PactTracking(Long ttime, String content, Long pactId) {
		this.ttime = ttime;
		this.content = content;
		this.pactId = pactId;
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

	public Long getPactId() {
		return this.pactId;
	}

	public void setPactId(Long pactId) {
		this.pactId = pactId;
	}

}