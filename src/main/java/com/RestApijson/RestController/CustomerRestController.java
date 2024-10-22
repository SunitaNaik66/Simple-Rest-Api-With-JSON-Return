package com.RestApijson.RestController;

import com.RestApijson.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerRestController {

@GetMapping("/customer")
    public ResponseEntity<Customer> getCustomer(){
        Customer customer=new Customer(1,"Sunita","sunita@gmail.com");
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping("/customers")
    public ResponseEntity<List<Customer> >
    getListOfCustomers(){
        Customer customer=new Customer(1,"Sunita","sunita@gmail.com");
        Customer customer1=new Customer(2,"mini","mini@gmail.com");
        Customer customer2=new Customer(3,"sanya","sanya@gmail.com");
        List<Customer> customerList=Arrays.asList(customer1,customer2,customer2);
        return new ResponseEntity<>(customerList,HttpStatus.OK);


    }
}
