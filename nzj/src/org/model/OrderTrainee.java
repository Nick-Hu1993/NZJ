package org.model;

/**
 * OrderTrainee entity. @author MyEclipse Persistence Tools
 */

public class OrderTrainee implements java.io.Serializable {

	// Fields

	private Long id;
	private Long orderId;
	private Long traineeId;

	// Constructors

	/** default constructor */
	public OrderTrainee() {
	}

	/** full constructor */
	public OrderTrainee(Long orderId, Long traineeId) {
		this.orderId = orderId;
		this.traineeId = traineeId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getTraineeId() {
		return this.traineeId;
	}

	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
	}

}