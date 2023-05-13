package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@RequestMapping("/hello")
	public String sayHello(@ModelAttribute("userdata") User user)
	{
		return "home";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView checkLogin(@ModelAttribute("userdata") User user)
	{
		ModelAndView model=new ModelAndView();
		model.addObject("userInfo",user);
		model.setViewName("welcome");
		return model;
	}
}
