package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.dependent.CustomerService;

public class Customer {

	// Permitive Dependency
	private int custId;
	private String custName;
	
	
	// Object Dependency
	@Autowired
	@Qualifier("customerService2")
	CustomerService customerService;
	
	
	//COllection Injection
	List<Address>	 add;

	public Customer() {
		System.out.println("Customer Object Created");
	}

	
	

	public List<Address> getAdd() {
		return add;
	}




	public void setAdd(List<Address> add) {
		this.add = add;
	}




	public Customer(int custId, String custName, CustomerService customerService ) {
		this.custId = custId;
		this.custName = custName;
		this.customerService = customerService;
	}

	public CustomerService getCustomerService() {
		return customerService;
	}
	
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}




	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", customerService=" + customerService
				+ ", add=" + add + "]";
	}

	


}
