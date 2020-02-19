package com.ims.actor;

class InventoryManager {
    int id;
    String name;
    String buildingNumber;
    String streetName;
    String city;
    int pincode;

    InventoryManager() {
        System.out.println("Inventory Manager Constructed");
    }

    InventoryManager(String name, String buildingNumber, String streetName, String city, int pincode) {
        this();
        this.name = name;
        this.buildingNumber = buildingNumber;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;
        System.out.println("Assignments Done");
    }

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard(){
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing profile details");
    }

    void test(){
        this.callMe();
    }

    void callMe(){

    }
}