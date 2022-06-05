package com.insuranceproject.insurance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insuranceproject.insurance.Entity.Claim;

public interface ClaimRepository extends JpaRepository<Claim,Integer> {
    
}
