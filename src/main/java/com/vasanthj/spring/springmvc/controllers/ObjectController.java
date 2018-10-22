package com.vasanthj.spring.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vasanthj.spring.springmvc.dto.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/readObject")
	public ModelAndView sendObject() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(20);
		employee.setName("Vasanth Jayabalan");
		employee.setSalary(2000);
		mv.addObject("employee", employee);
		return mv;
	}

}
