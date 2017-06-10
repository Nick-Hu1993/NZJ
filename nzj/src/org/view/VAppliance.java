package org.view;

/**
 * VAppliance entity. @author MyEclipse Persistence Tools
 */

public class VAppliance implements java.io.Serializable {

	// Fields

	private VApplianceId id;

	// Constructors

	/** default constructor */
	public VAppliance() {
	}

	/** full constructor */
	public VAppliance(VApplianceId id) {
		this.id = id;
	}

	// Property accessors

	public VApplianceId getId() {
		return this.id;
	}

	public void setId(VApplianceId id) {
		this.id = id;
	}

}