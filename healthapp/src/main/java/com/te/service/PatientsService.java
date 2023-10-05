package com.te.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.customexceptions.InvalidPasswordException;
import com.te.dao.PatientsDao;
import com.te.dto.Patients;

@Service
public class PatientsService {
	@Autowired
	private PatientsDao dao;

	public boolean addPatient(Patients patient) {
		if (patient.getPatientName().equals(patient.getPatientPassword())) {
			throw new InvalidPasswordException("Password should not be same as patient name");
		}
		return dao.addPatient(patient);
	}

	public boolean updatePatient(Patients patient) {
		return dao.updatePatient(patient);
	}

	public boolean deletePatient(int id) {
		return dao.deletePatient(id);
	}

	public boolean loginOperation(int appointmentId, String patientPassword) {
		boolean isPresent = false;

		Patients patientLogin = dao.loginOperation(appointmentId);
		if (patientLogin.getPatientPassword().equals(patientPassword)) {
			isPresent = true;
			return isPresent;

		} else {
			return isPresent;
		}

	}

//	public boolean bookAppointment(int doctorId, Patients patient) {
//		return dao.bookappointment(doctorId, patient);
//
//	}

	public Patients getPatient(int appointmentId) {
		return dao.getPatientDetails(appointmentId);

	}

}
