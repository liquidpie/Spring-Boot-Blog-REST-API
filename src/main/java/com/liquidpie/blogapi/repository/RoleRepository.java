package com.liquidpie.blogapi.repository;

import com.liquidpie.blogapi.model.role.Role;
import com.liquidpie.blogapi.model.role.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Optional<Role> findByName(RoleName name);
}
