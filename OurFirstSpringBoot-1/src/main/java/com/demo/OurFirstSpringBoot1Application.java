package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OurFirstSpringBoot1Application {


	@RequestMapping("/sayHello")
	public String getMessage()
	{
		return"hello";
	}

	@RequestMapping("/sayBolo")
	public String geMessage()
	{
		return"Bolo";
	}

	@RequestMapping("/sayYolo")
	public String gMessage()
	{
		return"Yolo";
	}

	public static void main(String[] args) {
		SpringApplication.run(OurFirstSpringBoot1Application.class, args);
	}

}
