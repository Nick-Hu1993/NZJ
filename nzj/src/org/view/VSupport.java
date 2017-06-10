package org.view;

/**
 * VSupport entity. @author MyEclipse Persistence Tools
 */

public class VSupport implements java.io.Serializable {

	// Fields

	private VSupportId id;

	// Constructors

	/** default constructor */
	public VSupport() {
	}

	/** full constructor */
	public VSupport(VSupportId id) {
		this.id = id;
	}

	// Property accessors

	public VSupportId getId() {
		return this.id;
	}

	public void setId(VSupportId id) {
		this.id = id;
	}

}