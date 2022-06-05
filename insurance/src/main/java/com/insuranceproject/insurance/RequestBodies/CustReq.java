package com.insuranceproject.insurance.RequestBodies;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class CustReq {
    
    private @Getter @Setter String cname;
    private @Getter @Setter String email;
    private @Getter @Setter String status;

    private @Getter @Setter String vname;
    private @Getter @Setter String Regnumber;
    // private @Getter @Setter String sdate;
    // private @Getter @Setter String edate;

    private @Getter @Setter int billamount;
}
