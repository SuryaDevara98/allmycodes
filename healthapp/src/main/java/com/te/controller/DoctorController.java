package com.te.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.te.dto.Doctors;
import com.te.service.DoctorsService;

@Controller
@RequestMapping("/doctorpage")
public class DoctorController {

	@Autowired
	private DoctorsService service;

	@GetMapping("/doctor")
	public String doctorLogin(ModelMap map) {
		return "doctorlogin";
	}

	@GetMapping("/doctors")
	public String doctors(ModelMap map) {
		return "doctors";
	}

	@PostMapping("/doctorloginconfirm")
	public String doctorLoginConfirm(ModelMap map, int doctorId, String doctorPassword) {
		if (service.loginDoctors(doctorId, doctorPassword)) {
			return "doctorloginconfirm";
		}
		return "doctorlogin";
	}

	@GetMapping("/doctorsregister")
	public String registerDoctors(ModelMap map) {
		return "doctorsregister";
	}

	@PostMapping("/doctorsregisterconfirm")
	public String registerDoctorsConfirm(ModelMap map, Doctors doctor) {
		if (service.doctorAdd(doctor)) {
			map.addAttribute("doctors", doctor);
			map.addAttribute("msg", "Details added successfully, Thanks for choosing Miami Hospital ");
			return "doctorsregisterconfirm";
		}
		return "doctoraddfailed";
	}

	@GetMapping("/doctorupdate")
	public String updateDoctor(ModelMap map) {
		return "updatedoctor";

	}

	@GetMapping("/doctorfetchpatient")
	public String doctorFetchPatient(ModelMap map) {
		return "doctorappointments";

	}

	@GetMapping("/doctorfetchpatientconfirm")
	public String doctorFetchPatientConfirm(ModelMap map, Doctors doctor) {
		map.addAttribute("doctorID", doctor);
		return "doctorspatientpage";

	}

	@PostMapping("/updateconfirm")
	public String updateDoctor(ModelMap map, Doctors doctors) {
		if (service.updateDoctors(doctors)) {
			map.addAttribute("doctors", doctors);
			map.addAttribute("msg", "Details updated successfully, Thanks for choosing Miami Hospital ");

		}
		return "updateconfirmpage";

	}
}
