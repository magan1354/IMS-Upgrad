package com.ims.actor;

public class Supplier extends SystemUser{

    public Supplier(){
        super(null, null);
        System.out.println("Supplier Constructed !!");
    }

    public Supplier(String name, Address address) {
        super(name, address);
        System.out.println("Assignments Done");
    }
}