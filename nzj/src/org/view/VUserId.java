package org.view;

/**
 * VUserId entity. @author MyEclipse Persistence Tools
 */

public class VUserId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long phone;
	private String time;
	private Integer rank;
	private Integer ack;
	private String username;
	private String company;
	private String contact;
	private Long telephone;
	private Long dphone;
	private String address;
	private String charterurl;
	private String idcardurl;
	private Long did;
	private Integer support;
	private Long clock;

	// Constructors

	/** default constructor */
	public VUserId() {
	}

	/** minimal constructor */
	public VUserId(Long id, Long phone, Integer rank, Integer ack,
			String username, String company, String contact, Long telephone,
			Long dphone, String address, Long did, Integer support, Long clock) {
		this.id = id;
		this.phone = phone;
		this.rank = rank;
		this.ack = ack;
		this.username = username;
		this.company = company;
		this.contact = contact;
		this.telephone = telephone;
		this.dphone = dphone;
		this.address = address;
		this.did = did;
		this.support = support;
		this.clock = clock;
	}

	/** full constructor */
	public VUserId(Long id, Long phone, String time, Integer rank, Integer ack,
			String username, String company, String contact, Long telephone,
			Long dphone, String address, String charterurl, String idcardurl,
			Long did, Integer support, Long clock) {
		this.id = id;
		this.phone = phone;
		this.time = time;
		this.rank = rank;
		this.ack = ack;
		this.username = username;
		this.company = company;
		this.contact = contact;
		this.telephone = telephone;
		this.dphone = dphone;
		this.address = address;
		this.charterurl = charterurl;
		this.idcardurl = idcardurl;
		this.did = did;
		this.support = support;
		this.clock = clock;
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

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
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

	public Long getDid() {
		return this.did;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public Integer getSupport() {
		return this.support;
	}

	public void setSupport(Integer support) {
		this.support = support;
	}

	public Long getClock() {
		return this.clock;
	}

	public void setClock(Long clock) {
		this.clock = clock;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VUserId))
			return false;
		VUserId castOther = (VUserId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getPhone() == castOther.getPhone()) || (this
						.getPhone() != null && castOther.getPhone() != null && this
						.getPhone().equals(castOther.getPhone())))
				&& ((this.getTime() == castOther.getTime()) || (this.getTime() != null
						&& castOther.getTime() != null && this.getTime()
						.equals(castOther.getTime())))
				&& ((this.getRank() == castOther.getRank()) || (this.getRank() != null
						&& castOther.getRank() != null && this.getRank()
						.equals(castOther.getRank())))
				&& ((this.getAck() == castOther.getAck()) || (this.getAck() != null
						&& castOther.getAck() != null && this.getAck().equals(
						castOther.getAck())))
				&& ((this.getUsername() == castOther.getUsername()) || (this
						.getUsername() != null
						&& castOther.getUsername() != null && this
						.getUsername().equals(castOther.getUsername())))
				&& ((this.getCompany() == castOther.getCompany()) || (this
						.getCompany() != null && castOther.getCompany() != null && this
						.getCompany().equals(castOther.getCompany())))
				&& ((this.getContact() == castOther.getContact()) || (this
						.getContact() != null && castOther.getContact() != null && this
						.getContact().equals(castOther.getContact())))
				&& ((this.getTelephone() == castOther.getTelephone()) || (this
						.getTelephone() != null
						&& castOther.getTelephone() != null && this
						.getTelephone().equals(castOther.getTelephone())))
				&& ((this.getDphone() == castOther.getDphone()) || (this
						.getDphone() != null && castOther.getDphone() != null && this
						.getDphone().equals(castOther.getDphone())))
				&& ((this.getAddress() == castOther.getAddress()) || (this
						.getAddress() != null && castOther.getAddress() != null && this
						.getAddress().equals(castOther.getAddress())))
				&& ((this.getCharterurl() == castOther.getCharterurl()) || (this
						.getCharterurl() != null
						&& castOther.getCharterurl() != null && this
						.getCharterurl().equals(castOther.getCharterurl())))
				&& ((this.getIdcardurl() == castOther.getIdcardurl()) || (this
						.getIdcardurl() != null
						&& castOther.getIdcardurl() != null && this
						.getIdcardurl().equals(castOther.getIdcardurl())))
				&& ((this.getDid() == castOther.getDid()) || (this.getDid() != null
						&& castOther.getDid() != null && this.getDid().equals(
						castOther.getDid())))
				&& ((this.getSupport() == castOther.getSupport()) || (this
						.getSupport() != null && castOther.getSupport() != null && this
						.getSupport().equals(castOther.getSupport())))
				&& ((this.getClock() == castOther.getClock()) || (this
						.getClock() != null && castOther.getClock() != null && this
						.getClock().equals(castOther.getClock())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getPhone() == null ? 0 : this.getPhone().hashCode());
		result = 37 * result
				+ (getTime() == null ? 0 : this.getTime().hashCode());
		result = 37 * result
				+ (getRank() == null ? 0 : this.getRank().hashCode());
		result = 37 * result
				+ (getAck() == null ? 0 : this.getAck().hashCode());
		result = 37 * result
				+ (getUsername() == null ? 0 : this.getUsername().hashCode());
		result = 37 * result
				+ (getCompany() == null ? 0 : this.getCompany().hashCode());
		result = 37 * result
				+ (getContact() == null ? 0 : this.getContact().hashCode());
		result = 37 * result
				+ (getTelephone() == null ? 0 : this.getTelephone().hashCode());
		result = 37 * result
				+ (getDphone() == null ? 0 : this.getDphone().hashCode());
		result = 37 * result
				+ (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37
				* result
				+ (getCharterurl() == null ? 0 : this.getCharterurl()
						.hashCode());
		result = 37 * result
				+ (getIdcardurl() == null ? 0 : this.getIdcardurl().hashCode());
		result = 37 * result
				+ (getDid() == null ? 0 : this.getDid().hashCode());
		result = 37 * result
				+ (getSupport() == null ? 0 : this.getSupport().hashCode());
		result = 37 * result
				+ (getClock() == null ? 0 : this.getClock().hashCode());
		return result;
	}

}