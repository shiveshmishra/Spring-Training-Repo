package com.spring.App;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.Person;



public class CustomerTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Person person = context.getBean("per", Person.class);
		System.out.println(person);
		/*
		 * person.setPersonId(1008); person.setPersonName("ANNA");
		 * System.out.println(person);
		 */

		
		
		/*erson person1 = context.getBean("per", Person.class);
		System.out.println(person1);*/
		
		context.close();

	}

}
