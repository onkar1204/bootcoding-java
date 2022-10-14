package com.bootcoding.oops.incapsulation;

public class Marker2 {
    long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    String company;
    String type;
    String colour;
    double price;
    public Marker2(){

    }
    public Marker2(String cmp, String clr, String t, double p){
        company = cmp;
        colour = clr;
        type = t;
        price = p;
    }

     public void setCompany(String company){
        this.company=company;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getCompany(){
        return company;
    }
    public String getType(){
        return type;
    }
    public String getColour(){
        return colour;
    }
    public double getPrice(){
        return price;
    }















}