package com.fulboapp.dto;

import java.io.Serializable;
import lombok.Data;
import com.fulboapp.model.Calendar;

@Data
public class FieldDTO implements Serializable {

	private static final long serialVersionUID = 6436534623514231341L;

	private Long id;

	private CompanyDTO owner;

	private String location;

	private String name;
	
	private Calendar calendar;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CompanyDTO getOwner() {
		return owner;
	}

	public void setOwner(CompanyDTO owner) {
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
