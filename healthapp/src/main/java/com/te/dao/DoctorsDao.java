package com.te.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.te.dto.Doctors;

@Repository
public class DoctorsDao {

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("hospital");

	public boolean addDoctors(Doctors doctor) {
		boolean isInserted = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();

		try {
			trans.begin();
			manager.persist(doctor);
			trans.commit();
			isInserted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isInserted;

	}

	public Doctors getDoctors(Doctors doctor) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		Doctors existingDoctor = manager.find(Doctors.class, doctor.getDoctorId());

		return existingDoctor;
	}

	public Doctors loginDoctors(int doctorId) {

		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		Doctors existingDoctor = manager.find(Doctors.class, doctorId);

		return existingDoctor;
	}

	public boolean updateDoctors(Doctors doctor) {
		boolean isUpdate = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		Doctors existingDoctor = manager.find(Doctors.class, doctor.getDoctorId());

		try {
			trans.begin();
			if (existingDoctor.getDoctorFirstName() != null && existingDoctor.getDoctorFirstName() != "") {
				existingDoctor.setDoctorFirstName(doctor.getDoctorFirstName());
			}
			if (existingDoctor.getDoctorLastName() != null && existingDoctor.getDoctorLastName() != "") {
				existingDoctor.setDoctorFirstName(doctor.getDoctorFirstName());
			}
			if (existingDoctor.getDoctorPhone() != 0) {
				existingDoctor.setDoctorFirstName(doctor.getDoctorFirstName());
			}
			manager.persist(existingDoctor);
			trans.commit();
			isUpdate = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return isUpdate;

	}

	public boolean deleteDoctor(Doctors doctor) {
		boolean isDeleted = false;
		EntityManager manager = factory.createEntityManager();
		EntityTransaction trans = manager.getTransaction();
		Doctors existingDoctor = manager.find(Doctors.class, doctor.getDoctorId());
		manager.remove(existingDoctor);
		trans.commit();
		return isDeleted;
	}

}
