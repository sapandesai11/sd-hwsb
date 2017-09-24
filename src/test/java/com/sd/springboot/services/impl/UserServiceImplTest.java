package com.sd.springboot.services.impl;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.sd.springboot.config.Application;
import com.sd.springboot.services.UserService;



@SpringBootTest(classes={Application.class})
@RunWith(SpringRunner.class)
@TestPropertySource(locations= "classpath:application-test.properties")
public class UserServiceImplTest {
	
	
	@Autowired
	UserService userService;
	
	@Before
	public void setup() {}
	
	@Test
	public void testFindAllUsers() {
		assertThat(userService.findByUsername("admin").getUsername().equalsIgnoreCase("admin1"));
	}
	

}
