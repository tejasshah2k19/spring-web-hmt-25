package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.StudentBean;
import com.dao.StudentDao;

@Controller
public class StudentController {

	@Autowired
	StudentDao studentDao;
	
	@GetMapping("newstudent")
	public String newStudent() {
		return "NewStudent";
	}

	@PostMapping("savestudent")
	public String saveStudent(@Validated StudentBean studentBean,BindingResult result) {
		//read form data -> 
		
		//validation 
		if(result.hasErrors()) {
			return "NewStudent";
		}else {
			//db insert 
			studentDao.addStudent(studentBean);
			
			//list page
			return "NewStudent";
		}
		
		
	}
}
