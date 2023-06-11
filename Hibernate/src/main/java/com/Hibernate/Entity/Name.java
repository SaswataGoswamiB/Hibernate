package com.Hibernate.Entity;

import jakarta.persistence.Embeddable;


@Embeddable
public class Name {
	
	private String firstNameString;
	
	private String middleNameString;
	
	private String lastNameString;

	public Name() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Name(String firstNameString, String middleNameString, String lastNameString) {
		super();
		this.firstNameString = firstNameString;
		this.middleNameString = middleNameString;
		this.lastNameString = lastNameString;
	}

	public String getFirstNameString() {
		return firstNameString;
	}

	public void setFirstNameString(String firstNameString) {
		this.firstNameString = firstNameString;
	}

	public String getMiddleNameString() {
		return middleNameString;
	}

	public void setMiddleNameString(String middleNameString) {
		this.middleNameString = middleNameString;
	}

	public String getLastNameString() {
		return lastNameString;
	}

	public void setLastNameString(String lastNameString) {
		this.lastNameString = lastNameString;
	}

	@Override
	public String toString() {
		return "Name [firstNameString=" + firstNameString + ", middleNameString=" + middleNameString
				+ ", lastNameString=" + lastNameString + "]";
	}
	
	

}
