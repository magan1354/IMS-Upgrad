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

    public boolean login(String userName, String password) {
        if("supplier".equalsIgnoreCase(userName) && "supplier".equalsIgnoreCase(password)) {
            loggedIn=true;
            return true;
        }
        loggedIn=false;
        return false;
    }
}