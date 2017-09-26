/**
 * 
 */
package com.sd.springboot.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sd.springboot.dto.Role;
import com.sd.springboot.repositories.RoleRepository;
import com.sd.springboot.services.RoleService;

/**
 * @author sapandesai11
 *
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	RoleRepository roleRepository;

	@Override
	public Role findByRoleName(String roleName) {
		return roleRepository.findByRoleName(roleName);
	}

	@Override
	public Role findById(int id) {
		return roleRepository.findOne(id);
	}

	@Override
	public void save(Role role) {
		roleRepository.save(role);
		
	}

}
