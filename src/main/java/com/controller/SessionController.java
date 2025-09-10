package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {

	@GetMapping("register")
	public String register() {
		return "Register";
	}

	@GetMapping("signin")
	public String login() {
		return "Login";
	}

	@PostMapping("saveuser")
	public String saveUser(@RequestParam String firstName, String lastName, String email, String password,Model model) {
		// read
		System.out.println("firstName => " + firstName);
		System.out.println(lastName);
		System.out.println(email);
		System.out.println(password);
		// validation
		boolean isError = false;

		if (firstName == null || firstName.isBlank()) {
			isError = true;
			model.addAttribute("firstNameError","Please Enter FirstName");
		}
		if (lastName == null || lastName.isBlank()) {
			isError = true;
			model.addAttribute("lastNameError","Please Enter LastName");
		}

		if (isError == true) {
			return "Register";
		} else {

			// db insert
			return "Login";
		}
	}

}
