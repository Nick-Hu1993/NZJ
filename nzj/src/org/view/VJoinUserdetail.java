package org.view;

/**
 * VJoinUserdetail entity. @author MyEclipse Persistence Tools
 */

public class VJoinUserdetail implements java.io.Serializable {

	// Fields

	private VJoinUserdetailId id;

	// Constructors

	/** default constructor */
	public VJoinUserdetail() {
	}

	/** full constructor */
	public VJoinUserdetail(VJoinUserdetailId id) {
		this.id = id;
	}

	// Property accessors

	public VJoinUserdetailId getId() {
		return this.id;
	}

	public void setId(VJoinUserdetailId id) {
		this.id = id;
	}

}