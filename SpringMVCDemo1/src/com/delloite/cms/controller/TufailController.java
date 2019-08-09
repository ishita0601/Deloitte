package com.delloite.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TufailController {

	@RequestMapping("/kapoor")
	public String gg() {
		return "neha";
	}
	
	
}
