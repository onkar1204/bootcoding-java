package com.bootcoding.discount.controller;

import com.bootcoding.discount.model.CustomerDiscount;
import com.bootcoding.discount.service.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscountController {
    @Autowired
    DiscountService discountService;
    @GetMapping("/customer/discount")
    public List<CustomerDiscount> getAllCustomerDiscount(){
        return discountService.getAllCustomerDiscount();

    }

}
