package com.insuranceproject.insurance.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// import lombok.Data;

@Entity
// @Data
public class Users {

    // @Autowired
    // private BCryptPasswordEncoder passwordEncoder;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userid;
    private String username;
    private String pasword;

    public Users(){
        super();
    }

    public Users(int userid, String username, String pasword) {
        super();
        this.userid = userid;
        this.username = username;
        this.pasword = pasword;
    }

    @ManyToOne
    @JoinColumn(name = "fk_roles")
    private Roles Role_;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getpasword() {
        return pasword;
    }

    public void setpasword(String pasword) {
        // this.pasword = passwordEncoder.encode(pasword) ;
        this.pasword = (pasword) ;
    }

    public Roles getRole_() {
        return Role_;
    }

    public void setRole_(Roles Role_) {
        this.Role_ = Role_;
    }

    
    
}
