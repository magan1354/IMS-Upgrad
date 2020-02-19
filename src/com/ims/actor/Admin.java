package com.ims.actor;
// class <className>
class Admin {
    //DataType nameofattribute
    int id;
    String name;
    String buildingNumber;
    String streetName;
    String city;
    int pincode;

    Admin(){
        System.out.println("Admin Constructed !!");
    }

    Admin(String n, String bn, String sn, String c, int pc){
        name = n;
        buildingNumber = bn;
        streetName = sn;
        city = c;
        pincode = pc;
    }

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard(){
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing profile details");
    }

    String getName(){
        return name;
    }
}