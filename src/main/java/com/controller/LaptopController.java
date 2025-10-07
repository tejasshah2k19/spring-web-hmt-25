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
import com.dao.LaptopDao;

@Controller
public class LaptopController {


	// singleton design pattern
	@Autowired
	JdbcTemplate stmt;

	@Autowired
	LaptopDao laptopDao; 
	
	
	@GetMapping("newlaptop")
	public String newLaptop() {

		return "NewLaptop";
	}

	@PostMapping("savelaptop")
	public String saveLaptop(LaptopBean laptopBean) {
		// validation
		// insert
		laptopDao.addLaptop(laptopBean); 
		return "Home";
	}

	@GetMapping("listlaptop")
	public String listLaptop(Model model) {
		List<LaptopBean> laptops  =  laptopDao.getAllLaptop(); 
		model.addAttribute("laptops", laptops);
		return "ListLaptop";
	}

	@GetMapping("deletelaptop")
	public String deleteLaptop(Integer laptopId) {
		laptopDao.removeLaptop(laptopId);
		return "redirect:/listlaptop";// url
	}

	@GetMapping("searchlaptop")
	public String searchLaptop() {
		return "SearchLaptop";
	}

	@PostMapping("searchlaptop")
	public String findLaptop(String modelName, Model model) {
		String selectQ = "select * from laptop where modelName like ? ";
		List<LaptopBean> laptops = stmt.query(selectQ, new BeanPropertyRowMapper<>(LaptopBean.class),
				"%" + modelName + "%");

		model.addAttribute("laptops", laptops);
		return "ListLaptop";
	}

	@GetMapping("viewlaptop")
	public String viewLaptop(Integer laptopId, Model model) {
		LaptopBean x = stmt.queryForObject("select * from laptop where laptopId = ?",
				new BeanPropertyRowMapper<>(LaptopBean.class), laptopId);
		model.addAttribute("x", x);
		return "ViewLaptop";
	}

	@GetMapping("editlaptop")
	public String editLaptop(Integer laptopId, Model model) {
		LaptopBean x = stmt.queryForObject("select * from laptop where laptopId = ?",
				new BeanPropertyRowMapper<>(LaptopBean.class), laptopId);
		model.addAttribute("x", x);
		return "EditLaptop";
	}

	@PostMapping("updatelaptop")
	public String updateLaptop(LaptopBean laptopBean) {
		// validation
		// insert
		stmt.update("update laptop set modelName = ? , price = ? , ram = ? , ssd = ? where laptopId = ? ",
				laptopBean.getModelName(), laptopBean.getPrice(), laptopBean.getRam(), laptopBean.getSsd(),
				laptopBean.getLaptopId());

		return "redirect:/listlaptop";
	}

}
