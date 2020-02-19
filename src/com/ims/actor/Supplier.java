package com.ims.actor;

public class Supplier {

    private int id;
    private String name;
    private Address address;

    public Supplier(){
        System.out.println("Supplier Constructed !!");
    }

    public Supplier(String name, Address address) {
        this();
        setName(name);
        this.address = address;
        System.out.println("Assignments Done");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name == ""){
            // Generate an alarm
        }
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public Address getAddress(){
        return address;
    }
}