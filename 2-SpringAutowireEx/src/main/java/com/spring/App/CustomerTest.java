package com.spring.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Customer;
import com.spring.Person;

public class CustomerTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");	
		Customer customer=context.getBean("cust1",Customer.class);
		System.out.println(customer);
		
		context.close();
	
	}

}
