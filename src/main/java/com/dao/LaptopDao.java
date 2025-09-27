package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.LaptopBean;

@Repository
public class LaptopDao {

	// singleton design pattern
	@Autowired
	JdbcTemplate stmt;

	// add laptop : insert
	public void addLaptop(LaptopBean laptopBean) {
		String insertQ = "insert into laptop (modelName,ram,ssd,price) values (?,?,?,?)";
		stmt.update(insertQ, laptopBean.getModelName(), laptopBean.getRam(), laptopBean.getSsd(),
				laptopBean.getPrice());
	}

	// get all laptop : select
	public void getAllLaptop() {

	}

	// remove laptop : delete
	public void removeLaptop() {

	}
}
