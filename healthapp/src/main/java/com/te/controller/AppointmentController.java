package com.te.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.te.dto.Appointment;
import com.te.dto.Doctors;
import com.te.dto.Patients;
import com.te.service.AppointmentService;
import com.te.service.DoctorsService;
import com.te.service.PatientsService;

@Controller
@RequestMapping("/appointment")
public class AppointmentController {

	@Autowired
	private AppointmentService service;

	@Autowired
	private DoctorsService doctorService;

	@Autowired
	private PatientsService patientService;

	@GetMapping("/bookappointment_otp")
	public String getOtp() {
		return "otppage";

	}

	@GetMapping("/bookappointment")
	public String addAppointment(ModelMap map, Appointment appoint, HttpServletRequest req, Doctors doctor,
			Patients patient, int patientId, Doctors doctors) {
		if (service.appointBooked(appoint, patientId, doctors)) {
			Doctors existingDoctor = doctorService.getDoctors(doctor);
			// String time = req.getParameter("doctorstimeSlot");// time slot taken form
			// browser
			map.addAttribute("appointment", appoint);
			map.addAttribute("doctors", existingDoctor);
			// map.addAttribute("doctorTime", time);
			return "appointmentconfirmpage";
		}

		return "appointmentFailpage";

	}

}
