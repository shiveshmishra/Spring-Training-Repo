package com.spring.service;

import java.util.List;

import com.spring.model.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	public List<Customer> findAllCustomer();
	
}
