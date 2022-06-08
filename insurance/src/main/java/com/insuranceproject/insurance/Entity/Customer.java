package com.insuranceproject.insurance.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
// import javax.persistence.JoinColumn;
// import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Table(name= "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int cid;
    private @Getter @Setter String cname;
    private @Getter @Setter String address;
    // private @Getter @Setter String status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer") //for bidirectional
    // @OneToMany(cascade = CascadeType.ALL)
    // @JoinColumn(referencedColumnName = "cid")
    private @Getter @Setter List<Policy> policy=new ArrayList<Policy>();

    public Customer(String cname, String address) {
        this.cname = cname;
        this.address=address;
    }

}
