package org.model;

/**
 * Price entity. @author MyEclipse Persistence Tools
 */

public class Price implements java.io.Serializable {

	// Fields

	private Long id;
	private Integer rank;
	private Double price;

	// Constructors

	/** default constructor */
	public Price() {
	}

	/** full constructor */
	public Price(Integer rank, Double price) {
		this.rank = rank;
		this.price = price;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

}