package com.bharat.crs.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bharat.crs.dao.CustomerDao;
import com.bharat.crs.domain.Customer;
import com.bharat.crs.service.CustomerService;




@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	

	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
		
		
	}

	public Customer getCustomerById(int id) {
		return customerDao.getCustomerById(id);
	}

	public List<Customer> getAllCustomer() {
		return customerDao.getAllCustomer();
	}

	public void deleteCustomer(int id) {
		Customer customer = getCustomerById(id);
		if(customer != null)
		customerDao.deleteCustomer(customer);
		
	}

}
