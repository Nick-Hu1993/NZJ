package org.view;

/**
 * VLog entity. @author MyEclipse Persistence Tools
 */

public class VLog implements java.io.Serializable {

	// Fields

	private VLogId id;

	// Constructors

	/** default constructor */
	public VLog() {
	}

	/** full constructor */
	public VLog(VLogId id) {
		this.id = id;
	}

	// Property accessors

	public VLogId getId() {
		return this.id;
	}

	public void setId(VLogId id) {
		this.id = id;
	}

}