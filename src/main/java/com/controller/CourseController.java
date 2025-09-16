package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.CourseBean;

@Controller
public class CourseController {

	@Autowired
	JdbcTemplate stmt;
	
	@GetMapping("newcourse")
	public String newCourse() {
		
		return "NewCourse";
	}
	
	
	@PostMapping("savecourse")
	public String saveCourse(@Validated CourseBean courseBean,BindingResult result,Model model) {
		//read 
		System.out.println(courseBean.getCourseName());
		//validate 
		if(result.hasErrors()) {
			model.addAttribute("result",result);
		}else {
			//db insert 
			String insertQuery = "insert into courses (courseName,description,fees) values (?,?,?)";
			//
			stmt.update(insertQuery,courseBean.getCourseName(),courseBean.getDescription(),courseBean.getFees());
		}
		return "NewCourse";
	}
	
}

