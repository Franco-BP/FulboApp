package com.fulboapp.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Field implements Serializable {

	private static final long serialVersionUID = 1564378723654987865L;

	private Long id;

	private Company owner;

	private String location;

	private String name;

	private Calendar calendar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Company getOwner() {
		return owner;
	}

	public void setOwner(Company owner) {
		this.owner = owner;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}

}
