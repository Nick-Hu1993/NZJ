package org.model;

/**
 * JoinAccount entity. @author MyEclipse Persistence Tools
 */

public class JoinAccount implements java.io.Serializable {

	// Fields

	private Long id;
	private String prepare;
	private Double quantity;
	private Double cityprice;
	private Double provinceprice;
	private Long atime;
	private Long joinId;

	// Constructors

	/** default constructor */
	public JoinAccount() {
	}

	/** full constructor */
	public JoinAccount(String prepare, Double quantity, Double cityprice,
			Double provinceprice, Long atime, Long joinId) {
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

}