package com.example.project.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "dealer")
public class Dealer {
    @Id
    int dealerId;
    String deelerName;
    String dealerLocation;
    String gSTNumber;
    long mobileNumber;
    @OneToOne(mappedBy = "dealerofproduct",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    Product product;
    public int getDealerId() {
        return dealerId;
    }
    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }
    public String getDeelerName() {
        return deelerName;
    }
    public void setDeelerName(String deelerName) {
        this.deelerName = deelerName;
    }
    public String getDealerLocation() {
        return dealerLocation;
    }
    public void setDealerLocation(String dealerLocation) {
        this.dealerLocation = dealerLocation;
    }
    public String getgSTNumber() {
        return gSTNumber;
    }
    public void setgSTNumber(String gSTNumber) {
        this.gSTNumber = gSTNumber;
    }
    public long getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    
}
