package com.ims.actor;

public class InventoryManager extends SystemUser{

    public InventoryManager() {
        super(null, null);
        System.out.println("Inventory Manager Constructed");
    }

    public InventoryManager(String name, Address address) {
        super(name, address);
        System.out.println("Assignments Done");
    }

    // returnType methodName(){ //method definition -> return statement}
    public void checkProfileDashboard(){
        System.out.println("Please press: ");
        System.out.println("4 for logout");
        System.out.println("6 placing order");
    }

    @Override
    public boolean login(String userName, String password) {
        if("inventoryManager".equalsIgnoreCase(userName) && "inventoryManager".equalsIgnoreCase(password)) {
            loggedIn=true;
            return true;
        }
        loggedIn=false;
        return false;
    }
}