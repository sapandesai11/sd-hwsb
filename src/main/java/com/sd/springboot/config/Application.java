package com.sd.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sd.springboot")
@EntityScan(basePackages = {"com.sd.springboot.dto"})
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = SpringApplication.run(Application.class, args	);
	}

}
