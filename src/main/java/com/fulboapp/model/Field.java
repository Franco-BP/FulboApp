package com.fulboapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "CANCHA")
@PrimaryKeyJoinColumn(name = "CANCHA_ID")
public class Field {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CANCHA_ID")
	private Integer id;

	@Column(name = "DUEÑO")
	private Company owner;

	@Column(name = "UBICACION", length = 255)
	private String location;

	@Column(name = "NOMBRE", length = 255)
	private String name;

	@Column(name = "CALENDARIO")
	private Calendar calendar;

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
