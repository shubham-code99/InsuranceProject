package com.insuranceproject.insurance.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Policy {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private @Getter @Setter int pid;
    private @Getter @Setter String vname;
    private @Getter @Setter String Regnumber;
    private @Getter @Setter String sdate;
    private @Getter @Setter String edate;

    @ManyToOne
    @JoinColumn(name="cid")
    @Getter @Setter Customer customer;
}
