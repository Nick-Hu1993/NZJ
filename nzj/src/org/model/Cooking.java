package org.model;

/**
 * Cooking entity. @author MyEclipse Persistence Tools
 */

public class Cooking implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;

	// Constructors

	/** default constructor */
	public Cooking() {
	}

	/** full constructor */
	public Cooking(String name) {
		this.name = name;
	}
	public Cooking(Long id,String name){
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