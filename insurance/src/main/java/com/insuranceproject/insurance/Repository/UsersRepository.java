package com.insuranceproject.insurance.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

import com.insuranceproject.insurance.Entity.Users;

public interface UsersRepository extends JpaRepository<Users,Integer>{
    
    // @Query("select u from users u where u.username = :username")
    // public Users getUserBy (@Param("username") String username);

    public Users findByusername(String username);
}
