package com.te.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.dto.Appointment;
import com.te.dto.Doctors;
import com.te.dto.Patients;

@Repository
public class AppointmentDao {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("hospital");

	public boolean appointBooked(Appointment appoint, int patientId, Doctors doctors) {
		boolean isBooked = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		Doctors existingDoctor = manager.find(Doctors.class, doctors.getDoctorId());
		Patients existingPatient = manager.find(Patients.class, patientId);
		try {
			trans.begin();
			appoint.setDoctorName(existingDoctor.getDoctorFirstName());
			appoint.setPatientName(existingPatient.getPatientName());
			manager.persist(appoint);

			trans.commit();
			isBooked = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isBooked;
	}
}
