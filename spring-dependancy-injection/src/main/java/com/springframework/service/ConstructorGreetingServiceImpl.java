package com.springframework.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Jay Shree Ram..!--from Constructor Injected";
	}

}
