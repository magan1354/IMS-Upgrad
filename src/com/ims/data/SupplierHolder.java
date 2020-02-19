package com.ims.data;
import com.ims.actor.Supplier;

public class SupplierHolder {
    static Supplier[] suppliers = new Supplier[10000];
    private static int currentIndex = 0;

    // Adding/Storing a supplier and return id of Supplier
    public static int saveSupplier(Supplier supplier){
        suppliers[currentIndex]=supplier;
        currentIndex = currentIndex +1;
        return currentIndex;
    }

    Supplier fetchSupplierById(int id){
        return suppliers[id];
    }

    // Fetching a supplier with a particular index
}