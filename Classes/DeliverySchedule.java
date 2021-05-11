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
public class DeliverySchedule implements Serializable{
    private String deliveryId;
    private String deliveryDate;
    private String orderid;

    public DeliverySchedule() {
    }

    public DeliverySchedule(String deliveryId, String deliveryDate, String orderid) {
        this.deliveryId = deliveryId;
        this.deliveryDate = deliveryDate;
        this.orderid = orderid;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }
    
    
 
    
}
