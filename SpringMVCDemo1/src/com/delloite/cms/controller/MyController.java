package com.delloite.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping("/doSome")
	public ModelAndView ssds() {
		ModelAndView view = new ModelAndView();
		view.addObject("message", "Hello, Today is Thursday. We will be staying till 7:30 ");
		view.setViewName("sayHello");
		return view;
	} 
}
