package com.insuranceproject.insurance.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.insuranceproject.insurance.Services.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class MyConfig extends WebSecurityConfigurerAdapter {
    
    @Bean
    public UserDetailsService getUserDetailService(){
        return new UserDetailsServiceImpl();
    } 

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    public DaoAuthenticationProvider authprovider(){
        DaoAuthenticationProvider dap=new DaoAuthenticationProvider();
        dap.setUserDetailsService(this.getUserDetailService());
        dap.setPasswordEncoder(passwordEncoder());
        return dap;
    }

    

    //config method
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        // super();
        auth.authenticationProvider(authprovider());
    }
    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/h2-console/**");
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().antMatchers("/addCustomer/**").hasRole("ADMIN")
        .antMatchers("/admin/**").hasRole("ADMIN")
        .antMatchers("/**","/h2-console/**").permitAll().and().formLogin().and().csrf().disable();
    }
}
