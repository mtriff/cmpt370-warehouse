/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.manager;

/**
 *
 * @author Matt
 */
public class ManagerDB implements ManagerDBInterface {

    @Override
    public Object[] getEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getEmployeeSpeed(int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addEmployee(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setTitle(int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int createOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float addSpeedDatapoint(int employeeId, float time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // added by Xingze
    @Override
    public String getItemName(int itemNumber) {
      
        // for test modify inventory
        if(itemNumber == 1)
           return "One";
       else 
           return "Two";
    }

    @Override
    public void setItemName(String name, int itemNumber) {
       
    }

    @Override
    public int getItemNumber(String itemName) {
        // for test modify inventory
        if(itemName.compareTo("One")==0)
           return 1;
       else 
           return 2;
    }

    @Override
    public void setItemNumber(int itemNumber, String itemName) {
        
    }

    @Override
    public void setItemDescription(String description, int itemNumber) {
        
    }

    @Override
    public void setCategory(int category, int itemNumber) {
        
    }

    @Override
    public int getItemPrice(int itemNumber) {
       // for test modify inventory
        if(itemNumber == 1)
           return 100;
       else 
           return 200;
    }

    @Override
    public void setItemPrice(int price, int itemNumber) {
      
    }

    @Override
    public int getItemQuantity(int itemNumber) {
         // for test modify inventory    
        if(itemNumber == 1)
           return 100;
       else 
           return 200;
    }

    @Override
    public void setItemQuantity(int quantity, int itemNumber) {
       
    }

    @Override
    public void setLocation(int location, int itemNumber) {
        
    }

    @Override
    public int getLocation(int itemNumber) {
        // for test modify inventory    
        if(itemNumber == 1)
           return 0101;
       else 
           return 0202;
    }

    @Override
    public int getCategory(int itemNumber) {
        // for test modify inventory    
        if(itemNumber == 1)
           return 100;
       else 
           return 200;
    }

    @Override
    public String getItemDescription(int itemNumber) {
       // for test modify inventory    
        if(itemNumber == 1)
           return "100";
       else 
           return "200";
    }
    
}
