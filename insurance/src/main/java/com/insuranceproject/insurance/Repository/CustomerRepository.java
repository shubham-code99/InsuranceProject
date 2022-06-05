package com.insuranceproject.insurance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insuranceproject.insurance.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
