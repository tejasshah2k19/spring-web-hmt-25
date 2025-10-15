package com.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.EmployeeBean;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.dao.EmployeeDao;
import com.service.MailerService;

@Controller
public class EmployeeController {

	@Autowired // will create object ? singleton
	EmployeeDao employeeDao;

	@Autowired
	Cloudinary cloudinary;
	
	@Autowired
	MailerService mailerService;

	@GetMapping("newemployee")
	public String newEmployee() {
		return "NewEmployee";
	}

	@PostMapping("saveemployee")
	public String saveEmp(EmployeeBean employeeBean) {
		// upload file to cloudinary
		try {
			Map result = cloudinary.uploader().upload(employeeBean.getProfilePic().getBytes(),
					ObjectUtils.asMap("resource_type", "auto"));
			String profilePicUrl = result.get("secure_url").toString();
			System.out.println(profilePicUrl);
			employeeBean.setProfilePicURL(profilePicUrl);
			employeeDao.addEmployee(employeeBean);
			// send welcome mail
			mailerService.sendWelcomeMail(employeeBean.getEmail());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "redirect:/listemp";
	}

	@GetMapping("listemp")
	public String listEmp(Model model) {

		List<EmployeeBean> employeeList = employeeDao.getAllEmployee();
		model.addAttribute("employeeList", employeeList);
		return "ListEmployee";
	}

}
