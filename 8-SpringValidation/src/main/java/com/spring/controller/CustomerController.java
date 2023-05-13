package com.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.Customer;


@Controller
public class CustomerController {

	@RequestMapping("/hello")
	public String sayHello(@ModelAttribute("userdata") Customer customer)
	{
		return "home";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String  checkLogin(@Valid @ModelAttribute("userdata") Customer customer,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "home";
		}
		return "welcome";
	}
}
