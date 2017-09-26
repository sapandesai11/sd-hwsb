/**
 * 
 */
package com.sd.springboot.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sd.springboot.dto.Role;

/**
 * @author sapandesai11
 *
 */
@Repository("roleRepository")
public interface RoleRepository extends CrudRepository<Role, Integer>{ 
	
	@Query("SELECT r FROM Role r WHERE LOWER(r.roleName) = LOWER(:roleName)")
	Role findByRoleName(String roleName);

}
