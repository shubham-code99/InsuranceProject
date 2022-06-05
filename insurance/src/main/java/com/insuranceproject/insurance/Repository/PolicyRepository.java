package com.insuranceproject.insurance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insuranceproject.insurance.Entity.Policy;

public interface PolicyRepository extends JpaRepository<Policy,Integer>{
    
}
