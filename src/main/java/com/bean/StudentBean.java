package com.bean;

import jakarta.validation.constraints.NotBlank;

public class StudentBean {

	//table 
	private Integer studentId;
	
	@NotBlank(message = "Please Enter FirstName")
	private String firstName;
	
	@NotBlank(message = "Please Enter LastName")
	private String lastName;
	
	@NotBlank(message = "Please Enter Email")
	private String email;
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	//getters and setters 
	
	
	
}
