package org.Form;

public class OrderTraineeForm implements java.io.Serializable{
	private Long[] id;
	private String[] name;
	private Integer[] sex;
	private Long[] birthday;
	private String[] address;
	private String[] idnumber;
	private String[] idcardurl1;
	private String[] idcardurl2;
	private String[] infourl;
	private String[] photourl;
	private Long[] orderId;
	
	public OrderTraineeForm() {
	}
	
	public OrderTraineeForm(String[] name, Integer[] sex, Long[] birthday,
			String[] address, String[] idnumber, String[] idcardurl1,
			String[] idcardurl2, String[] infourl, String[] photourl,
			Long[] orderId) {
		super();
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.idnumber = idnumber;
		this.idcardurl1 = idcardurl1;
		this.idcardurl2 = idcardurl2;
		this.infourl = infourl;
		this.photourl = photourl;
		this.orderId = orderId;
	}

	public OrderTraineeForm(Long[] id, String[] name, Integer[] sex,
			Long[] birthday, String[] address, String[] idnumber,
			String[] idcardurl1, String[] idcardurl2, String[] infourl,
			String[] photourl, Long[] orderId) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.idnumber = idnumber;
		this.idcardurl1 = idcardurl1;
		this.idcardurl2 = idcardurl2;
		this.infourl = infourl;
		this.photourl = photourl;
		this.orderId = orderId;
	}

	public Long[] getId() {
		return id;
	}
	public void setId(Long[] id) {
		this.id = id;
	}
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public Integer[] getSex() {
		return sex;
	}
	public void setSex(Integer[] sex) {
		this.sex = sex;
	}
	public Long[] getBirthday() {
		return birthday;
	}
	public void setBirthday(Long[] birthday) {
		this.birthday = birthday;
	}
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	public String[] getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String[] idnumber) {
		this.idnumber = idnumber;
	}
	public String[] getIdcardurl1() {
		return idcardurl1;
	}
	public void setIdcardurl1(String[] idcardurl1) {
		this.idcardurl1 = idcardurl1;
	}
	public String[] getIdcardurl2() {
		return idcardurl2;
	}
	public void setIdcardurl2(String[] idcardurl2) {
		this.idcardurl2 = idcardurl2;
	}
	public String[] getInfourl() {
		return infourl;
	}
	public void setInfourl(String[] infourl) {
		this.infourl = infourl;
	}
	public String[] getPhotourl() {
		return photourl;
	}
	public void setPhotourl(String[] photourl) {
		this.photourl = photourl;
	}
	public Long[] getOrderId() {
		return orderId;
	}
	public void setOrderId(Long[] orderId) {
		this.orderId = orderId;
	}
}
