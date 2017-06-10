package org.view;

/**
 * VCookingId entity. @author MyEclipse Persistence Tools
 */

public class VCookingId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long auntId;
	private Long cookingId;
	private String name;

	// Constructors

	/** default constructor */
	public VCookingId() {
	}

	/** full constructor */
	public VCookingId(Long id, Long auntId, Long cookingId, String name) {
		this.id = id;
		this.auntId = auntId;
		this.cookingId = cookingId;
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

	public Long getCookingId() {
		return this.cookingId;
	}

	public void setCookingId(Long cookingId) {
		this.cookingId = cookingId;
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
		if (!(other instanceof VCookingId))
			return false;
		VCookingId castOther = (VCookingId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getAuntId() == castOther.getAuntId()) || (this
						.getAuntId() != null && castOther.getAuntId() != null && this
						.getAuntId().equals(castOther.getAuntId())))
				&& ((this.getCookingId() == castOther.getCookingId()) || (this
						.getCookingId() != null
						&& castOther.getCookingId() != null && this
						.getCookingId().equals(castOther.getCookingId())))
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
				+ (getCookingId() == null ? 0 : this.getCookingId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}