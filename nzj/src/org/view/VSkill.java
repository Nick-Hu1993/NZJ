package org.view;

/**
 * VSkill entity. @author MyEclipse Persistence Tools
 */

public class VSkill implements java.io.Serializable {

	// Fields

	private VSkillId id;

	// Constructors

	/** default constructor */
	public VSkill() {
	}

	/** full constructor */
	public VSkill(VSkillId id) {
		this.id = id;
	}

	// Property accessors

	public VSkillId getId() {
		return this.id;
	}

	public void setId(VSkillId id) {
		this.id = id;
	}

}