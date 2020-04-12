package com.ims.actor;

import com.ims.data.OrderHolder;
import com.ims.entity.Order;

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

    public Order placeOrder(Integer productId, Integer quantity, Supplier supplier) {
        Order order = new Order(productId,quantity,this,supplier);
        Order savedOrder = OrderHolder.save(order);
        System.out.println("Order placed with id:"+savedOrder.getId());
        return order;
    }
}