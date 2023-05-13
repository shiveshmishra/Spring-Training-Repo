package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("person")

public class Person //implements InitializingBean,DisposableBean
{

	@Value("${person.personId}")
	private int personId;
	
	@Value("${person.personName}")
	private String personName;

	public Person() {
		System.out.println("Person class Object Created");
	}

	public Person(int custId, String custName) {
		this.personId = custId;
		this.personName = custName;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + "]";
	}

	
	  public void myInitializeMethod() {
	  System.out.println("This is the initialization Method"); }
	  
	  public void myDestroyMethod() {
	  System.out.println("This is the Destroy Method"); }
	 

	/*
	 * public void destroy() throws Exception { // TODO Auto-generated method stub
	 * System.out.println("This is the Destroy Method"); }
	 * 
	 * public void afterPropertiesSet() throws Exception { // TODO Auto-generated
	 * method stub
	 * System.out.println("This is the after properties gets injected Method"); }
	 */

}
