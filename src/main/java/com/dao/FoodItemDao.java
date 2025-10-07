package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.FoodItemBean;

@Repository
public class FoodItemDao {

	@Autowired
	JdbcTemplate stmt;

	public void addFood(FoodItemBean foodItemBean) {
		String insertQ = "insert into food_item (name,price,qty) values (?,?,?)";
		stmt.update(insertQ, foodItemBean.getName(), foodItemBean.getPrice(), foodItemBean.getQty());
	}

	public List<FoodItemBean> getAllFood() {
		List<FoodItemBean> items = stmt.query("select * from food_item",
				new BeanPropertyRowMapper<>(FoodItemBean.class));
		return items;
	}

	public FoodItemBean getFoodById(Integer foodItemId) {
		String selectQ = "select * from food_item where foodItemId = ? ";
		FoodItemBean item =  stmt.queryForObject(selectQ, new BeanPropertyRowMapper<>(FoodItemBean.class), new Object[] { foodItemId });
		return item ;
	}

}
