package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "order1")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long productid;
    String productname;
    String quantity;
    String supplierName;
    long supplierMobileNumber;
    double pricePerunit;
    double totalPrice;
    String status;
    String delivered;
    String orderId;
    public long getProductid() {
        return productid;
    }
    public void setProductid(long productid) {
        this.productid = productid;
    }
    public String getProductname() {
        return productname;
    }
    public void setProductname(String productname) {
        this.productname = productname;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getSupplierName() {
        return supplierName;
    }
    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }
    public long getSupplierMobileNumber() {
        return supplierMobileNumber;
    }
    public void setSupplierMobileNumber(long supplierMobileNumber) {
        this.supplierMobileNumber = supplierMobileNumber;
    }
    public double getPricePerunit() {
        return pricePerunit;
    }
    public void setPricePerunit(double pricePerunit) {
        this.pricePerunit = pricePerunit;
    }
    public double getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDelivered() {
        return delivered;
    }
    public void setDelivered(String delivered) {
        this.delivered = delivered;
    }
    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
}
