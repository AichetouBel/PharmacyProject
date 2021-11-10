package com.pharmacie.pharmacie.domain.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pharmacie.pharmacie.domain.services.patientService;

@Controller
public class loginController {
	
	@Autowired
    private final patientService pService;
	
	public loginController(patientService ps) {
        this.pService = ps;
    }
	
	//the welcome page
		@RequestMapping("/index")
		public String firstPage() {
			return "frontend/index";
		}
		
		@RequestMapping("/login")
		public String loginPage() {
			return "frontend/login";
		}
		
		@RequestMapping("/signup")
		public String signupPage() {
			return "frontend/signup";
		}
}
