package com.ims.actor;

class Address {

    String buildingNumber;
    String streetName;
    String city;
    int pincode;

    Address(String buildingNumber, String streetName, String city, int pincode){
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;
    }

    Address(){

    }
}