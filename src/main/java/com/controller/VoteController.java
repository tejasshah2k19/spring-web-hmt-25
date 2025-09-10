package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VoteController {

	@GetMapping("inputvote")
	public String inputVote() {
		return "InputVote";// ?
	}

	@PostMapping("checkvote")
	public String checkVote(String firstName, Integer bYear, String gender,Model model) {
		System.out.println(firstName);
		System.out.println(bYear);
		System.out.println(gender);

		Integer age = 2025 - bYear;
		System.out.println(age);

		if (gender.equals("male") && age > 17) {
			System.out.println("Eligible");
			model.addAttribute("message","Eligible");
		} else if (gender.equals("female") && age > 21) {
			System.out.println("Eligible");
			model.addAttribute("message","Eligible");

		} else {
			System.out.println("Not Eligible");
			model.addAttribute("message","Not Eligible");
		}
		return "VoteResult";
	}
}
