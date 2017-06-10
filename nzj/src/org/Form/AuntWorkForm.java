package org.Form;

//用于接收前端传来的数组组装成的对象
public class AuntWorkForm implements java.io.Serializable{
	private Long[] id;
	private String[] time;
	private String[] work;
	private Long[] auntId;
	
	public AuntWorkForm() {
	}

	public AuntWorkForm(Long[] id, String[] time, String[] work, Long[] auntId) {
		super();
		this.id = id;
		this.time = time;
		this.work = work;
		this.auntId = auntId;
	}

	public Long[] getId() {
		return id;
	}

	public void setId(Long[] id) {
		this.id = id;
	}

	public String[] getTime() {
		return time;
	}

	public void setTime(String[] time) {
		this.time = time;
	}

	public String[] getWork() {
		return work;
	}

	public void setWork(String[] work) {
		this.work = work;
	}

	public Long[] getAuntId() {
		return auntId;
	}

	public void setAuntId(Long[] auntId) {
		this.auntId = auntId;
	}
}
