package com.spring.configuration;

import java.util.regex.Pattern;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.spring.model.Customer;

@Component
@PropertySource(value="classpath:application.properties")
public class CustomValidator implements Validator  {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Customer.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmpty(errors, "custId", "customer.custId.empty");
		ValidationUtils.rejectIfEmpty(errors, "custName", "customer.custName.empty");
		ValidationUtils.rejectIfEmpty(errors, "custAddress", "customer.custAddress.empty");
		ValidationUtils.rejectIfEmpty(errors, "password", "customer.password.empty");
		
		Customer customer=(Customer)target;
		
		Pattern pattern= Pattern.compile("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$");
		if(!pattern.matcher(customer.getPassword()).matches())
		{
			errors.rejectValue("password", "customer.password.regx");
		}
	}

	
}
