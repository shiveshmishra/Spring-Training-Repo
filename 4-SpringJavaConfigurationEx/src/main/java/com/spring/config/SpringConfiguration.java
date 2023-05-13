package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.Person;

@Configuration
@ComponentScan(basePackages = "com.spring")
@PropertySource("classpath:appilication.properties")

public class SpringConfiguration {
	
	
	/*
	 * @Bean(name="per") public Person personObject() { Person p= new Person();
	 * //p.setPersonId(1000); //p.setPersonName("Mona"); return p; }
	 */

}
