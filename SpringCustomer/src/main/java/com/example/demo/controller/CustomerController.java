package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	public CustomerService customerService;
	
	
	@GetMapping("/customer")
	public String getCustomers(Model model) {
		List<Customer> customer= customerService.getAllCustomers();
		model.addAttribute("customer",customer);
		return "customerList";
	}
	
	@GetMapping("/addcustomers")
	public String getAddCustomers(Model model) {
		model.addAttribute("customer",new Customer());
		return "addCustomer";
	}
	
	@PostMapping("/saveCustomers")
	public String saveCustomer(Customer customer) {
		customerService.saveCustomer(customer);
		return "redirect:/customer";
	}

}
