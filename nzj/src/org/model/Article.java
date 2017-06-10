package org.model;

/**
 * Article entity. @author MyEclipse Persistence Tools
 */

public class Article implements java.io.Serializable {

	// Fields

	private Long id;
	private String title;
	private String digest;
	private String url;
	private Long time;
	private String fstr;
	
	public Article() {
	}
	
	public Article( String title, String digest, String url, Long time,
			String fstr) {
		super();
		this.title = title;
		this.digest = digest;
		this.url = url;
		this.time = time;
		this.fstr = fstr;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDigest() {
		return digest;
	}
	public void setDigest(String digest) {
		this.digest = digest;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
	public String getFstr() {
		return fstr;
	}
	public void setFstr(String fstr) {
		this.fstr = fstr;
	}
}