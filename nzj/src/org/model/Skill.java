package org.model;

/**
 * Skill entity. @author MyEclipse Persistence Tools
 */

public class Skill implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;

	// Constructors

	/** default constructor */
	public Skill() {
	}

	/** full constructor */
	public Skill(String name) {
		this.name = name;
	}
	
	public Skill(Long id,String name){
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