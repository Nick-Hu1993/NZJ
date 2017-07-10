package org.view;

/**
 * VOrderAccountId entity. @author MyEclipse Persistence Tools
 */

public class VOrderAccountId implements java.io.Serializable {

	// Fields

	private Long id;
	private String preparer;
	private String phone;
	private Integer status;
	private Double price;
	private Double quantity;
	private Double total;
	private Integer payment;
	private Long time;
	private Long userId;
	private String prepare;
	private Double quantity1;
	private Double cityprice;
	private Double provinceprice;
	private Long atime;
	private Long orderId;

	// Constructors

	/** default constructor */
	public VOrderAccountId() {
	}

	/** full constructor */
	public VOrderAccountId(Long id, String preparer, String phone,
			Integer status, Double price, Double quantity, Double total,
			Integer payment, Long time, Long userId, String prepare,
			Double quantity1, Double cityprice, Double provinceprice,
			Long atime, Long orderId) {
		this.id = id;
		this.preparer = preparer;
		this.phone = phone;
		this.status = status;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.payment = payment;
		this.time = time;
		this.userId = userId;
		this.prepare = prepare;
		this.quantity1 = quantity1;
		this.cityprice = cityprice;
		this.provinceprice = provinceprice;
		this.atime = atime;
		this.orderId = orderId;
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

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getPayment() {
		return this.payment;
	}

	public void setPayment(Integer payment) {
		this.payment = payment;
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

	public Double getQuantity1() {
		return this.quantity1;
	}

	public void setQuantity1(Double quantity1) {
		this.quantity1 = quantity1;
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

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VOrderAccountId))
			return false;
		VOrderAccountId castOther = (VOrderAccountId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getPreparer() == castOther.getPreparer()) || (this
						.getPreparer() != null
						&& castOther.getPreparer() != null && this
						.getPreparer().equals(castOther.getPreparer())))
				&& ((this.getPhone() == castOther.getPhone()) || (this
						.getPhone() != null && castOther.getPhone() != null && this
						.getPhone().equals(castOther.getPhone())))
				&& ((this.getStatus() == castOther.getStatus()) || (this
						.getStatus() != null && castOther.getStatus() != null && this
						.getStatus().equals(castOther.getStatus())))
				&& ((this.getPrice() == castOther.getPrice()) || (this
						.getPrice() != null && castOther.getPrice() != null && this
						.getPrice().equals(castOther.getPrice())))
				&& ((this.getQuantity() == castOther.getQuantity()) || (this
						.getQuantity() != null
						&& castOther.getQuantity() != null && this
						.getQuantity().equals(castOther.getQuantity())))
				&& ((this.getTotal() == castOther.getTotal()) || (this
						.getTotal() != null && castOther.getTotal() != null && this
						.getTotal().equals(castOther.getTotal())))
				&& ((this.getPayment() == castOther.getPayment()) || (this
						.getPayment() != null && castOther.getPayment() != null && this
						.getPayment().equals(castOther.getPayment())))
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null
						&& castOther.getTime() != null && this.getTime()
						.equals(castOther.getTime())))
				&& ((this.getUserId() == castOther.getUserId()) || (this
						.getUserId() != null && castOther.getUserId() != null && this
						.getUserId().equals(castOther.getUserId())))
				&& ((this.getPrepare() == castOther.getPrepare()) || (this
						.getPrepare() != null && castOther.getPrepare() != null && this
						.getPrepare().equals(castOther.getPrepare())))
				&& ((this.getQuantity1() == castOther.getQuantity1()) || (this
						.getQuantity1() != null
						&& castOther.getQuantity1() != null && this
						.getQuantity1().equals(castOther.getQuantity1())))
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
				&& ((this.getOrderId() == castOther.getOrderId()) || (this
						.getOrderId() != null && castOther.getOrderId() != null && this
						.getOrderId().equals(castOther.getOrderId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getPreparer() == null ? 0 : this.getPreparer().hashCode());
		result = 37 * result
				+ (getPhone() == null ? 0 : this.getPhone().hashCode());
		result = 37 * result
				+ (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37 * result
				+ (getPrice() == null ? 0 : this.getPrice().hashCode());
		result = 37 * result
				+ (getQuantity() == null ? 0 : this.getQuantity().hashCode());
		result = 37 * result
				+ (getTotal() == null ? 0 : this.getTotal().hashCode());
		result = 37 * result
				+ (getPayment() == null ? 0 : this.getPayment().hashCode());
		result = 37 * result
				+ (getTime() == null ? 0 : this.getTime().hashCode());
		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result
				+ (getPrepare() == null ? 0 : this.getPrepare().hashCode());
		result = 37 * result
				+ (getQuantity1() == null ? 0 : this.getQuantity1().hashCode());
		result = 37 * result
				+ (getCityprice() == null ? 0 : this.getCityprice().hashCode());
		result = 37
				* result
				+ (getProvinceprice() == null ? 0 : this.getProvinceprice()
						.hashCode());
		result = 37 * result
				+ (getAtime() == null ? 0 : this.getAtime().hashCode());
		result = 37 * result
				+ (getOrderId() == null ? 0 : this.getOrderId().hashCode());
		return result;
	}

}