package org.model;

/**
 * OrderCheck entity. @author MyEclipse Persistence Tools
 */

public class OrderCheck implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer status;
	private String description;
	private Long orderId;

	// Constructors

	/** default constructor */
	public OrderCheck() {
	}

	/** minimal constructor */
	public OrderCheck(Integer status, Long orderId) {
		this.status = status;
		this.orderId = orderId;
	}

	/** full constructor */
	public OrderCheck(Integer status, String description, Long orderId) {
		this.status = status;
		this.description = description;
		this.orderId = orderId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

}