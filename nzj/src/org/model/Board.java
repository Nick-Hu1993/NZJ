package org.model;

/**
 * Board entity. @author MyEclipse Persistence Tools
 */

public class Board implements java.io.Serializable {

	// Fields

	private Long id;
	private String title;
	private String description;
	private String name;
	private Long time;
	private String url;

	// Constructors

	/** default constructor */
	public Board() {
	}

	/** minimal constructor */
	public Board(String title, String name, Long time, String url) {
		this.title = title;
		this.name = name;
		this.time = time;
		this.url = url;
	}

	/** full constructor */
	public Board(String title, String description, String name, Long time,
			String url) {
		this.title = title;
		this.description = description;
		this.name = name;
		this.time = time;
		this.url = url;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getTime() {
		return this.time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}