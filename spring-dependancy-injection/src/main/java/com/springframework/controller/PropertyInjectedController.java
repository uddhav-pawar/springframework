package com.springframework.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.springframework.service.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Autowired
	@Qualifier("propertyGreetingServiceImpl")
	public GreetingService greetingService;

	public String getGreeting() {
		return greetingService.sayGreeting();
	}
}
