package org.model;

/**
 * AmountRecord entity. @author MyEclipse Persistence Tools
 */

public class AmountRecord implements java.io.Serializable {

	// Fields

	private Long id;
	private Long time;
	private Long orderId;
	private Double amount;
	private String description;
	private Long userId;

	// Constructors

	/** default constructor */
	public AmountRecord() {
	}

	/** full constructor */
	public AmountRecord(Long time, Long orderId, Double amount,
			String description, Long userId) {
		this.time = time;
		this.orderId = orderId;
		this.amount = amount;
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

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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

}