package org.model;

/**
 * Amount entity. @author MyEclipse Persistence Tools
 */

public class Amount implements java.io.Serializable {

	// Fields

	private Long id;
	private Double balance;
	private Long userId;

	// Constructors

	/** default constructor */
	public Amount() {
	}

	/** full constructor */
	public Amount(Double balance, Long userId) {
		this.balance = balance;
		this.userId = userId;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}