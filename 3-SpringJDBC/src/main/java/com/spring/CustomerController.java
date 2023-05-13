package com.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.DAO.UserDAO;

@Controller
public class CustomerController {
	
	@Autowired
	private UserDAO userDAO;

	@RequestMapping("/hello")
	public String sayHello(@ModelAttribute("userdata") User user)
	{
		return "home";
	}
	
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public ModelAndView checkLogin(@ModelAttribute("userdata") User user)
	{
		userDAO.save(user);
		return new ModelAndView("redirect:/hello");
	}
	
	
	@RequestMapping("/fetchUser")
	public ModelAndView fetchAllUser(ModelAndView model)
	{
		List<User> user=userDAO.fetchusers();
		model.addObject("userdetail",user);
		model.setViewName("welcome");
		return model;
	}
}
