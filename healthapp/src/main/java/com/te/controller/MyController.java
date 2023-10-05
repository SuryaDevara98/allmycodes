package com.te.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class MyController {

	@GetMapping("/homepage")
	public String signUp(ModelMap map) {

		return "hospital";

	}

	@GetMapping("/about")
	public String aboutHospital(ModelMap map) {
		return "about";
	}

	@GetMapping("/news")
	public String news(ModelMap map) {
		return "news";
	}

	@GetMapping("/contact")
	public String contact(ModelMap map) {
		return "contact";
	}

	@GetMapping("/doctor")
	public String doctor(ModelMap map) {
		return "doctorspage";
	}

	@GetMapping("/patient")
	public String patient(ModelMap map) {
		return "patientlogin";
	}

}
