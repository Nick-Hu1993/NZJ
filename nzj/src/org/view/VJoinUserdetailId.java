package org.view;

/**
 * VJoinUserdetailId entity. @author MyEclipse Persistence Tools
 */

public class VJoinUserdetailId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long joinorderId;
	private String username;
	private String company;
	private String contact;
	private Long telephone;
	private Long dphone;
	private String address;
	private String charterurl;
	private String idcardurl;

	// Constructors

	/** default constructor */
	public VJoinUserdetailId() {
	}

	/** minimal constructor */
	public VJoinUserdetailId(Long id, Long joinorderId, String username,
			String company, String contact, Long telephone, Long dphone,
			String address) {
		this.id = id;
		this.joinorderId = joinorderId;
		this.username = username;
		this.company = company;
		this.contact = contact;
		this.telephone = telephone;
		this.dphone = dphone;
		this.address = address;
	}

	/** full constructor */
	public VJoinUserdetailId(Long id, Long joinorderId, String username,
			String company, String contact, Long telephone, Long dphone,
			String address, String charterurl, String idcardurl) {
		this.id = id;
		this.joinorderId = joinorderId;
		this.username = username;
		this.company = company;
		this.contact = contact;
		this.telephone = telephone;
		this.dphone = dphone;
		this.address = address;
		this.charterurl = charterurl;
		this.idcardurl = idcardurl;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getJoinorderId() {
		return this.joinorderId;
	}

	public void setJoinorderId(Long joinorderId) {
		this.joinorderId = joinorderId;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VJoinUserdetailId))
			return false;
		VJoinUserdetailId castOther = (VJoinUserdetailId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getJoinorderId() == castOther.getJoinorderId()) || (this
						.getJoinorderId() != null
						&& castOther.getJoinorderId() != null && this
						.getJoinorderId().equals(castOther.getJoinorderId())))
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
						.getIdcardurl().equals(castOther.getIdcardurl())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getJoinorderId() == null ? 0 : this.getJoinorderId()
						.hashCode());
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
		return result;
	}

}