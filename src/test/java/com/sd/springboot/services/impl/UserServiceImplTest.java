package com.sd.springboot.services.impl;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sd.springboot.config.Application;
import com.sd.springboot.dto.Role;
import com.sd.springboot.dto.User;
import com.sd.springboot.services.UserService;



@SpringBootTest(classes={Application.class})
@RunWith(SpringRunner.class)
public class UserServiceImplTest {
	
	
	@Autowired
	UserService userService;
	
	private User user;
	
	@Before
	public void init() {
		Role role= new Role();
		role.setRoleId(1);
		role.setRoleName("ADMIN");
		user = new User();
		user.setUsername("Sapan");
		user.setPassword("admin");
		user.setRoleid(role);
	}
	
	@Test
	public void testSaveUser() {
		userService.save(user);
	}
	
	//@Test
	public void testFindAllUsers() {
		assertThat(userService.findByUsername("admin").getUsername().equalsIgnoreCase("admin"));
	}
	

}
