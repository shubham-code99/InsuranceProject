package com.insuranceproject.insurance.Entity;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private @Getter @Setter int cid;
    private @Getter @Setter String cname;
    private @Getter @Setter String email;
    private @Getter @Setter String status;

    @OneToMany(cascade = CascadeType.ALL)
    private @Getter @Setter ArrayList<Policy> policy=new ArrayList<>();

}
