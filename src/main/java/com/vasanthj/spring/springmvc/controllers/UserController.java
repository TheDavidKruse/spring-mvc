package com.vasanthj.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.vasanthj.spring.springmvc.dto.User;

@Controller
public class UserController {
	
	@RequestMapping("registrationPage")
	public ModelAndView showRegPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userRegistration");
		return mv;
	}
	
	@RequestMapping(value="registerUser", method=RequestMethod.POST) 
	public ModelAndView registerUser(@ModelAttribute User user) {
		System.out.println(user);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userRegistration");
		return mv;
	}

}
