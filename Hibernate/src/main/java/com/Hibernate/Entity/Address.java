package com.Hibernate.Entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "Address")
@Table(name = "Address_Pls")
public class Address {

	private String stateString;

	private String districtString;

	@Id
	@GenericGenerator(name="PinCod_id",strategy = "com.Hibernate.CustomIdGenerator.CustomId")
	@GeneratedValue(generator ="PinCod_id")
	private int pincode;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String stateString, String districtString, int pincode) {
		super();
		this.stateString = stateString;
		this.districtString = districtString;
		this.pincode = pincode;
	}

	public String getStateString() {
		return stateString;
	}

	public void setStateString(String stateString) {
		this.stateString = stateString;
	}

	public String getDistrictString() {
		return districtString;
	}

	public void setDistrictString(String districtString) {
		this.districtString = districtString;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [stateString=" + stateString + ", districtString=" + districtString + ", pincode=" + pincode
				+ "]";
	}

}
