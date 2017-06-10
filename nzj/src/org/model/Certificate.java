package org.model;

/**
 * Certificate entity. @author MyEclipse Persistence Tools
 */

public class Certificate implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;

	// Constructors

	/** default constructor */
	public Certificate() {
	}

	/** full constructor */
	public Certificate(String name) {
		this.name = name;
	}
	
	public Certificate(Long id,String name){
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