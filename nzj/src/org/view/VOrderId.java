package org.view;

/**
 * VOrderId entity. @author MyEclipse Persistence Tools
 */

public class VOrderId implements java.io.Serializable {

	// Fields

	private Long id;
	private String preparer;
	private Long time;
	private Integer status;
	private String description;
	private Long userId;

	// Constructors

	/** default constructor */
	public VOrderId() {
	}

	/** minimal constructor */
	public VOrderId(Long id, String preparer, Long time, Integer status,
			Long userId) {
		this.id = id;
		this.preparer = preparer;
		this.time = time;
		this.status = status;
		this.userId = userId;
	}

	/** full constructor */
	public VOrderId(Long id, String preparer, Long time, Integer status,
			String description, Long userId) {
		this.id = id;
		this.preparer = preparer;
		this.time = time;
		this.status = status;
		this.description = description;
		this.userId = userId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPreparer() {
		return this.preparer;
	}

	public void setPreparer(String preparer) {
		this.preparer = preparer;
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VOrderId))
			return false;
		VOrderId castOther = (VOrderId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getPreparer() == castOther.getPreparer()) || (this
						.getPreparer() != null
						&& castOther.getPreparer() != null && this
						.getPreparer().equals(castOther.getPreparer())))
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null
						&& castOther.getTime() != null && this.getTime()
						.equals(castOther.getTime())))
				&& ((this.getStatus() == castOther.getStatus()) || (this
						.getStatus() != null && castOther.getStatus() != null && this
						.getStatus().equals(castOther.getStatus())))
				&& ((this.getDescription() == castOther.getDescription()) || (this
						.getDescription() != null
						&& castOther.getDescription() != null && this
						.getDescription().equals(castOther.getDescription())))
				&& ((this.getUserId() == castOther.getUserId()) || (this
						.getUserId() != null && castOther.getUserId() != null && this
						.getUserId().equals(castOther.getUserId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getPreparer() == null ? 0 : this.getPreparer().hashCode());
		result = 37 * result
				+ (getTime() == null ? 0 : this.getTime().hashCode());
		result = 37 * result
				+ (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37
				* result
				+ (getDescription() == null ? 0 : this.getDescription()
						.hashCode());
		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		return result;
	}

}