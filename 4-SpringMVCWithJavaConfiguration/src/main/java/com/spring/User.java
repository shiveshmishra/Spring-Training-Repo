package com.spring;

public class User {
 private String username;
 private String address;
 private String email;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "User [username=" + username + ", address=" + address + ", email=" + email + "]";
}
 
}
