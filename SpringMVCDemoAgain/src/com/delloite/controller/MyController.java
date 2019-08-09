package com.delloite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/vikram")
	public String mm() {
		return "iam";
	}
	@RequestMapping("/")
	public String pp() {
		return "index";
	}
}
