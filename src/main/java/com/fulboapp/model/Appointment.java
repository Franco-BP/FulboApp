package com.fulboapp.model;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Appointment implements Serializable {

	private static final long serialVersionUID = 5643675465432451265L;

	private Date date;

	private Match match;

	private Field field;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Match getMatch() {
		return match;
	}

	public void setMatch(Match match) {
		this.match = match;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}
}
