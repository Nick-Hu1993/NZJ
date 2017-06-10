package org.view;

/**
 * VLanguage entity. @author MyEclipse Persistence Tools
 */

public class VLanguage implements java.io.Serializable {

	// Fields

	private VLanguageId id;

	// Constructors

	/** default constructor */
	public VLanguage() {
	}

	/** full constructor */
	public VLanguage(VLanguageId id) {
		this.id = id;
	}

	// Property accessors

	public VLanguageId getId() {
		return this.id;
	}

	public void setId(VLanguageId id) {
		this.id = id;
	}

}