/**
 * 
 */
package com.sd.springboot.services;

import com.sd.springboot.dto.Role;

/**
 * @author sapandesai11
 *
 */
public interface RoleService {
	
	Role findByRoleName(String roleName);
	
	Role findById(int id);
	
	void save(Role role);

}
