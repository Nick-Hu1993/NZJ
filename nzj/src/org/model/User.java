package org.model;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Long id;
	private Long phone;
	private String password;
	private Long clock;
	private Integer rank;
	private Integer ack;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(Long phone, String password, Long clock, Integer rank,
			Integer ack) {
		this.phone = phone;
		this.password = password;
		this.clock = clock;
		this.rank = rank;
		this.ack = ack;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPhone() {
		return this.phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getClock() {
		return this.clock;
	}

	public void setClock(Long clock) {
		this.clock = clock;
	}

	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	public Integer getAck() {
		return this.ack;
	}

	public void setAck(Integer ack) {
		this.ack = ack;
	}

}