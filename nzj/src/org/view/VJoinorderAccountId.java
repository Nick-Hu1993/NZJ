package org.view;

/**
 * VJoinorderAccountId entity. @author MyEclipse Persistence Tools
 */

public class VJoinorderAccountId implements java.io.Serializable {

	// Fields

	private Long id;
	private String perparer;
	private String phone;
	private Integer status;
	private Long time;
	private Long userId;
	private String prepare;
	private Double quantity;
	private Double cityprice;
	private Double provinceprice;
	private Long atime;
	private Long joinId;

	// Constructors

	/** default constructor */
	public VJoinorderAccountId() {
	}

	/** full constructor */
	public VJoinorderAccountId(Long id, String perparer, String phone,
			Integer status, Long time, Long userId, String prepare,
			Double quantity, Double cityprice, Double provinceprice,
			Long atime, Long joinId) {
		this.id = id;
		this.perparer = perparer;
		this.phone = phone;
		this.status = status;
		this.time = time;
		this.userId = userId;
		this.prepare = prepare;
		this.quantity = quantity;
		this.cityprice = cityprice;
		this.provinceprice = provinceprice;
		this.atime = atime;
		this.joinId = joinId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPerparer() {
		return this.perparer;
	}

	public void setPerparer(String perparer) {
		this.perparer = perparer;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPrepare() {
		return this.prepare;
	}

	public void setPrepare(String prepare) {
		this.prepare = prepare;
	}

	public Double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getCityprice() {
		return this.cityprice;
	}

	public void setCityprice(Double cityprice) {
		this.cityprice = cityprice;
	}

	public Double getProvinceprice() {
		return this.provinceprice;
	}

	public void setProvinceprice(Double provinceprice) {
		this.provinceprice = provinceprice;
	}

	public Long getAtime() {
		return this.atime;
	}

	public void setAtime(Long atime) {
		this.atime = atime;
	}

	public Long getJoinId() {
		return this.joinId;
	}

	public void setJoinId(Long joinId) {
		this.joinId = joinId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VJoinorderAccountId))
			return false;
		VJoinorderAccountId castOther = (VJoinorderAccountId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getPerparer() == castOther.getPerparer()) || (this
						.getPerparer() != null
						&& castOther.getPerparer() != null && this
						.getPerparer().equals(castOther.getPerparer())))
				&& ((this.getPhone() == castOther.getPhone()) || (this
						.getPhone() != null && castOther.getPhone() != null && this
						.getPhone().equals(castOther.getPhone())))
				&& ((this.getStatus() == castOther.getStatus()) || (this
						.getStatus() != null && castOther.getStatus() != null && this
						.getStatus().equals(castOther.getStatus())))
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null
						&& castOther.getTime() != null && this.getTime()
						.equals(castOther.getTime())))
				&& ((this.getUserId() == castOther.getUserId()) || (this
						.getUserId() != null && castOther.getUserId() != null && this
						.getUserId().equals(castOther.getUserId())))
				&& ((this.getPrepare() == castOther.getPrepare()) || (this
						.getPrepare() != null && castOther.getPrepare() != null && this
						.getPrepare().equals(castOther.getPrepare())))
				&& ((this.getQuantity() == castOther.getQuantity()) || (this
						.getQuantity() != null
						&& castOther.getQuantity() != null && this
						.getQuantity().equals(castOther.getQuantity())))
				&& ((this.getCityprice() == castOther.getCityprice()) || (this
						.getCityprice() != null
						&& castOther.getCityprice() != null && this
						.getCityprice().equals(castOther.getCityprice())))
				&& ((this.getProvinceprice() == castOther.getProvinceprice()) || (this
						.getProvinceprice() != null
						&& castOther.getProvinceprice() != null && this
						.getProvinceprice()
						.equals(castOther.getProvinceprice())))
				&& ((this.getAtime() == castOther.getAtime()) || (this
						.getAtime() != null && castOther.getAtime() != null && this
						.getAtime().equals(castOther.getAtime())))
				&& ((this.getJoinId() == castOther.getJoinId()) || (this
						.getJoinId() != null && castOther.getJoinId() != null && this
						.getJoinId().equals(castOther.getJoinId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getPerparer() == null ? 0 : this.getPerparer().hashCode());
		result = 37 * result
				+ (getPhone() == null ? 0 : this.getPhone().hashCode());
		result = 37 * result
				+ (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37 * result
				+ (getTime() == null ? 0 : this.getTime().hashCode());
		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result
				+ (getPrepare() == null ? 0 : this.getPrepare().hashCode());
		result = 37 * result
				+ (getQuantity() == null ? 0 : this.getQuantity().hashCode());
		result = 37 * result
				+ (getCityprice() == null ? 0 : this.getCityprice().hashCode());
		result = 37
				* result
				+ (getProvinceprice() == null ? 0 : this.getProvinceprice()
						.hashCode());
		result = 37 * result
				+ (getAtime() == null ? 0 : this.getAtime().hashCode());
		result = 37 * result
				+ (getJoinId() == null ? 0 : this.getJoinId().hashCode());
		return result;
	}

}