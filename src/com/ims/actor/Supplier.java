package com.ims.actor;

class Supplier {

    int id;
    String name;
    String buildingNumber;
    String streetName;
    String city;
    int pincode;

    Supplier(){
        System.out.println("Supplier Constructed !!");
    }

    Supplier(String name, String buildingNumber, String streetName, String city, int pincode) {
        this();
        this.name = name;
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;
        System.out.println("Assignments Done");
    }
}