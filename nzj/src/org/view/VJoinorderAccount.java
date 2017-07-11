package org.view;

/**
 * VJoinorderAccount entity. @author MyEclipse Persistence Tools
 */

public class VJoinorderAccount implements java.io.Serializable {

	// Fields

	private VJoinorderAccountId id;

	// Constructors

	/** default constructor */
	public VJoinorderAccount() {
	}

	/** full constructor */
	public VJoinorderAccount(VJoinorderAccountId id) {
		this.id = id;
	}

	// Property accessors

	public VJoinorderAccountId getId() {
		return this.id;
	}

	public void setId(VJoinorderAccountId id) {
		this.id = id;
	}

}