package com.spring;

public class Person {

	private int personId;
	private String personName;

	public Person() {
		System.out.println("Person class Object Created");
	}

	public Person(int custId, String custName) {
		this.personId = custId;
		this.personName = custName;
	}

	public int getCustId() {
		return personId;
	}

	public void setCustId(int custId) {
		this.personId = custId;
	}

	public String getCustName() {
		return personName;
	}

	public void setCustName(String custName) {
		this.personName = custName;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + personId + ", custName=" + personName + "]";
	}

}
