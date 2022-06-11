package com.insuranceproject.insurance.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.insuranceproject.insurance.Config.CustomUserDetails;
import com.insuranceproject.insurance.Entity.Users;
import com.insuranceproject.insurance.Repository.UsersRepository;

public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    private UsersRepository urepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        Users user=urepo.getUserByUsername(username); 
        if(user==null){
            throw new UsernameNotFoundException("User not found");
        }
        CustomUserDetails cus=new CustomUserDetails(user);
        return cus;
    }
    
}
