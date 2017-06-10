package org.model;

/**
 * OrderAccount entity. @author MyEclipse Persistence Tools
 */

public class OrderAccount implements java.io.Serializable {

	// Fields

	private Long id;
	private String prepare;
	private Double quantity;
	private Double cityprice;
	private Double provinceprice;
	private Long atime;
	private Long orderId;

	// Constructors

	/** default constructor */
	public OrderAccount() {
	}

	/** full constructor */
	public OrderAccount(String prepare, Double quantity, Double cityprice,
			Double provinceprice, Long atime, Long orderId) {
		this.prepare = prepare;
		this.quantity = quantity;
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

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

}