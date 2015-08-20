package com.bharat.crs.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bharat.crs.dao.CustomerDao;
import com.bharat.crs.domain.Customer;
import com.bharat.crs.util.ConnectionUtil;


@Repository
public class CustomerDaoImpl extends ConnectionUtil implements CustomerDao {

	
	
	
	public void saveCustomer(Customer customer) {
		
		getSession().saveOrUpdate(customer);
		
	}

	public Customer getCustomerById(int id) {
		return (Customer) getSession().get(Customer.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Customer> getAllCustomer() {
		return getSession().createQuery("From Customer").list();
	}

	public void deleteCustomer(Customer customer) {
		getSession().delete(customer);
		
	}

}
