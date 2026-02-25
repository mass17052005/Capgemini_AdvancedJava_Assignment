package com.capgemini.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.capgemini.model.Product;

@Repository
public class ProductDao {
	
	public List<Product> getAllProducts(){
		
		List<Product> productList = new ArrayList<>();
		
		Product p1 = new Product(1, "aditya", 2300.0);
		Product p2 = new Product(2,"sunil",23345.0);
		Product p3 = new Product(3,"madhan",24565.0);
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		
		return productList;
		
		
	}
}
