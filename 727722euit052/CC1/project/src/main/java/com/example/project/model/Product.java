package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    long product_id;
    String  product_name;
    String product_type;
    int product_Available;
    int market_price;
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
    public int getProduct_Available() {
        return product_Available;
    }
    public void setProduct_Available(int product_Available) {
        this.product_Available = product_Available;
    }
    public int getMarket_price() {
        return market_price;
    }
    public void setMarket_price(int market_price) {
        this.market_price = market_price;
    }
    
}
