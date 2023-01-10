package com.bootcoding.discount.utils;

import com.bootcoding.discount.model.Customer;

public class DiscountCalculator {
    private static final int MIN_COUNT = 100;
    public static int getDiscount(Customer customer){
        int ordersCount = customer.getOrderCount();
        int visitsCount = customer.getVisitCount();
        int discount = calcDiscount(ordersCount , visitsCount);
        return discount;
    }
    private static int calcDiscount(int orderCount , int visitCount){
        int totalCount = orderCount+visitCount;

        if (totalCount >= 1 && totalCount <=249){
            return 10;
        }
        else if (totalCount >= 250 && totalCount <= 499){
            return 25;
        } else if (totalCount >= 500 && totalCount <= 749 ) {
            return 30;
        } else if (totalCount >= 750) {
            return 50;
        }


        return 0;


    }
}
