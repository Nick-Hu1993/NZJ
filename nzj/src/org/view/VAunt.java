package org.view;

/**
 * VAunt entity. @author MyEclipse Persistence Tools
 */

public class VAunt implements java.io.Serializable {

	// Fields

	private VAuntId id;

	// Constructors

	/** default constructor */
	public VAunt() {
	}

	/** full constructor */
	public VAunt(VAuntId id) {
		this.id = id;
	}

	// Property accessors

	public VAuntId getId() {
		return this.id;
	}

	public void setId(VAuntId id) {
		this.id = id;
	}

}