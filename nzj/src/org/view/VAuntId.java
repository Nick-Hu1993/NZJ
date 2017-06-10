package org.view;

/**
 * VAuntId entity. @author MyEclipse Persistence Tools
 */

public class VAuntId implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Integer age;
	private String sign;
	private String native_;
	private Integer sex;
	private String education;
	private Integer marriage;
	private String nation;
	private Double height;
	private Double weight;
	private Double sigh;
	private String idnumber;
	private String phone;
	private String address;
	private Long userId;
	private String url;
	private Integer status;

	// Constructors

	/** default constructor */
	public VAuntId() {
	}

	/** full constructor */
	public VAuntId(Long id, String name, Integer age, String sign,
			String native_, Integer sex, String education, Integer marriage,
			String nation, Double height, Double weight, Double sigh,
			String idnumber, String phone, String address, Long userId,
			String url, Integer status) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.sign = sign;
		this.native_ = native_;
		this.sex = sex;
		this.education = education;
		this.marriage = marriage;
		this.nation = nation;
		this.height = height;
		this.weight = weight;
		this.sigh = sigh;
		this.idnumber = idnumber;
		this.phone = phone;
		this.address = address;
		this.userId = userId;
		this.url = url;
		this.status = status;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getNative_() {
		return this.native_;
	}

	public void setNative_(String native_) {
		this.native_ = native_;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Integer getMarriage() {
		return this.marriage;
	}

	public void setMarriage(Integer marriage) {
		this.marriage = marriage;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public Double getHeight() {
		return this.height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getSigh() {
		return this.sigh;
	}

	public void setSigh(Double sigh) {
		this.sigh = sigh;
	}

	public String getIdnumber() {
		return this.idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VAuntId))
			return false;
		VAuntId castOther = (VAuntId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getAge() == castOther.getAge()) || (this.getAge() != null
						&& castOther.getAge() != null && this.getAge().equals(
						castOther.getAge())))
				&& ((this.getSign() == castOther.getSign()) || (this.getSign() != null
						&& castOther.getSign() != null && this.getSign()
						.equals(castOther.getSign())))
				&& ((this.getNative_() == castOther.getNative_()) || (this
						.getNative_() != null && castOther.getNative_() != null && this
						.getNative_().equals(castOther.getNative_())))
				&& ((this.getSex() == castOther.getSex()) || (this.getSex() != null
						&& castOther.getSex() != null && this.getSex().equals(
						castOther.getSex())))
				&& ((this.getEducation() == castOther.getEducation()) || (this
						.getEducation() != null
						&& castOther.getEducation() != null && this
						.getEducation().equals(castOther.getEducation())))
				&& ((this.getMarriage() == castOther.getMarriage()) || (this
						.getMarriage() != null
						&& castOther.getMarriage() != null && this
						.getMarriage().equals(castOther.getMarriage())))
				&& ((this.getNation() == castOther.getNation()) || (this
						.getNation() != null && castOther.getNation() != null && this
						.getNation().equals(castOther.getNation())))
				&& ((this.getHeight() == castOther.getHeight()) || (this
						.getHeight() != null && castOther.getHeight() != null && this
						.getHeight().equals(castOther.getHeight())))
				&& ((this.getWeight() == castOther.getWeight()) || (this
						.getWeight() != null && castOther.getWeight() != null && this
						.getWeight().equals(castOther.getWeight())))
				&& ((this.getSigh() == castOther.getSigh()) || (this.getSigh() != null
						&& castOther.getSigh() != null && this.getSigh()
						.equals(castOther.getSigh())))
				&& ((this.getIdnumber() == castOther.getIdnumber()) || (this
						.getIdnumber() != null
						&& castOther.getIdnumber() != null && this
						.getIdnumber().equals(castOther.getIdnumber())))
				&& ((this.getPhone() == castOther.getPhone()) || (this
						.getPhone() != null && castOther.getPhone() != null && this
						.getPhone().equals(castOther.getPhone())))
				&& ((this.getAddress() == castOther.getAddress()) || (this
						.getAddress() != null && castOther.getAddress() != null && this
						.getAddress().equals(castOther.getAddress())))
				&& ((this.getUserId() == castOther.getUserId()) || (this
						.getUserId() != null && castOther.getUserId() != null && this
						.getUserId().equals(castOther.getUserId())))
				&& ((this.getUrl() == castOther.getUrl()) || (this.getUrl() != null
						&& castOther.getUrl() != null && this.getUrl().equals(
						castOther.getUrl())))
				&& ((this.getStatus() == castOther.getStatus()) || (this
						.getStatus() != null && castOther.getStatus() != null && this
						.getStatus().equals(castOther.getStatus())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getAge() == null ? 0 : this.getAge().hashCode());
		result = 37 * result
				+ (getSign() == null ? 0 : this.getSign().hashCode());
		result = 37 * result
				+ (getNative_() == null ? 0 : this.getNative_().hashCode());
		result = 37 * result
				+ (getSex() == null ? 0 : this.getSex().hashCode());
		result = 37 * result
				+ (getEducation() == null ? 0 : this.getEducation().hashCode());
		result = 37 * result
				+ (getMarriage() == null ? 0 : this.getMarriage().hashCode());
		result = 37 * result
				+ (getNation() == null ? 0 : this.getNation().hashCode());
		result = 37 * result
				+ (getHeight() == null ? 0 : this.getHeight().hashCode());
		result = 37 * result
				+ (getWeight() == null ? 0 : this.getWeight().hashCode());
		result = 37 * result
				+ (getSigh() == null ? 0 : this.getSigh().hashCode());
		result = 37 * result
				+ (getIdnumber() == null ? 0 : this.getIdnumber().hashCode());
		result = 37 * result
				+ (getPhone() == null ? 0 : this.getPhone().hashCode());
		result = 37 * result
				+ (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result
				+ (getUrl() == null ? 0 : this.getUrl().hashCode());
		result = 37 * result
				+ (getStatus() == null ? 0 : this.getStatus().hashCode());
		return result;
	}

}