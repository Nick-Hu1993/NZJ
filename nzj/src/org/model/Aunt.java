package org.model;

/**
 * Aunt entity. @author MyEclipse Persistence Tools
 */

public class Aunt implements java.io.Serializable {

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
	private Integer status;
	private Long userId;

	// Constructors

	/** default constructor */
	public Aunt() {
	}

	/** full constructor */
	public Aunt(String name, Integer age, String sign, String native_,
			Integer sex, String education, Integer marriage, String nation,
			Double height, Double weight, Double sigh, String idnumber,
			String phone, String address, Integer status, Long userId) {
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
		this.status = status;
		this.userId = userId;
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

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}