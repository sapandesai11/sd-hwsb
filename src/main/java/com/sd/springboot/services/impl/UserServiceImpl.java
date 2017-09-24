package com.sd.springboot.services.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sd.springboot.dto.User;
import com.sd.springboot.repositories.UserRepository;
import com.sd.springboot.services.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	@Override
	public User findByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}

}
