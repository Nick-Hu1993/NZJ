package org.view;

/**
 * VOrderTraineedetailId entity. @author MyEclipse Persistence Tools
 */

public class VOrderTraineedetailId implements java.io.Serializable {

	// Fields

	private Long id;
	private Long orderId;
	private Long traineeId;
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
	private Long tuid;

	// Constructors

	/** default constructor */
	public VOrderTraineedetailId() {
	}

	/** minimal constructor */
	public VOrderTraineedetailId(Long id, Long orderId, Long traineeId) {
		this.id = id;
		this.orderId = orderId;
		this.traineeId = traineeId;
	}

	/** full constructor */
	public VOrderTraineedetailId(Long id, Long orderId, Long traineeId,
			String name, Integer sex, Long birthday, String address,
			String idnumber, String idcardurl1, String idcardurl2,
			String infourl, String photourl, Integer pay, Integer bind,
			Long tuid) {
		this.id = id;
		this.orderId = orderId;
		this.traineeId = traineeId;
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
		this.tuid = tuid;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getTraineeId() {
		return this.traineeId;
	}

	public void setTraineeId(Long traineeId) {
		this.traineeId = traineeId;
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

	public Long getTuid() {
		return this.tuid;
	}

	public void setTuid(Long tuid) {
		this.tuid = tuid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VOrderTraineedetailId))
			return false;
		VOrderTraineedetailId castOther = (VOrderTraineedetailId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getOrderId() == castOther.getOrderId()) || (this
						.getOrderId() != null && castOther.getOrderId() != null && this
						.getOrderId().equals(castOther.getOrderId())))
				&& ((this.getTraineeId() == castOther.getTraineeId()) || (this
						.getTraineeId() != null
						&& castOther.getTraineeId() != null && this
						.getTraineeId().equals(castOther.getTraineeId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getSex() == castOther.getSex()) || (this.getSex() != null
						&& castOther.getSex() != null && this.getSex().equals(
						castOther.getSex())))
				&& ((this.getBirthday() == castOther.getBirthday()) || (this
						.getBirthday() != null
						&& castOther.getBirthday() != null && this
						.getBirthday().equals(castOther.getBirthday())))
				&& ((this.getAddress() == castOther.getAddress()) || (this
						.getAddress() != null && castOther.getAddress() != null && this
						.getAddress().equals(castOther.getAddress())))
				&& ((this.getIdnumber() == castOther.getIdnumber()) || (this
						.getIdnumber() != null
						&& castOther.getIdnumber() != null && this
						.getIdnumber().equals(castOther.getIdnumber())))
				&& ((this.getIdcardurl1() == castOther.getIdcardurl1()) || (this
						.getIdcardurl1() != null
						&& castOther.getIdcardurl1() != null && this
						.getIdcardurl1().equals(castOther.getIdcardurl1())))
				&& ((this.getIdcardurl2() == castOther.getIdcardurl2()) || (this
						.getIdcardurl2() != null
						&& castOther.getIdcardurl2() != null && this
						.getIdcardurl2().equals(castOther.getIdcardurl2())))
				&& ((this.getInfourl() == castOther.getInfourl()) || (this
						.getInfourl() != null && castOther.getInfourl() != null && this
						.getInfourl().equals(castOther.getInfourl())))
				&& ((this.getPhotourl() == castOther.getPhotourl()) || (this
						.getPhotourl() != null
						&& castOther.getPhotourl() != null && this
						.getPhotourl().equals(castOther.getPhotourl())))
				&& ((this.getPay() == castOther.getPay()) || (this.getPay() != null
						&& castOther.getPay() != null && this.getPay().equals(
						castOther.getPay())))
				&& ((this.getBind() == castOther.getBind()) || (this.getBind() != null
						&& castOther.getBind() != null && this.getBind()
						.equals(castOther.getBind())))
				&& ((this.getTuid() == castOther.getTuid()) || (this.getTuid() != null
						&& castOther.getTuid() != null && this.getTuid()
						.equals(castOther.getTuid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getOrderId() == null ? 0 : this.getOrderId().hashCode());
		result = 37 * result
				+ (getTraineeId() == null ? 0 : this.getTraineeId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getSex() == null ? 0 : this.getSex().hashCode());
		result = 37 * result
				+ (getBirthday() == null ? 0 : this.getBirthday().hashCode());
		result = 37 * result
				+ (getAddress() == null ? 0 : this.getAddress().hashCode());
		result = 37 * result
				+ (getIdnumber() == null ? 0 : this.getIdnumber().hashCode());
		result = 37
				* result
				+ (getIdcardurl1() == null ? 0 : this.getIdcardurl1()
						.hashCode());
		result = 37
				* result
				+ (getIdcardurl2() == null ? 0 : this.getIdcardurl2()
						.hashCode());
		result = 37 * result
				+ (getInfourl() == null ? 0 : this.getInfourl().hashCode());
		result = 37 * result
				+ (getPhotourl() == null ? 0 : this.getPhotourl().hashCode());
		result = 37 * result
				+ (getPay() == null ? 0 : this.getPay().hashCode());
		result = 37 * result
				+ (getBind() == null ? 0 : this.getBind().hashCode());
		result = 37 * result
				+ (getTuid() == null ? 0 : this.getTuid().hashCode());
		return result;
	}

}