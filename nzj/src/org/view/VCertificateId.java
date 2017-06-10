package org.view;

/**
 * VCertificateId entity. @author MyEclipse Persistence Tools
 */

public class VCertificateId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long auntId;
	private Long certificateId;
	private String name;

	// Constructors

	/** default constructor */
	public VCertificateId() {
	}

	/** full constructor */
	public VCertificateId(Long id, Long auntId, Long certificateId, String name) {
		this.id = id;
		this.auntId = auntId;
		this.certificateId = certificateId;
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

	public Long getCertificateId() {
		return this.certificateId;
	}

	public void setCertificateId(Long certificateId) {
		this.certificateId = certificateId;
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
		if (!(other instanceof VCertificateId))
			return false;
		VCertificateId castOther = (VCertificateId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getAuntId() == castOther.getAuntId()) || (this
						.getAuntId() != null && castOther.getAuntId() != null && this
						.getAuntId().equals(castOther.getAuntId())))
				&& ((this.getCertificateId() == castOther.getCertificateId()) || (this
						.getCertificateId() != null
						&& castOther.getCertificateId() != null && this
						.getCertificateId()
						.equals(castOther.getCertificateId())))
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
				+ (getCertificateId() == null ? 0 : this.getCertificateId()
						.hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}