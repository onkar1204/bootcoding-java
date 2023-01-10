package com.bootcoding.discount.service;

import com.bootcoding.discount.model.Customer;
import com.bootcoding.discount.model.CustomerDiscount;
import com.bootcoding.discount.utils.DiscountCalculator;
import com.bootcoding.discount.utils.DiscountValidityGenerator;
import com.bootcoding.discount.utils.NameGenerator;
import com.bootcoding.discount.utils.RandomDateGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DiscountService {
    @Autowired
    private CustomerService customerService;
    private static final int MAX_LIMIT = 100;
    @Autowired
    RandomDateGenerator randomDateGenerator;

    public List<CustomerDiscount> getAllCustomerDiscount(){
        List<CustomerDiscount> customerDiscounts = new ArrayList<>();
        List<Customer> customers = customerService.getAllCustomer();
        for(int i=0; i<customers.size(); i++){
            Customer customer = customers.get(i);
            CustomerDiscount customerDiscount = calculateCustomerDiscount(customer);
            customerDiscounts.add(customerDiscount);
        }
        return customerDiscounts;

    }
    private CustomerDiscount calculateCustomerDiscount(Customer customer){
        CustomerDiscount customerDiscount = new CustomerDiscount();
        customerDiscount.setName(NameGenerator.getName());
        customerDiscount.setValidity(DiscountValidityGenerator.getValidity(RandomDateGenerator.generateDate()
));
        customerDiscount.setDiscount(DiscountCalculator.getDiscount(customer));

        return customerDiscount;
    }
}
