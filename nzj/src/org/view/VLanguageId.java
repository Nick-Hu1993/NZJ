package org.view;

/**
 * VLanguageId entity. @author MyEclipse Persistence Tools
 */

public class VLanguageId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long auntId;
	private Long languageId;
	private String name;

	// Constructors

	/** default constructor */
	public VLanguageId() {
	}

	/** full constructor */
	public VLanguageId(Long id, Long auntId, Long languageId, String name) {
		this.id = id;
		this.auntId = auntId;
		this.languageId = languageId;
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

	public Long getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
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
		if (!(other instanceof VLanguageId))
			return false;
		VLanguageId castOther = (VLanguageId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getAuntId() == castOther.getAuntId()) || (this
						.getAuntId() != null && castOther.getAuntId() != null && this
						.getAuntId().equals(castOther.getAuntId())))
				&& ((this.getLanguageId() == castOther.getLanguageId()) || (this
						.getLanguageId() != null
						&& castOther.getLanguageId() != null && this
						.getLanguageId().equals(castOther.getLanguageId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getAuntId() == null ? 0 : this.getAuntId().hashCode());
		result = 37
				* result
				+ (getLanguageId() == null ? 0 : this.getLanguageId()
						.hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}