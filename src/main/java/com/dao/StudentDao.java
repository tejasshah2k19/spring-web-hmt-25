package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.StudentBean;

@Repository
public class StudentDao {

	@Autowired
	JdbcTemplate stmt;

	// insert
	public void addStudent(StudentBean studentBean) {

		stmt.update("insert into students (lastName,email,firstName) values (?,?,?)", studentBean.getLastName(),
				studentBean.getEmail(), studentBean.getFirstName());
	}

	// argument -> incoming -> db

	// return -> outgoing -> db

}
