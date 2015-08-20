package com.bharat.crs.service;

import java.util.List;

import com.bharat.crs.domain.Customer;

public interface CustomerService {
	
	public void saveCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public List<Customer> getAllCustomer();
	public void deleteCustomer(int id);

}
