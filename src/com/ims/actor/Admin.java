package com.ims.actor;

import com.ims.data.SupplierHolder;

// class <className>
class Admin {
    //DataType nameofattribute
    int id;
    private String name;
    private Address address;
    private Supplier[] suppliers = new Supplier[1000];
    private static int supCount = 0;

    Admin(){
        System.out.println("Admin Constructed !!");
    }

    Admin(String n, Address address){
        setName(n);
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
        supplier.setId(id);
        mapSupplier(supplier);
        // Mapping the supplier to the administrator

    }

    // Storing a supplier
    private int storeSupplier(Supplier supplier){
        int index = SupplierHolder.saveSupplier(supplier);
        return index;
    }

    // Mapping a supplier with Admin
    private void mapSupplier(Supplier supplier){
        suppliers[supCount] = supplier;
        supCount = supCount + 1;
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