/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Thanushan Sasith Lakshan
 */
public class Customer extends User implements Serializable {
    transient private String userId;
    public String username;
    public String password;
    private String name;
    private String telephone;
    private String address;
   
    transient ArrayList<Customer> customerlist = new ArrayList<>();
    public Customer(){
    
    }
    public Customer(String name,String add, String tel, String us, String pas){
        this.name = name;
        this.address = add;
        this.telephone = tel;
        this.username = us;
        this.password = pas;
    }
    
    @Override
    public boolean login(String user,String pass){       
        boolean flag = false;
        try {       
            FileInputStream fin = new FileInputStream ("customer.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
           
            customerlist =  (ArrayList<Customer>) ois.readObject();
            
            
            fin.close();
            for(int i = 0; i < customerlist.size() ; i++){
                if(user.equals(customerlist.get(i).username) && pass.equals(customerlist.get(i).password)){
                     flag = true;
                }
            }
        } catch (FileNotFoundException ex) {
        
        } catch (IOException | ClassNotFoundException ex) {
           
        } 
       
        return flag;
    }
    
    
    public boolean addCustomer(Customer c1){
        boolean flag = false;
        
            try {
            FileInputStream fin = new FileInputStream ("customer.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
           
            customerlist =  (ArrayList<Customer>) ois.readObject();
            
                customerlist.add(c1);
                     FileOutputStream fos = new FileOutputStream("customer.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(customerlist);
                oos.close();
                
            } catch (FileNotFoundException ex) {
               
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
            flag = true;
       
        return flag;
    }
    
    
    public boolean addtoCart(ShoppingCart s){
        boolean flag = false;
        ArrayList<ShoppingCart> shoppinglist = new ArrayList<>();
            try {
               
                FileInputStream fin = new FileInputStream ("cart.txt");
                ObjectInputStream ois = new ObjectInputStream(fin);
           
                shoppinglist =  (ArrayList<ShoppingCart>) ois.readObject();
                shoppinglist.add(s);
                FileOutputStream fos = new FileOutputStream("cart.txt");
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(shoppinglist);
                flag = true;
                oos.close();
            } catch (FileNotFoundException ex) {
               
            } catch (IOException ex) {
                
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
            return flag;
    }
  
    public boolean addOrder(Order o){
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
    
    public boolean complainsAndInquires(Complains c){
        boolean flag = false;
        ArrayList<Complains> complainList = new ArrayList<>();
        try {
           FileInputStream fin = new FileInputStream("complain.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            complainList = (ArrayList<Complains>) ois.readObject();
            
            complainList.add(c);
            FileOutputStream fos = new FileOutputStream("complain.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(complainList);
            flag = true;
            oos.close();
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        return flag;
    }
    public boolean inquire(inquiry i){
        boolean flag = false;
        ArrayList<inquiry> complainList = new ArrayList<>();
        try {
            FileInputStream fin = new FileInputStream("inquiry.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            complainList = (ArrayList<inquiry>) ois.readObject();
            
            complainList.add(i);
            FileOutputStream fos = new FileOutputStream("inquiry.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(complainList);
            flag = true;
            oos.close();
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        return flag;
    }
    public boolean AddRadeemVoucher(Voucher v){
                boolean flag = false;
        ArrayList<Voucher> voucherList = new ArrayList<>();
        try {
            FileInputStream fin = new FileInputStream("voucher.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            voucherList = (ArrayList<Voucher>) ois.readObject();
            
            voucherList.add(v);
            FileOutputStream fos = new FileOutputStream("voucher.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(voucherList);
            flag = true;
            oos.close();
        } catch (FileNotFoundException ex) {
           
        } catch (IOException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        return flag;
        
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
