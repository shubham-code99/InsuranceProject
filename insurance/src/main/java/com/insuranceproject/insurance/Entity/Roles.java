package com.insuranceproject.insurance.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Roles {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int roleid;
    private String role;

    public Roles(){
        super();
    }

    public Roles(int roleid, String role) {
        super();
        this.roleid = roleid;
        this.role = role;
    }

    @OneToMany(cascade = CascadeType.ALL)
    private List<Users> users=new ArrayList<>();

    public int getRoleid() {
        return roleid;
    }

    public void setRoleid(int roleid) {
        this.roleid = roleid;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
    
}
