package com.capgemini.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.dao.ProductDao;
import com.capgemini.model.Product;

@Service
public class ProductService {
	
	private final ProductDao productDao;
	
	
	public ProductService(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public List<Product> fetchProducts(){
		return productDao.getAllProducts();
	}

}
