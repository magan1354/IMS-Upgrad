package com.ims.actor;

public class Supplier extends SystemUser{

    public Supplier(){
        System.out.println("Supplier Constructed !!");
    }

    public Supplier(String name, Address address) {
        this();
        setName(name);
        setAddress(address);
        System.out.println("Assignments Done");
    }
}