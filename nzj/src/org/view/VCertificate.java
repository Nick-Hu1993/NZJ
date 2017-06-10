package org.view;

/**
 * VCertificate entity. @author MyEclipse Persistence Tools
 */

public class VCertificate implements java.io.Serializable {

	// Fields

	private VCertificateId id;

	// Constructors

	/** default constructor */
	public VCertificate() {
	}

	/** full constructor */
	public VCertificate(VCertificateId id) {
		this.id = id;
	}

	// Property accessors

	public VCertificateId getId() {
		return this.id;
	}

	public void setId(VCertificateId id) {
		this.id = id;
	}

}