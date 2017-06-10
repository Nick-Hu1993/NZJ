package org.Form;

public class SupportTrackingForm implements java.io.Serializable {
	private String[] ttime;
	private String[] content;
	private Integer[] status;
	private Integer[] typeId;
	private long userId;
	
	public String[] getTtime() {
		return ttime;
	}
	public void setTtime(String[] ttime) {
		this.ttime = ttime;
	}
	public String[] getContent() {
		return content;
	}
	public void setContent(String[] content) {
		this.content = content;
	}
	public Integer[] getStatus() {
		return status;
	}
	public void setStatus(Integer[] status) {
		this.status = status;
	}
	public Integer[] getTypeId() {
		return typeId;
	}
	public void setTypeId(Integer[] typeId) {
		this.typeId = typeId;
	}
	public long getuserId() {
		return userId;
	}
	public void setuserId(long userId) {
		this.userId = userId;
	}
}
