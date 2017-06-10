package org.model;

/**
 * Language entity. @author MyEclipse Persistence Tools
 */

public class Language implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;

	// Constructors

	/** default constructor */
	public Language() {
	}

	/** full constructor */
	public Language(String name) {
		this.name = name;
	}
	
	public Language(Long id,String name){
		this.id=id;
		this.name=name;
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