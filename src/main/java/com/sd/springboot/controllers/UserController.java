/**
 * 
 */
package com.sd.springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sd.springboot.dto.Response;
import com.sd.springboot.dto.User;
import com.sd.springboot.services.UserService;
import com.sd.springboot.utils.Constants;

/**
 * @author sapandesai11
 *
 */

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired 
	UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public Response getAllUsers() {
		Response response = new Response();
		List<User> userList = new ArrayList<User>();
		response.setStatus(Constants.SUCCESS_STATUS);
		userList = userService.findAll();
		response.setData(userList);
		return response;
		
	}
}
