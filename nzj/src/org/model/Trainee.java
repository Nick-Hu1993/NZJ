package org.model;

/**
 * Trainee entity. @author MyEclipse Persistence Tools
 */

public class Trainee implements java.io.Serializable {

	// Fields

	private Long id;
	private String name;
	private Integer sex;
	private Long birthday;
	private String address;
	private String idnumber;
	private String idcardurl1;
	private String idcardurl2;
	private String infourl;
	private String photourl;
	private Integer pay;
	private Integer bind;
	private Long userId;

	// Constructors

	/** default constructor */
	public Trainee() {
	}

	/** full constructor */
	public Trainee(String name, Integer sex, Long birthday, String address,
			String idnumber, String idcardurl1, String idcardurl2,
			String infourl, String photourl, Integer pay, Integer bind,
			Long userId) {
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.idnumber = idnumber;
		this.idcardurl1 = idcardurl1;
		this.idcardurl2 = idcardurl2;
		this.infourl = infourl;
		this.photourl = photourl;
		this.pay = pay;
		this.bind = bind;
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

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Long getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Long birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdnumber() {
		return this.idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getIdcardurl1() {
		return this.idcardurl1;
	}

	public void setIdcardurl1(String idcardurl1) {
		this.idcardurl1 = idcardurl1;
	}

	public String getIdcardurl2() {
		return this.idcardurl2;
	}

	public void setIdcardurl2(String idcardurl2) {
		this.idcardurl2 = idcardurl2;
	}

	public String getInfourl() {
		return this.infourl;
	}

	public void setInfourl(String infourl) {
		this.infourl = infourl;
	}

	public String getPhotourl() {
		return this.photourl;
	}

	public void setPhotourl(String photourl) {
		this.photourl = photourl;
	}

	public Integer getPay() {
		return this.pay;
	}

	public void setPay(Integer pay) {
		this.pay = pay;
	}

	public Integer getBind() {
		return this.bind;
	}

	public void setBind(Integer bind) {
		this.bind = bind;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

}