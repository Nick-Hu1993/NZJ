package org.view;

/**
 * VOrderTraineedetail entity. @author MyEclipse Persistence Tools
 */

public class VOrderTraineedetail implements java.io.Serializable {

	// Fields

	private VOrderTraineedetailId id;

	// Constructors

	/** default constructor */
	public VOrderTraineedetail() {
	}

	/** full constructor */
	public VOrderTraineedetail(VOrderTraineedetailId id) {
		this.id = id;
	}

	// Property accessors

	public VOrderTraineedetailId getId() {
		return this.id;
	}

	public void setId(VOrderTraineedetailId id) {
		this.id = id;
	}

}