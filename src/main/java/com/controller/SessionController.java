package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class SessionController {

	@Autowired
	PasswordEncoder encoder;
	
	@Autowired
	JdbcTemplate stmt; 

	@Autowired
	UserDao userDao;
	
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

			System.out.println("plain password -> "+password);

			//encrypt password 
			String encryptedPassword  = encoder.encode(password); 
			
			System.out.println("encrypted Password => "+encryptedPassword);
			
			UserBean userBean  = new UserBean();
			userBean.setFirstName(firstName);
			userBean.setLastName(lastName);
			userBean.setEmail(email);
			userBean.setPassword(encryptedPassword);
			
			// db insert
			//kungfu -> plain text 
			userDao.addUser(userBean);
			return "Login";
		}
	}

}
