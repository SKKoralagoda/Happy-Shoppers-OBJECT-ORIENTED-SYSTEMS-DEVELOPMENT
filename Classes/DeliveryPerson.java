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
public class DeliveryPerson extends User{
    private String userId;
    private String username;
    private String password;
    private String name;
    private String telephone;
    
    
    
    @Override
    public boolean login(String user,String pass){
        boolean flag = false;
        if("delivery".equals(user) && "d123".equals(pass)){
            flag = true;
        }
        return flag;
    }
      
    public void addDeliveryPerson(){
        
    }
    
    public void updateCollectionShedule(){
        
    }
}
