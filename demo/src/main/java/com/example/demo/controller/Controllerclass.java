package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;






@Controller
public class Controllerclass {
	
	
	
	@RequestMapping("/welcome")
	public ModelAndView displaywelcomemez() {
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "welcome to controller");
		mav.setViewName("index");
		return mav;
		




	}

}
