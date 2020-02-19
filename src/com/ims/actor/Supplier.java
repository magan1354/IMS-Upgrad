package com.ims.actor;

class Supplier {

    int id;
    String name;
    Address address;

    Supplier(){
        System.out.println("Supplier Constructed !!");
    }

    Supplier(String name, Address address) {
        this();
        this.name = name;
        this.address = address;
        System.out.println("Assignments Done");
    }
}