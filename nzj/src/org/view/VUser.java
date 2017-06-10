package org.view;

/**
 * VUser entity. @author MyEclipse Persistence Tools
 */

public class VUser implements java.io.Serializable {

	// Fields

	private VUserId id;

	// Constructors

	/** default constructor */
	public VUser() {
	}

	/** full constructor */
	public VUser(VUserId id) {
		this.id = id;
	}

	// Property accessors

	public VUserId getId() {
		return this.id;
	}

	public void setId(VUserId id) {
		this.id = id;
	}

}