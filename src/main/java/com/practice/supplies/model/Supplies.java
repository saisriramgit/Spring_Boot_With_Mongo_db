package com.practice.supplies.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;
import java.util.Date;

@Document(collection = "sales")
public class Supplies {
    private Date saleDate;
    private String[] items;
    private String storeLocation;
    private Object customer;
    private boolean couponUsed;
    private String purchaseMethod;

    public Supplies() {
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    public String getStoreLocation() {
        return storeLocation;
    }

    public void setStoreLocation(String storeLocation) {
        this.storeLocation = storeLocation;
    }

    public Object getCustomer() {
        return customer;
    }

    public void setCustomer(Object customer) {
        this.customer = customer;
    }

    public boolean isCouponUsed() {
        return couponUsed;
    }

    public void setCouponUsed(boolean couponUsed) {
        this.couponUsed = couponUsed;
    }

    public String getPurchaseMethod() {
        return purchaseMethod;
    }

    public void setPurchaseMethod(String purchaseMethod) {
        this.purchaseMethod = purchaseMethod;
    }

    @Override
    public String toString() {
        return "Supplies{" +
                "saleDate=" + saleDate +
                ", items=" + Arrays.toString(items) +
                ", storeLocation='" + storeLocation + '\'' +
                ", customer=" + customer +
                ", couponUsed=" + couponUsed +
                ", purchaseMethod='" + purchaseMethod + '\'' +
                '}';
    }
}
