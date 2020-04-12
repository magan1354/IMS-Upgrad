package com.ims.actor;

import com.ims.entity.Notification;

public abstract class SystemUser {

    private int id;
    private String name;
    private Address address;
    protected boolean loggedIn;
    private Notification[] notifications = new Notification[10000];
    private int nCounter = 0;

    public SystemUser(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public boolean login(String userName, String Password) {
        if("systemuser".equalsIgnoreCase(userName) && "systemuser".equalsIgnoreCase(Password)) {
            loggedIn=true;
            return true;
        }
        return false;
        // Check whether userName & password is valid or not
        // If valid then store state as loggedIn
    }

    public abstract void checkProfileDashboard();

    public void logout() {
        loggedIn=false;
        System.out.println("User :"+name+" logged out successfully!");
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

    public void notify(Notification notification) {
        notifications[nCounter] = notification;
        nCounter++;
    }

    public Notification[] getNotifications() {
        return notifications;
    }

    public void setNotifications(Notification[] notifications) {
        this.notifications = notifications;
    }
}