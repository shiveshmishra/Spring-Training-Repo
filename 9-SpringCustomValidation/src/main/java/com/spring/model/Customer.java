package com.spring.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Customer {

private int custId;
private String custName;
private String custAddress;
private String password;


public Customer(int custId, String custName, String custAddress, String password) {
	super();
	this.custId = custId;
	this.custName = custName;
	this.custAddress = custAddress;
	this.password = password;
}
public Customer() {
	super();
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
public String getCustAddress() {
	return custAddress;
}
public void setCustAddress(String custAddress) {
	this.custAddress = custAddress;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", password="
			+ password + "]";
}


}
