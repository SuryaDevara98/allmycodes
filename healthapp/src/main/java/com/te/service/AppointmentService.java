package com.te.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.dao.AppointmentDao;
import com.te.dto.Appointment;
import com.te.dto.Doctors;

@Service
public class AppointmentService {

	@Autowired
	private AppointmentDao dao;

	public boolean appointBooked(Appointment appoint, int patientId, Doctors doctors) {
		return dao.appointBooked(appoint, patientId, doctors);
	}

}
