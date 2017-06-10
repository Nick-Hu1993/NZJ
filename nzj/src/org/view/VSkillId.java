package org.view;

/**
 * VSkillId entity. @author MyEclipse Persistence Tools
 */

public class VSkillId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long auntId;
	private Long skillId;
	private String name;

	// Constructors

	/** default constructor */
	public VSkillId() {
	}

	/** full constructor */
	public VSkillId(Long id, Long auntId, Long skillId, String name) {
		this.id = id;
		this.auntId = auntId;
		this.skillId = skillId;
		this.name = name;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAuntId() {
		return this.auntId;
	}

	public void setAuntId(Long auntId) {
		this.auntId = auntId;
	}

	public Long getSkillId() {
		return this.skillId;
	}

	public void setSkillId(Long skillId) {
		this.skillId = skillId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VSkillId))
			return false;
		VSkillId castOther = (VSkillId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getAuntId() == castOther.getAuntId()) || (this
						.getAuntId() != null && castOther.getAuntId() != null && this
						.getAuntId().equals(castOther.getAuntId())))
				&& ((this.getSkillId() == castOther.getSkillId()) || (this
						.getSkillId() != null && castOther.getSkillId() != null && this
						.getSkillId().equals(castOther.getSkillId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getAuntId() == null ? 0 : this.getAuntId().hashCode());
		result = 37 * result
				+ (getSkillId() == null ? 0 : this.getSkillId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}