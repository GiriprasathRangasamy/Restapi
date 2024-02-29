package com.example.project.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
    @Id
    long product_id;
    String  product_name;
    String product_type;
    int productAvailable;
    double market_price;

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name="dealerforgrinId",referencedColumnName = "dealerId")
    @JsonBackReference
    Dealer dealerofproduct;
    
    public long getProduct_id() {
        return product_id;
    }
    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }
    public String getProduct_name() {
        return product_name;
    }
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
    public String getProduct_type() {
        return product_type;
    }
    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }
    public int getProductAvailable() {
        return productAvailable;
    }
    public void setProductAvailable(int productAvailable) {
        this.productAvailable = productAvailable;
    }
    public double getMarket_price() {
        return market_price;
    }
    public void setMarket_price(double market_price) {
        this.market_price = market_price;
    }
    public Dealer getDealerofproduct() {
        return dealerofproduct;
    }
    public void setDealerofproduct(Dealer dealerofproduct) {
        this.dealerofproduct = dealerofproduct;
    }
   
}
