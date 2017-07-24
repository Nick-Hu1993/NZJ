package org.Form;

//用于接收前端传来的数组组装成的对象
public class AuntContactForm implements java.io.Serializable {
	private long id;
	private String[] cname;
	private String[] relation;
	private String[] workstatus;
	private String[] cphone;
	private long[] auntId;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String[] getCname() {
		return cname;
	}
	public void setCname(String[] cname) {
		this.cname = cname;
	}
	public String[] getRelation() {
		return relation;
	}
	public void setRelation(String[] relation) {
		this.relation = relation;
	}
	public String[] getWorkstatus() {
		return workstatus;
	}
	public void setWorkstatus(String[] workstatus) {
		this.workstatus = workstatus;
	}
	public String[] getCphone() {
		return cphone;
	}
	public void setCphone(String[] cphone) {
		this.cphone = cphone;
	}
	public long[] getAuntId() {
		return auntId;
	}
	public void setAuntId(long[] auntId) {
		this.auntId = auntId;
	}
}
