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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Order implements Serializable{
    public String orderid;
    public String date;
    public double total;
    public String telephone;
    public String address;
    public String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
   
    public Order(){
    
    }
    public Order(String id, String date, double total, String telphone, String address, String user){
        this.orderid = id;
        this.date = date;
        this.total = total;
        this.telephone = telphone;
        this.address = address;
        this.username = user;
    }
    
    public boolean createOrderItem(String orderid, String item, int quantity){
        boolean flag = false;
        OrderItem o = new OrderItem(orderid, item, quantity);
        ArrayList<OrderItem> orderitemlist = new ArrayList<>();
            try {
               
                FileInputStream fin = new FileInputStream ("orderitem.txt");
                 ObjectInputStream ois = new ObjectInputStream(fin);
           
               orderitemlist =  (ArrayList<OrderItem>) ois.readObject();
                orderitemlist.add(o);
                FileOutputStream fos = new FileOutputStream("orderitem.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(orderitemlist);
                flag = true;
                oos.close();
            } catch (FileNotFoundException ex) {
               
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
            return flag;
    }
    
   
    
    public double radeemAmount(String code){
        double amount = 0;
        ArrayList<Voucher> orderitemlist = new ArrayList<>();
         Voucher v;
        try {
               
                FileInputStream fin = new FileInputStream ("voucher.txt");
                ObjectInputStream ois = new ObjectInputStream(fin);
           
                orderitemlist =  (ArrayList<Voucher>) ois.readObject();
                for(int i = 0; i < orderitemlist.size(); i++){
                    if(code.equals(orderitemlist.get(i).getVoucherId())){
                        amount = orderitemlist.get(i).getAmount();
                       
                    }
                }
             
              
              
                //oos.close();
            } catch (FileNotFoundException ex) {
               
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
        }
        return amount;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
