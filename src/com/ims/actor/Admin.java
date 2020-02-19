package com.ims.actor;
// class <className>
class Admin {
    //DataType nameofattribute
    int id;
    String name;
    Address address;
    Supplier[] suppliers = new Supplier[1000];

    Admin(){
        System.out.println("Admin Constructed !!");
    }

    Admin(String n, Address address){
        name = n;
        this.address = address;
    }

    // returnType methodName(){ //method definition -> return statement}
    void checkProfileDashboard(){
        System.out.println("Please selection an option : ");
        System.out.println("Press 1 for Viewing profile details");
    }

    public void addSupplier(Supplier supplier){
        // Store the supplier
        int id = storeSupplier(supplier);
        supplier.id=id;
        mapSupplier(supplier);
        // Mapping the supplier to the administrator

    }

    // Storing a supplier
    private int storeSupplier(Supplier supplier){
        // Store supplier
        return -1;
    }

    // Mapping a supplier with Admin
    private void mapSupplier(Supplier supplier){

    }

    String getName(){
        return name;
    }
}