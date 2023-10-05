package com.te.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.customexceptions.InvalidPasswordException;
import com.te.dao.DoctorsDao;
import com.te.dto.Doctors;

@Service
public class DoctorsService {

	@Autowired
	private DoctorsDao dao;

	public boolean doctorAdd(Doctors doctor) {
		if (doctor.getDoctorFirstName().equals(doctor.getDoctorPassword())) {
			throw new InvalidPasswordException(
					"Password and User Name should not be same, Please  provide another Password");
		}
		return dao.addDoctors(doctor);
	}

	public Doctors getDoctors(Doctors doctor) {
		return dao.getDoctors(doctor);
	}

	public boolean loginDoctors(int doctorId, String doctorPassword) {
		boolean islogged = false;

		Doctors doctor = dao.loginDoctors(doctorId);
		if (doctor.getDoctorPassword().equals(doctorPassword)) {
			return islogged = true;

		} else {
			return islogged;
		}

	}

	public boolean updateDoctors(Doctors doctor) {
		return dao.updateDoctors(doctor);
	}

	public boolean deleteDoctor(Doctors doctor) {
		return dao.deleteDoctor(doctor);
	}
}
