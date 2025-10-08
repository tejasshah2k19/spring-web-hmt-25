package com.controller;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.EmployeeBean;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.dao.EmployeeDao;

@Controller
public class EmployeeController {

	@Autowired // will create object ? singleton
	EmployeeDao employeeDao;

	@Autowired
	Cloudinary cloudinary;

	@GetMapping("newemployee")
	public String newEmployee() {
		return "NewEmployee";
	}

	@PostMapping("saveemployee")
	public String saveEmp(EmployeeBean employeeBean) {

		System.out.println(employeeBean.getFirstName());
		System.out.println(employeeBean.getProfilePic());
		System.out.println(employeeBean.getProfilePic().getOriginalFilename());

		// upload file to cloudinary

		try {
		Map result = 	cloudinary.uploader().upload(employeeBean.getProfilePic().getBytes(),
					ObjectUtils.asMap("resource_type", "auto"));
		 
		String profilePicUrl = result.get("secure_url").toString();
		
		System.out.println(profilePicUrl);
		
		employeeBean.setProfilePicURL(profilePicUrl);
		employeeDao.addEmployee(employeeBean);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "Success";
	}

}
