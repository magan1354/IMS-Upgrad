package com.ims.actor;

class IMS {
    public static void main(String[] args){

        Admin admin = new Admin();

        admin.name = "Sahil";
        admin.buildingNumber = "1171";
        admin.streetName = "GT Road";
        admin.city = "Delhi";
        admin.pincode = 110007;

        System.out.println(admin.name);
        System.out.println(admin.buildingNumber);
        System.out.println(admin.streetName);
        System.out.println(admin.pincode);
    }
}