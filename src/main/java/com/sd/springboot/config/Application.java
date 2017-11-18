package com.sd.springboot.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.sd.springboot"})
@EnableJpaRepositories(basePackages = "com.sd.springboot.repositories")
@EntityScan(basePackages = {"com.sd.springboot.dto"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args	);
	}

}
