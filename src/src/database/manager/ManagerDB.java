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
    public int createOrder() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float addSpeedDatapoint(int employeeId, float time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // added by Xingze
    @Override
    public String getProductName(int itemNumber) {
      
        // for test modify inventory
        if(itemNumber == 1)
           return "One";
       else 
           return "Two";
    }

    @Override
    public void setProductName(String name, int itemNumber) {
       
    }

    @Override
    public int getProductNumber(String itemName) {
        // for test modify inventory
        if(itemName.compareTo("One")==0)
           return 1;
       else 
           return 2;
    }

    @Override
    public void setProductNumber(int itemNumber, String itemName) {
        
    }

    @Override
    public int getProductPrice(int itemNumber) {
       // for test modify inventory
        if(itemNumber == 1)
           return 100;
       else 
           return 200;
    }
    
    @Override
    public int getProductQuantity(int itemNumber) {
         // for test modify inventory    
        if(itemNumber == 1)
           return 100;
       else 
           return 200;
    }

    @Override
    public void setProductQuantity(int quantity, int itemNumber) {
       
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
    public String getProductDescription(int itemNumber) {
       // for test modify inventory    
        if(itemNumber == 1)
           return "100";
       else 
           return "200";
    }

    @Override
    public float getProductSize(int itemNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getProductWeight(int itemNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setTitle(int employeeId, String title) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setEmployeeName(int employeeId, String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void setProductDescription(int itemNumber, String description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProductSize(int itemId, float size) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void setProductCategory(int itemId, int categoryId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

    @Override
    public void setProductPrice(int itemId, float price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    @Override
    public Object[] getProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addProduct(String name, int category, float price, float weight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
