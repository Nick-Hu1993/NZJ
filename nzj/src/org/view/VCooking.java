package org.view;

/**
 * VCooking entity. @author MyEclipse Persistence Tools
 */

public class VCooking implements java.io.Serializable {

	// Fields

	private VCookingId id;

	// Constructors

	/** default constructor */
	public VCooking() {
	}

	/** full constructor */
	public VCooking(VCookingId id) {
		this.id = id;
	}

	// Property accessors

	public VCookingId getId() {
		return this.id;
	}

	public void setId(VCookingId id) {
		this.id = id;
	}

}