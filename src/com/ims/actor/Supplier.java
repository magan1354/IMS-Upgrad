package com.ims.actor;

public class Supplier {

    int id;
    String name;
    Address address;

    public Supplier(){
        System.out.println("Supplier Constructed !!");
    }

    public Supplier(String name, Address address) {
        this();
        this.name = name;
        this.address = address;
        System.out.println("Assignments Done");
    }
}