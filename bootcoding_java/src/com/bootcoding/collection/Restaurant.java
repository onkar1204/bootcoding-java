package com.bootcoding.collection;

import java.util.Objects;

public class Restaurant {
    private String name;
    private String address;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;

        System.out.println("Invoke Restaurant Equals() method");

        return Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        System.out.println("Invoke Restaurant Hashcode() method");
        return Objects.hash(name, address, type);
    }

    public Restaurant(String name, String address, String type){
        this.name = name;
        this.address = address;
        this.type = type;


    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
