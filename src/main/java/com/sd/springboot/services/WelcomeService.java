package com.sd.springboot.services;

import org.springframework.stereotype.Service;

//@Component and @Service can be used interchangebly  
@Service
public class WelcomeService {

	public String getWelcomeMessage() {
		
		return "Good Evening...!!";
	}
}
