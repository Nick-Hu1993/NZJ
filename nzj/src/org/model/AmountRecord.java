package org.model;

/**
 * AmountRecord entity. @author MyEclipse Persistence Tools
 */

public class AmountRecord implements java.io.Serializable {

	// Fields

	private Long id;
	private Long time;
	private Long joinorderId;
	private Double amount;
	private String remark;
	private Long amountId;

	// Constructors

	/** default constructor */
	public AmountRecord() {
	}

	/** minimal constructor */
	public AmountRecord(Long time, Long joinorderId, Double amount,
			Long amountId) {
		this.time = time;
		this.joinorderId = joinorderId;
		this.amount = amount;
		this.amountId = amountId;
	}

	/** full constructor */
	public AmountRecord(Long time, Long joinorderId, Double amount,
			String remark, Long amountId) {
		this.time = time;
		this.joinorderId = joinorderId;
		this.amount = amount;
		this.remark = remark;
		this.amountId = amountId;
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

	public Long getJoinorderId() {
		return this.joinorderId;
	}

	public void setJoinorderId(Long joinorderId) {
		this.joinorderId = joinorderId;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getAmountId() {
		return this.amountId;
	}

	public void setAmountId(Long amountId) {
		this.amountId = amountId;
	}

}