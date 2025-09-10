package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	//jsp open 
	@GetMapping("/signup")
	public String openSignup(){
		return "Signup";//JSP Name
	}
	
	
}
