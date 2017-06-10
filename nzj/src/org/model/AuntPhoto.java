package org.model;

/**
 * AuntPhoto entity. @author MyEclipse Persistence Tools
 */

public class AuntPhoto implements java.io.Serializable {

	// Fields

	private Long id;
	private String url;
	private Long auntId;

	// Constructors

	/** default constructor */
	public AuntPhoto() {
	}

	/** full constructor */
	public AuntPhoto(String url, Long auntId) {
		this.url = url;
		this.auntId = auntId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Long getAuntId() {
		return this.auntId;
	}

	public void setAuntId(Long auntId) {
		this.auntId = auntId;
	}

}