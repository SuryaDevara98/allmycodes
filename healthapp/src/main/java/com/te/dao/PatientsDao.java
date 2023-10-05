package com.te.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.dto.Patients;

@Repository
public class PatientsDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("hospital");

	public boolean addPatient(Patients patient) {
		boolean isInserted = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		try {
			trans.begin();
			if (patient.getPatientPassword() != null && patient.getPatientPassword() != "") {
				manager.persist(patient);
				trans.commit();
				isInserted = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isInserted;
	}

	public boolean updatePatient(Patients patient) {
		boolean isUpdated = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		try {
			trans.begin();
			Patients oldPat = manager.find(Patients.class, patient.getPatientId());
			oldPat.setPatientName(patient.getPatientName());
			oldPat.setPatientPhone(patient.getPatientPhone());
			oldPat.setPatientEmail(patient.getPatientEmail());
			manager.persist(oldPat);
			trans.commit();
			isUpdated = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isUpdated;
	}

	public boolean deletePatient(int id) {
		boolean isDeleted = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		try {
			trans.begin();
			Patients existingPatient = manager.find(Patients.class, id);
			manager.remove(existingPatient);
			trans.commit();
			isDeleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isDeleted;
	}

	public Patients loginOperation(int appointmentId) {
		EntityManager manager = factory.createEntityManager();
		Patients existingPatient = manager.find(Patients.class, appointmentId);
		return existingPatient;

	}

//	public boolean bookappointment(int doctorId, Patients patient) {
//		boolean isBooked = false;
//		EntityManager manager = factory.createEntityManager();
//		EntityTransaction trans = manager.getTransaction();
//		try {
//			trans.begin();
//			Doctors doctor = manager.find(Doctors.class, doctorId);
//			List<Doctors> doctors = new ArrayList();
//			doctors.add(doctor);
//			Patients existinPatient = manager.find(Patients.class, patient.getAppointmentId());
//			existinPatient.setDoctors(doctors);
//			manager.persist(existinPatient);
//			trans.commit();
//			isBooked = true;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return isBooked;
//	}

	public Patients getPatientDetails(int appointmentId) {

		EntityManager manager = factory.createEntityManager();

		Patients pat = manager.find(Patients.class, appointmentId);
		return pat;

	}

}
