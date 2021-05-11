/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
/**
 *
 * @author Thanushan Sasith Lakshan
 */
public class Product implements Serializable {
     public String productId;
     public String productName;
     public double price;
     public String category;
     public String location;
     public int quantity;
    
    public Product() {
        
    }
    public Product(String pid, String pname, double price,int quan, String cat,String location) {
        this.productId = pid;
        this.productName = pname;
        this.price = price;
        this.category = cat;
        this.location = location;
        this.quantity = quan;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
    
    
}
