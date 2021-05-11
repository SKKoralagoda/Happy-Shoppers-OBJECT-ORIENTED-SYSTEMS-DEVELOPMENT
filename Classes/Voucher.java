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
public class Voucher implements Serializable{
    private String voucherId;
    private double amount;

    public Voucher(String voucherId, double amount) {
        this.voucherId = voucherId;
        this.amount = amount;
    }

    public String getVoucherId() {
        return voucherId;
    }

    public void setVoucherId(String voucherId) {
        this.voucherId = voucherId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    
    
}
