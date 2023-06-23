package com.fulboapp.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Company implements Serializable {

	private static final long serialVersionUID = 2564796854326751275L;

	private Long id;

	private String companyName;

	private String phoneNumber;

	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
