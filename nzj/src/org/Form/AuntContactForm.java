package org.Form;

//用于接收前端传来的数组组装成的对象
public class AuntContactForm implements java.io.Serializable {
	private Long[] id;
	private String[] cname;
	private String[] relation;
	private String[] workstatus;
	private String[] cphone;
	private Long[] auntId;
	
	public AuntContactForm() {
	}

	public AuntContactForm(Long[] id, String[] cname, String[] relation,
			String[] workstatus, String[] cphone, Long[] auntId) {
		super();
		this.id = id;
		this.cname = cname;
		this.relation = relation;
		this.workstatus = workstatus;
		this.cphone = cphone;
		this.auntId = auntId;
	}
	
	public Long[] getId() {
		return id;
	}
	public void setId(Long[] id) {
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
	public Long[] getAuntId() {
		return auntId;
	}
	public void setAuntId(Long[] auntId) {
		this.auntId = auntId;
	}
}
