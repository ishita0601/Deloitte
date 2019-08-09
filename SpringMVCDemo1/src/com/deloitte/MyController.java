package com.deloitte;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
@RequestMapping("/addCustomer")
public String apple() {
	return "ball";
}
}
