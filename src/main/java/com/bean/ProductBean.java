package com.bean;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProductBean {


	@NotBlank(message = "Please Enter Product Name")
	private String productName;
	@NotNull(message = "Please Enter Price")
	@Min(value = 99,message = "Price should be 99+")
	@Max(value = 100000,message = "Max allowed Price is 100000")
	private Integer price;
	private Integer qty;
	
	@NotBlank(message = "Please Enter Category")
	private String category;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

}
