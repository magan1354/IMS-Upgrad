package com.ims.entity;

import com.ims.actor.InventoryManager;
import com.ims.actor.Supplier;

public class Order {

    private Integer id;
    private Integer productId;
    private Integer quantity;
    private Float overallPrice;
    private InventoryManager raisedBy;
    private String status="placed";
    private Supplier supplier;

    public Order() {

    }

    public Order(Integer productId, Integer quantity, InventoryManager raisedBy, Supplier supplier) {
        this.productId = productId;
        this.quantity = quantity;
        this.raisedBy = raisedBy;
        this.supplier = supplier;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getOverallPrice() {
        return overallPrice;
    }

    public void setOverallPrice(Float overallPrice) {
        this.overallPrice = overallPrice;
    }

    public InventoryManager getRaisedBy() {
        return raisedBy;
    }

    public void setRaisedBy(InventoryManager raisedBy) {
        this.raisedBy = raisedBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}