package com.bharat.crs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.bharat.crs.domain.Customer;
import com.bharat.crs.service.CustomerService;

@Controller
@SessionAttributes("customer")
public class CustomerController {
	
	
	@Autowired
	CustomerService customerService;
	
	
	@RequestMapping(value="/customer/add")
	public String addCustomer(Model model){
		model.addAttribute("customer", new Customer());
		return "customer/addcustomer";
	}
	
	@RequestMapping(value="/customer/save", method=RequestMethod.POST)
	public String saveCustomer(@ModelAttribute Customer customer){
		customerService.saveCustomer(customer);
		return "redirect:/customer";
	}
	
	@RequestMapping(value="/customer")
	public String listOfCustomer(Model model) {
		
		model.addAttribute("customers", customerService.getAllCustomer());
		return "customer/listcustomer";

	}

}
