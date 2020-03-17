package com.ims.actor;

class SystemUser {

    private int id;
    private String name;
    private Address address;
    protected boolean loggedIn;

    public SystemUser(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public void login(String userName, String Password){
        // Check whether userName & password is valid or not
        // If valid then store state as loggedIn
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