package com.bootcoding.discount.controller;

import com.bootcoding.discount.model.Customer;
import com.bootcoding.discount.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customer;

    @GetMapping("/Customer")

    public List<Customer> getAllCustomer(){

    return customer.getAllCustomer();



    }

}
