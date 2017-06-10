package org.model;

/**
 * UserLink entity. @author MyEclipse Persistence Tools
 */

public class UserLink implements java.io.Serializable {

	// Fields

	private Long id;
	private Long parent;
	private Long child;

	// Constructors

	/** default constructor */
	public UserLink() {
	}

	/** full constructor */
	public UserLink(Long parent, Long child) {
		this.parent = parent;
		this.child = child;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParent() {
		return this.parent;
	}

	public void setParent(Long parent) {
		this.parent = parent;
	}

	public Long getChild() {
		return this.child;
	}

	public void setChild(Long child) {
		this.child = child;
	}

}