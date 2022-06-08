package com.insuranceproject.insurance.RequestBodies;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class CustReq {
    //customer
    private @Getter @Setter int cid;
    private @Getter @Setter String cname;
    private @Getter @Setter String address;
    
    //policy
    private @Getter @Setter int amount;
    private @Getter @Setter String renew;
    private @Getter @Setter String type;
    private @Getter @Setter boolean status;


}
