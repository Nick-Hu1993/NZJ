package org.view;

/**
 * VJobId entity. @author MyEclipse Persistence Tools
 */

public class VJobId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long auntId;
	private Long jobId;
	private String name;

	// Constructors

	/** default constructor */
	public VJobId() {
	}

	/** full constructor */
	public VJobId(Long id, Long auntId, Long jobId, String name) {
		this.id = id;
		this.auntId = auntId;
		this.jobId = jobId;
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

	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
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
		if (!(other instanceof VJobId))
			return false;
		VJobId castOther = (VJobId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getAuntId() == castOther.getAuntId()) || (this
						.getAuntId() != null && castOther.getAuntId() != null && this
						.getAuntId().equals(castOther.getAuntId())))
				&& ((this.getJobId() == castOther.getJobId()) || (this
						.getJobId() != null && castOther.getJobId() != null && this
						.getJobId().equals(castOther.getJobId())))
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
				+ (getJobId() == null ? 0 : this.getJobId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}