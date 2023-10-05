package com.te.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.te.dto.Patients;
//import com.te.service.AppointmentService;
import com.te.service.PatientsService;

@Controller
@RequestMapping("/patient")
public class PatientController {

//	private AppointmentService appointmentService;
	@Autowired
	private PatientsService patientService;

	@GetMapping("/patientlogin")
	public String patientLogin(ModelMap map) {
		return "patientlogin";
	}

	@PostMapping("/patientloginconfirm")
	public String patientlogincorfirm(ModelMap map, int appointmentId, String patientPassword) {
		System.out.println(appointmentId);
		if (patientService.loginOperation(appointmentId, patientPassword)) {
			return "patientloginconfirm";
		} else {
			return "patientlogin";
		}

	}

	@GetMapping("/patientregister")
	public String patientRegister(ModelMap map, HttpServletRequest req) {
		Cookie[] cookie = req.getCookies();
		for (Cookie cook : cookie) {
			if (cook.getName().equals("myCookie")) {
				map.addAttribute("patientCookie", cook.getValue());

			}
		}
		return "patientregistration";
	}

	@GetMapping("/updatepatient")
	public String updatePatient(ModelMap map) {
		return "updatepatient";
	}

	@PostMapping("/patientregisterconfirm")
	public String addPatient(ModelMap map, Patients patient, HttpServletResponse resp) {

		Cookie cookie = new Cookie("myCookie", patient.getPatientName());
		cookie.setMaxAge(120);
		resp.addCookie(cookie);

		if (patientService.addPatient(patient)) {
			map.addAttribute("msg", "your details added successfully");
			map.addAttribute("patient", patient);
		}
		return "patientregisterconfirm";
	}

	@PostMapping("/updatepatientconfirm")
	public String updatePatient(ModelMap map, Patients patient) {
		if (patientService.updatePatient(patient)) {
			map.addAttribute("msg", "your details updated successfully");
			map.addAttribute("patient", patient);
		}
		return "updatepatientconfirm";
	}
//
//	@PostMapping("/patientregisterconfirm")
//	public String addNameConfirm(ModelMap map, Appointment appointment) {
//		if (appointmentService.addPatient(appointment)) {
//			map.addAttribute("msg", "Your data added successfully");
//			map.addAttribute("existPatient", appointment);
//		} else {
//			map.addAttribute("msg", "Unable to adda details of trainee, Please try again Later!");
//		}
//
//		return "patientregisterconfirm";
//	}

//	@GetMapping("/bookappointment")
//	public String addAppoint(ModelMap map, HttpServletRequest req, int doctorId, Patients patient) {
//		if (patientService.bookAppointment(doctorId, patient)) {
//			map.addAttribute("msg", "Thank you for choosing our hospital");
//			return "appointmentconfirmpage";
//		} else {
//			return "appointmentFailpage";
//		}
//	}

	@GetMapping("/getpatient")
	public String getPatient() {
		return "getpatientpage";
	}

	@PostMapping("/getpatientconfirm")
	public String getpatientconfirm(ModelMap map, int appointmentId) {
		Patients existingpatient = patientService.getPatient(appointmentId);

		map.addAttribute("msg", "here are the details of you");
		map.addAttribute("patient", existingpatient);

		return "getpatientconfirm";
	}

	@GetMapping("/logout")
	public String logout(ModelMap map) {
		map.addAttribute("msg", "Thankyou for Choosing our Hospital");
		return "logout";
	}

}
