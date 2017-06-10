package org.model;

/**
 * UserDetail entity. @author MyEclipse Persistence Tools
 */

public class UserDetail implements java.io.Serializable {

	// Fields

	private Long id;
	private Long userId;
	private String username;
	private String company;
	private String contact;
	private Long telephone;
	private Long dphone;
	private String address;
	private String charterurl;
	private String idcardurl;
	private Integer support;

	// Constructors

	/** default constructor */
	public UserDetail() {
	}

	/** minimal constructor */
	public UserDetail(Long userId, String username, String company,
			String contact, Long telephone, Long dphone, String address,
			Integer support) {
		this.userId = userId;
		this.username = username;
		this.company = company;
		this.contact = contact;
		this.telephone = telephone;
		this.dphone = dphone;
		this.address = address;
		this.support = support;
	}

	/** full constructor */
	public UserDetail(Long userId, String username, String company,
			String contact, Long telephone, Long dphone, String address,
			String charterurl, String idcardurl, Integer support) {
		this.userId = userId;
		this.username = username;
		this.company = company;
		this.contact = contact;
		this.telephone = telephone;
		this.dphone = dphone;
		this.address = address;
		this.charterurl = charterurl;
		this.idcardurl = idcardurl;
		this.support = support;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Long getTelephone() {
		return this.telephone;
	}

	public void setTelephone(Long telephone) {
		this.telephone = telephone;
	}

	public Long getDphone() {
		return this.dphone;
	}

	public void setDphone(Long dphone) {
		this.dphone = dphone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCharterurl() {
		return this.charterurl;
	}

	public void setCharterurl(String charterurl) {
		this.charterurl = charterurl;
	}

	public String getIdcardurl() {
		return this.idcardurl;
	}

	public void setIdcardurl(String idcardurl) {
		this.idcardurl = idcardurl;
	}

	public Integer getSupport() {
		return this.support;
	}

	public void setSupport(Integer support) {
		this.support = support;
	}

}