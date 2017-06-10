package org.model;

/**
 * ShareAunt entity. @author MyEclipse Persistence Tools
 */

public class ShareAunt implements java.io.Serializable {

	// Fields

	private Long id;
	private String skill;
	private String address;
	private String contact;
	private String phone;
	private Long time;
	private Long userId;
	private Integer share;

	// Constructors

	/** default constructor */
	public ShareAunt() {
	}

	/** full constructor */
	public ShareAunt(String skill, String address, String contact,
			String phone, Long time, Long userId, Integer share) {
		this.skill = skill;
		this.address = address;
		this.contact = contact;
		this.phone = phone;
		this.time = time;
		this.userId = userId;
		this.share = share;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSkill() {
		return this.skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public Integer getShare() {
		return this.share;
	}

	public void setShare(Integer share) {
		this.share = share;
	}

}