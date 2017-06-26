package org.view;

/**
 * VUserUserdetailAmount entity. @author MyEclipse Persistence Tools
 */

public class VUserUserdetailAmount implements java.io.Serializable {

	// Fields

	private VUserUserdetailAmountId id;

	// Constructors

	/** default constructor */
	public VUserUserdetailAmount() {
	}

	/** full constructor */
	public VUserUserdetailAmount(VUserUserdetailAmountId id) {
		this.id = id;
	}

	// Property accessors

	public VUserUserdetailAmountId getId() {
		return this.id;
	}

	public void setId(VUserUserdetailAmountId id) {
		this.id = id;
	}

}