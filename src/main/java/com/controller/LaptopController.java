package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.LaptopBean;

@Controller
public class LaptopController {

	// singleton design pattern
	@Autowired
	JdbcTemplate stmt;

	@GetMapping("newlaptop")
	public String newLaptop() {

		return "NewLaptop";
	}

	@PostMapping("savelaptop")
	public String saveLaptop(LaptopBean laptopBean) {
		// validation
		// insert
		String insertQ = "insert into laptop (modelName,ram,ssd,price) values (?,?,?,?)";
		stmt.update(insertQ, laptopBean.getModelName(), laptopBean.getRam(), laptopBean.getSsd(),
				laptopBean.getPrice());

		return "Home";
	}

	@GetMapping("listlaptop")
	public String listLaptop(Model model) {
		String selectQ = "select * from laptop";
		List<LaptopBean> laptops = stmt.query(selectQ, new BeanPropertyRowMapper(LaptopBean.class));
		model.addAttribute("laptops", laptops);
		return "ListLaptop";
	}

	@GetMapping("deletelaptop")
	public String deleteLaptop(Integer laptopId) {

		String deleteQ = "delete from laptop where laptopId = ? ";
		stmt.update(deleteQ, laptopId);
		return "redirect:/listlaptop";// url
	}

	@GetMapping("searchlaptop")
	public String searchLaptop() {
		return "SearchLaptop";
	}

	@PostMapping("searchlaptop")
	public String findLaptop(String modelName,Model model) {
		String selectQ = "select * from laptop where modelName like ? ";
		List<LaptopBean> laptops = stmt.query(selectQ, new BeanPropertyRowMapper(LaptopBean.class),"%"+modelName+"%");

		model.addAttribute("laptops", laptops);
		return "ListLaptop";
	}

}
