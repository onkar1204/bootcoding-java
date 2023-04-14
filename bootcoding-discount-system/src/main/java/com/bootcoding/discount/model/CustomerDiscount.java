package com.bootcoding.discount.model;

import java.util.Date;



public class CustomerDiscount {
    private String Name;
    private int Discount;
    private Date validity;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }




}
