package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.ProductBean;

@Controller
public class ProductController {

	@GetMapping("newproduct")
	public String newProduct() {
		return "NewProduct";
	}
	
//	@PostMapping("saveproduct")
//	public String saveProduct() {
//	//form -> input -> read? 
//		//
//		System.out.println(productName);
//		
//		return "Success";
//	}
	
	@PostMapping("saveproduct")
	public String saveProduct(ProductBean product) {
	//form -> input -> read? 
		//
		System.out.println(product.getProductName());
		System.out.println(product.getPrice());
		
		
		return "Success";
	}

}
