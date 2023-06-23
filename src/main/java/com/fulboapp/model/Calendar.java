package com.fulboapp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Calendar implements Serializable {

	private final static long serialVersionUID = 4563756980786578960L;
	
	private Map<Date, Appointment> appointments = new HashMap<>();
	
	public void addAppointment(Appointment appointment) {
		Date appointmentDate = appointment.getDate();
		if (!this.appointments.containsKey(appointmentDate)) {
			this.appointments.put(appointmentDate, appointment);
		}
	}
	
	public boolean isDateFree(Date date) {
		return this.appointments.containsKey(date);
	}

	public Map<Date, Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(Map<Date, Appointment> appointments) {
		this.appointments = appointments;
	}

}
