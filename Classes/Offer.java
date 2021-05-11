/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author HP
 */
import java.io.Serializable;
public class Offer implements Serializable{
    private String category;
    private String offer;

    public Offer(String category, String offer) {
        this.category = category;
        this.offer = offer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getOffer() {
        return offer;
    }

    public void setOffer(String offer) {
        this.offer = offer;
    }
    
}
