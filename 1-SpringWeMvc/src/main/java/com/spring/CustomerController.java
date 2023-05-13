package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {

	@RequestMapping("/hello")
	//@ResponseBody
	public String sayHello()
	{
		return "home";
	}
	
	
	@RequestMapping("/login")
	public String checkLogin(@RequestParam("username") String uname,
			@RequestParam("address")String add,
			@RequestParam("email") String email,Model model)
	
	{
		model.addAttribute("name",uname);
		model.addAttribute("address",add);
		model.addAttribute("emailId",email);
		return "welcome";
	}
}
