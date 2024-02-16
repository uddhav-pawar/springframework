package com.springframework.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18NService")
@Profile({"MR","default"})
public class I18NMarathiGreetingImpl implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "सगळ्यांना नमस्ते ";
	}

}
