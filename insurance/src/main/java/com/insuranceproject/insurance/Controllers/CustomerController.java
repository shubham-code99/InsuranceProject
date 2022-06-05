package com.insuranceproject.insurance.Controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.insuranceproject.insurance.Entity.Claim;
import com.insuranceproject.insurance.Entity.Customer;
import com.insuranceproject.insurance.Entity.Policy;
import com.insuranceproject.insurance.RequestBodies.CustReq;

@RestController
public class CustomerController {
    @Autowired Customer crepo;
    @Autowired Policy prepo;
    @Autowired Claim clrepo;
    
    @PostMapping("/addCustomer")
    public ResponseEntity<Customer> addCust(@RequestBody CustReq creq){
        Policy p=new Policy();
        Claim c=new Claim();
        Customer cus=new Customer();

        p.setRegnumber(creq.getRegnumber());
        p.setVname(creq.getVname());

        c.setBillamount(creq.getBillamount());

        cus.setCname(creq.getCname());
        cus.setEmail(creq.getEmail());
        cus.setStatus(creq.getStatus());
        cus.setPolicy(((new ArrayList<>()).add(p)));



    }

    // public ResponseEntity<Employee> addempdept(@RequestBody EmpRequest ereq){
    //     Department dept=new Department();
    //     dept.setDname(ereq.getDeptname());
    //     // dept=drepo.save(dept);
    //     Employee e=new Employee();
    //     e.setEmpname(ereq.getEmpname());
    //     e.setDep(dept);
    //     e=erepo.save(e);

    //     return new ResponseEntity<Employee>(e, HttpStatus.CREATED);
    // }
}
