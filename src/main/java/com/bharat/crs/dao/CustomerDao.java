package com.bharat.crs.dao;

import java.util.List;

import com.bharat.crs.domain.Customer;

public interface CustomerDao {
	
	public void saveCustomer(Customer customer);
	public Customer getCustomerById(int id);
	public List<Customer>getAllCustomer();
	public void deleteCustomer(Customer customer);

}
