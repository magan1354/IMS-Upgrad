package com.ims.data;

import com.ims.entity.Order;

public class OrderHolder {

    private static Order[] orders = new Order[10000];
    private static int pos=0;

    public static Order save(Order order) {
        //Generate ID for the order
        order.setId(pos);
        // Store the order
        orders[pos]=order;
        // Increment the pos
        pos = pos +1;
        //return order
        return order;
    }

    public static Order fetchById(Integer id) {
        if(id>orders.length || id<0) {
            return null;
        }
        return orders[id];
    }

}