package com.lifepill.customerauthentication.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lifepill.customerauthentication.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(String roleName);
}
