package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repo.CustomerRepo;


@Service
public class CustomerService {
	
	@Autowired
	public CustomerRepo customerRepo;
	
	public Customer saveCustomer(Customer customer) {
		return customerRepo.save(customer);
	}
	
	public List<Customer> getAllCustomers(){
		return customerRepo.findAll();
	}

} 
