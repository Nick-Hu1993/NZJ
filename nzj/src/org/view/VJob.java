package org.view;

/**
 * VJob entity. @author MyEclipse Persistence Tools
 */

public class VJob implements java.io.Serializable {

	// Fields

	private VJobId id;

	// Constructors

	/** default constructor */
	public VJob() {
	}

	/** full constructor */
	public VJob(VJobId id) {
		this.id = id;
	}

	// Property accessors

	public VJobId getId() {
		return this.id;
	}

	public void setId(VJobId id) {
		this.id = id;
	}

}