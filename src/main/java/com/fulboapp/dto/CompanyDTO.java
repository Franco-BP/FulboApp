package com.fulboapp.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class CompanyDTO implements Serializable {

	private static final long serialVersionUID = 4356543432156478977L;

	private Integer id;

	private String companyName;

	private String phoneNumber;

	private String email;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
