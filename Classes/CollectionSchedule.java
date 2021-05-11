/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Thanushan Sasith Lakshan
 */
import java.io.Serializable;
public class CollectionSchedule implements Serializable{
    private String CollectionId;
    private String CollectioDate;
    private String address;
    private String telephone;
    private String productId;
    private int quantityl;

    
    public CollectionSchedule() {
    }

    public CollectionSchedule(String CollectionId, String CollectioDate, String address, String telephone, String productId, int quantityl) {
        this.CollectionId = CollectionId;
        this.CollectioDate = CollectioDate;
        this.address = address;
        this.telephone = telephone;
        this.productId = productId;
        this.quantityl = quantityl;
    }

    public String getCollectionId() {
        return CollectionId;
    }

    public void setCollectionId(String CollectionId) {
        this.CollectionId = CollectionId;
    }

    public String getCollectioDate() {
        return CollectioDate;
    }

    public void setCollectioDate(String CollectioDate) {
        this.CollectioDate = CollectioDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantityl() {
        return quantityl;
    }

    public void setQuantityl(int quantityl) {
        this.quantityl = quantityl;
    }
    
    
   
}
