/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanushan Sasith Lakshan
 */
public class StoreAdmin extends User{
    private String userid;
    private String username;
    private String password;
    private String name;
    private String telephone;
    ArrayList<Product> productlist = new ArrayList<>();
    
    @Override
    public boolean login(String user,String pass){
        boolean flag = false;
        if("admin".equals(user) && "admin123".equals(pass)){
            flag = true;
        }
        return flag;
    }
    
    public void addStoreAdmin(){
        
    }
    public boolean addPhoneOrder(Order o){
        boolean flag = false;
        ArrayList<Order> orderlist = new ArrayList<>();
            try {
               
                FileInputStream fin = new FileInputStream ("order.txt");
                ObjectInputStream ois = new ObjectInputStream(fin);
           
                orderlist =  (ArrayList<Order>) ois.readObject();
                orderlist.add(o);
                FileOutputStream fos = new FileOutputStream("order.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(orderlist);
                flag = true;
                oos.close();
            } catch (FileNotFoundException ex) {
               
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
            return flag;
    }
    
    public boolean addProduct(Product p){
           boolean flag = false;
            try {
               FileInputStream fin = new FileInputStream ("product.txt");
               ObjectInputStream ois = new ObjectInputStream(fin);
               productlist = (ArrayList<Product>) ois.readObject();
                
                productlist.add(p);
                FileOutputStream fos = new FileOutputStream("product.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(productlist);
                flag = true;
                oos.close();
            } catch (FileNotFoundException ex) {
               
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoreAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
            return flag;
    }
    
    public boolean addDeliverySchedule(DeliverySchedule d){
         boolean flag = false;
         ArrayList<DeliverySchedule> deliverylist = new ArrayList<>();
            try {
                FileInputStream fin = new FileInputStream ("delivarySchedule.txt");
                ObjectInputStream ois = new ObjectInputStream(fin);
                deliverylist = (ArrayList<DeliverySchedule>) ois.readObject();
                
                deliverylist.add(d);
                FileOutputStream fos = new FileOutputStream("delivarySchedule.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(deliverylist);
                flag = true;
                oos.close();
            } catch (FileNotFoundException ex) {
               
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoreAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
            return flag;
    }
    public boolean addShoppingList(ShoppingList s){
          boolean flag = false;
         ArrayList<ShoppingList> shoppinglist = new ArrayList<>();
            try {
                FileInputStream fin = new FileInputStream ("shoppinglist.txt");
                ObjectInputStream ois = new ObjectInputStream(fin);
                shoppinglist = (ArrayList<ShoppingList>) ois.readObject();
                
                shoppinglist.add(s);
                FileOutputStream fos = new FileOutputStream("shoppinglist.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(shoppinglist);
                flag = true;
                oos.close();
            } catch (FileNotFoundException ex) {
               
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoreAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
            return flag;
    }
    
    
    public boolean addOffer(Offer o){
         boolean flag = false;
         ArrayList<Offer> offerlist = new ArrayList<>();
            try {
                FileInputStream fin = new FileInputStream ("offers.txt");
                ObjectInputStream ois = new ObjectInputStream(fin);
                offerlist = (ArrayList<Offer>) ois.readObject();
                
                offerlist.add(o);
                FileOutputStream fos = new FileOutputStream("offers.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(offerlist);
                flag = true;
                oos.close();
            } catch (FileNotFoundException ex) {
               
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoreAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
            return flag; 
    }
    public boolean addCollectionSchedule(CollectionSchedule c){
         boolean flag = false;
         ArrayList<CollectionSchedule> collectionlist = new ArrayList<>();
            try {
                FileInputStream fin = new FileInputStream ("collectionSchedule.txt");
                ObjectInputStream ois = new ObjectInputStream(fin);
                collectionlist = (ArrayList<CollectionSchedule>) ois.readObject();
                
                collectionlist.add(c);
                FileOutputStream fos = new FileOutputStream("collectionSchedule.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(collectionlist);
                flag = true;
                oos.close();
            } catch (FileNotFoundException ex) {
               
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(StoreAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
            return flag;
    }
}
