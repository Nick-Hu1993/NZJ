package org.view;

/**
 * VOrderAccount entity. @author MyEclipse Persistence Tools
 */

public class VOrderAccount implements java.io.Serializable {

	// Fields

	private VOrderAccountId id;

	// Constructors

	/** default constructor */
	public VOrderAccount() {
	}

	/** full constructor */
	public VOrderAccount(VOrderAccountId id) {
		this.id = id;
	}

	// Property accessors

	public VOrderAccountId getId() {
		return this.id;
	}

	public void setId(VOrderAccountId id) {
		this.id = id;
	}

}