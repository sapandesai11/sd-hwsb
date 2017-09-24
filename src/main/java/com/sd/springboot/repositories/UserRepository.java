package com.sd.springboot.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.springboot.dto.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	List<User> findAll();
	
	User findByUsername(String userName);

}
