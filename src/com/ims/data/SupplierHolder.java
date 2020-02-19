package com.ims.data;
import com.ims.actor.Supplier;

class SupplierHolder {
    Supplier[] suppliers = new Supplier[10000];
    int currentIndex = 0;

    // Adding/Storing a supplier and return id of Supplier
    int saveSupplier(Supplier supplier){
        suppliers[currentIndex]=supplier;
        currentIndex = currentIndex +1;
        return currentIndex;
    }


    // Fetching a supplier with a particular index
}