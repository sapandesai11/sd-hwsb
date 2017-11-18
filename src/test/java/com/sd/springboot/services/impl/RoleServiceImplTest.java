package com.sd.springboot.services.impl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.sd.springboot.config.Application;
import com.sd.springboot.dto.Role;
import com.sd.springboot.services.RoleService;

@SpringBootTest(classes={Application.class})
@RunWith(SpringRunner.class)
@TestPropertySource(locations= "classpath:application-test.properties")
public class RoleServiceImplTest {
	
	@Autowired
	RoleService roleService;
	private Role role;
	@Before
	public void init() {
		role = new Role();
		role.setRoleName("ADMIN");
	}
	
	@Test
	public void testRoleSaveService() {
		roleService.save(role);
	}

}
