package com.bootcoding.discount.model;

import org.springframework.stereotype.Component;
@Component
public class Customer {


    public String name;
    public String city;
    private int VisitCount;
    private int OrderCount;

    public int getVisitCount() {
        return VisitCount;
    }

    public void setVisitCount(int visitCount) {
        VisitCount = visitCount;
    }

    public int getOrderCount() {
        return OrderCount;
    }

    public void setOrderCount(int orderCount) {
        OrderCount = orderCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
