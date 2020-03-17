package com.ims.actor;

public class Address {

    private String buildingNumber;
    private String streetName;
    private String city;
    private int pincode;

    public Address(String buildingNumber, String streetName, String city, int pincode){
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;
    }

    public Address(){

    }
}