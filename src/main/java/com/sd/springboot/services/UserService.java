package com.sd.springboot.services;

import java.util.List;



import com.sd.springboot.dto.User;

public interface UserService {
	
	List<User> findAll();
	
	User findByUsername(String username);

}
