package org.Form;

public class PactTrackingForm implements java.io.Serializable{

	private Long[] id;
	private Long[] pactId;
	private String[] content;	//进展
	private String[] ttime;		//时间
	
	public PactTrackingForm() {

	}

	public PactTrackingForm(Long[] id, Long[] pactId, String[] content,
			String[] ttime) {
		super();
		this.id = id;
		this.pactId = pactId;
		this.content = content;
		this.ttime = ttime;
	}

	public Long[] getId() {
		return id;
	}

	public void setId(Long[] id) {
		this.id = id;
	}

	public Long[] getPactId() {
		return pactId;
	}

	public void setPactId(Long[] pactId) {
		this.pactId = pactId;
	}

	public String[] getContent() {
		return content;
	}

	public void setContent(String[] content) {
		this.content = content;
	}

	public String[] getTtime() {
		return ttime;
	}

	public void setTtime(String[] ttime) {
		this.ttime = ttime;
	}
}
