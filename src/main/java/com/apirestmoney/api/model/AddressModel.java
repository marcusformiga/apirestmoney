package com.apirestmoney.api.model;

import javax.persistence.Embeddable;

@Embeddable
public abstract class AddressModel {
	private String state;
	private String city;
	private String zipCode;
	private String others;
	
//	public AddressModel() {}
//
//	public AddressModel(String state, String city, String zipCode, String others) {
//		super();
//		this.state = state;
//		this.city = city;
//		this.zipCode = zipCode;
//		this.others = others;
//	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}
	
	
}
