package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.FoodItemBean;
import com.dao.FoodItemDao;

@Controller
public class FoodItemController {

	@Autowired
	FoodItemDao foodItemDao;
	
	@GetMapping("newfood")
	public String newFood() {
		
		return "NewFood"; 
	}
	
	@PostMapping("savefood")
	public String saveFood(FoodItemBean foodItemBean) {
		//read 
		//validation 
		//db insert 
		foodItemDao.addFood(foodItemBean);
		return "redirect:/listfood";
	}
	
	@GetMapping("listfood")
	public String listFood(Model model) {
		List<FoodItemBean> items = foodItemDao.getAllFood();
		model.addAttribute("items",items);
		return "ListFood";
	}

	@GetMapping("editfood")
	public String editFood(Integer foodItemId,Model model) {
		
		 FoodItemBean item =  foodItemDao.getFoodById(foodItemId);
		 model.addAttribute("item",item);
		
		return "EditFood";
	}
	
	
	
	
}
