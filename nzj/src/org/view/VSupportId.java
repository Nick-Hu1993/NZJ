package org.view;

/**
 * VSupportId entity. @author MyEclipse Persistence Tools
 */

public class VSupportId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long ttime;
	private String content;
	private Integer status;
	private Integer typeId;
	private Long userId;
	private Long pid;
	private String name;

	// Constructors

	/** default constructor */
	public VSupportId() {
	}

	/** full constructor */
	public VSupportId(Long id, Long ttime, String content, Integer status,
			Integer typeId, Long userId, Long pid, String name) {
		this.id = id;
		this.ttime = ttime;
		this.content = content;
		this.status = status;
		this.typeId = typeId;
		this.userId = userId;
		this.pid = pid;
		this.name = name;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTtime() {
		return this.ttime;
	}

	public void setTtime(Long ttime) {
		this.ttime = ttime;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTypeId() {
		return this.typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getPid() {
		return this.pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
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
		if (!(other instanceof VSupportId))
			return false;
		VSupportId castOther = (VSupportId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getTtime() == castOther.getTtime()) || (this
						.getTtime() != null && castOther.getTtime() != null && this
						.getTtime().equals(castOther.getTtime())))
				&& ((this.getContent() == castOther.getContent()) || (this
						.getContent() != null && castOther.getContent() != null && this
						.getContent().equals(castOther.getContent())))
				&& ((this.getStatus() == castOther.getStatus()) || (this
						.getStatus() != null && castOther.getStatus() != null && this
						.getStatus().equals(castOther.getStatus())))
				&& ((this.getTypeId() == castOther.getTypeId()) || (this
						.getTypeId() != null && castOther.getTypeId() != null && this
						.getTypeId().equals(castOther.getTypeId())))
				&& ((this.getUserId() == castOther.getUserId()) || (this
						.getUserId() != null && castOther.getUserId() != null && this
						.getUserId().equals(castOther.getUserId())))
				&& ((this.getPid() == castOther.getPid()) || (this.getPid() != null
						&& castOther.getPid() != null && this.getPid().equals(
						castOther.getPid())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getTtime() == null ? 0 : this.getTtime().hashCode());
		result = 37 * result
				+ (getContent() == null ? 0 : this.getContent().hashCode());
		result = 37 * result
				+ (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37 * result
				+ (getTypeId() == null ? 0 : this.getTypeId().hashCode());
		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result
				+ (getPid() == null ? 0 : this.getPid().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		return result;
	}

}