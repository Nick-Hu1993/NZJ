package org.model;

/**
 * SupportType entity. @author MyEclipse Persistence Tools
 */

public class SupportType implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;

	// Constructors

	/** default constructor */
	public SupportType() {
	}

	/** full constructor */
	public SupportType(String name) {
		this.name = name;
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

}