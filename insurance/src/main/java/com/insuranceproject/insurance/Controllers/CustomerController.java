package com.insuranceproject.insurance.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// import com.insuranceproject.insurance.Entity.Claim;
import com.insuranceproject.insurance.Entity.Customer;
import com.insuranceproject.insurance.Entity.Policy;
import com.insuranceproject.insurance.Repository.CustomerRepository;
import com.insuranceproject.insurance.Repository.PolicyRepository;
import com.insuranceproject.insurance.RequestBodies.CustReq;

@RestController
public class CustomerController {
    @Autowired CustomerRepository crepo;
    @Autowired PolicyRepository prepo;
    // @Autowired Claim clrepo;
    
    @PostMapping("/addCustomer")
    public ResponseEntity<Customer> addCust(@RequestBody CustReq creq){
        if(creq.getCid()==0){

            Policy p=new Policy();
            // Claim c=new Claim();
            Customer cus=new Customer();
    
            p.setRegnumber(creq.getRegnumber());
            p.setVname(creq.getVname());
    
            // c.setBillamount(creq.getBillamount());
    
            cus.setCname(creq.getCname());
            cus.setEmail(creq.getEmail());
            cus.setStatus(creq.getStatus());
            ArrayList<Policy> arr=new ArrayList<>();
            arr.add(p);
            cus.setPolicy(arr);
            cus=crepo.save(cus);
            // p.setCustomer(cus);
            p=prepo.save(p);
            return new ResponseEntity<Customer>(cus, HttpStatus.CREATED);
        }
        else{
            Optional<Customer> cust=crepo.findById(creq.getCid());
            Policy p=new Policy();
            p.setRegnumber(creq.getRegnumber());
            p.setVname(creq.getVname());
            
            ArrayList<Policy> arr=new ArrayList<>();
            arr.add(p);
            Customer cs=new Customer();
            cs=cust.get();
            cs.getPolicy().add(p);
            cs=crepo.save(cs);
            // p=prepo.save(p);
            return new ResponseEntity<Customer>(cs, HttpStatus.CREATED);
        }
    }

    
}
