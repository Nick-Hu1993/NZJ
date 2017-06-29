package org.model;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Long id;
	//填表人
	private String preparer;
	//联系号码
	private String phone;
	//订单状态
	private Integer status;
	//制证单价
	private Double price;
	//学员数量
	private Double quantity;
	//学员总价
	private Double total;
	//支付方式
	private Integer payment;
	//订单生成时间
	private Long time;
	//所属用户的id
	private Long userId;

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** full constructor */
	public Orders(String preparer, String phone, Integer status, Double price,
			Double quantity, Double total, Integer payment, Long time,
			Long userId) {
		this.preparer = preparer;
		this.phone = phone;
		this.status = status;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		this.payment = payment;
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

	public String getPreparer() {
		return this.preparer;
	}

	public void setPreparer(String preparer) {
		this.preparer = preparer;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTotal() {
		return this.total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getPayment() {
		return this.payment;
	}

	public void setPayment(Integer payment) {
		this.payment = payment;
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