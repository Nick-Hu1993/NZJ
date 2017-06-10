package org.model;

/**
 * Staff entity. @author MyEclipse Persistence Tools
 */

public class Staff implements java.io.Serializable {

	// Fields

	private Long id;
	private Long phone;
	private String password;
	private String name;
	private String address;
	private String job;
	private Long time;
	private String photourl;
	private Long userId;

	// Constructors

	/** default constructor */
	public Staff() {
	}

	/** minimal constructor */
	public Staff(Long phone, String password, String name, String photourl,
			String job, Long time, Long userId) {
		this.phone = phone;
		this.password = password;
		this.name = name;
		this.photourl = photourl;
		this.job = job;
		this.time = time;
		this.userId = userId;
	}

	/** full constructor */
	public Staff(Long phone, String password, String name, String address,
			String photourl, String job, Long time, Long userId) {
		this.phone = phone;
		this.password = password;
		this.name = name;
		this.address = address;
		this.photourl = photourl;
		this.job = job;
		this.time = time;
		this.userId = userId;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhotourl() {
		return this.photourl;
	}

	public void setPhotourl(String photourl) {
		this.photourl = photourl;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
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

}