package com.insuranceproject.insurance.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.insuranceproject.insurance.Entity.Role;
 
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
