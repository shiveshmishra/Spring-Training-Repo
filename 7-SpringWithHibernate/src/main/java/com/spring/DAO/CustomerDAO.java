package com.spring.DAO;

import java.util.List;

import com.spring.model.Customer;


public interface CustomerDAO {
	public void save(Customer customer);
	public List<Customer> fetchAllCustomer();
	public void update(Customer customer);
}
