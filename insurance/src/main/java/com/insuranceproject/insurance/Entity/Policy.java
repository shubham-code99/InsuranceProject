package com.insuranceproject.insurance.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
// @AllArgsConstructor
@Table(name = "Policy")
public class Policy {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int pid;
    private @Getter @Setter String vname;
    private @Getter @Setter String Regnumber;
    private @Getter @Setter String sdate;
    private @Getter @Setter String edate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="cid")
    private @Getter @Setter Customer customer;

    public Policy(String vname, String regnumber, String sdate, String edate) {
        this.vname = vname;
        Regnumber = regnumber;
        this.sdate = sdate;
        this.edate = edate;
    }

    

}
