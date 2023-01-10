package com.bootcoding.discount;

import org.springframework.stereotype.Component;

@Component
public class Marker {

    public String Colour;

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String Brand;
    public int Price;

}
