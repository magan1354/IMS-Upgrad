package com.ims.actor;

class InventoryManager {
    private int id;
    private String name;
    private Address address;

    InventoryManager() {
        System.out.println("Inventory Manager Constructed");
    }

    InventoryManager(String name, Address address) {
        this();
        setName(name);
        this.address = address;
        System.out.println("Assignments Done");
    }

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard(){
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing profile details");
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