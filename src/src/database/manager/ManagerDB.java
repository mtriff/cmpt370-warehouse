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

    //@edit by Rongli Han
    @Override
    public Object[] getEmployees() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void addEmployee(String name, int id,String title, String currentWork, String nextWork, int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getEmployeeName(int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setEmployeeName(Sting name,int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public float getEmployeeSpeed(int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmployeeSpeed(float speed,int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getTitle(int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTitle(String title,int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public String getCurrentWork(){
        
    }
    
     @Override
    public void setCurrentWork(){
        
    }
    
     @Override
    public String getNextWork{
        
    }
    
     @Override
    public void setNextWork{
        
    }
    
     @Override
    public int getNumofWorkDone(){
        
    }
    
     @Override
    public void setNumofWorkDone(){
        
    }


    //edit by Rongli Han
    @Override
    public int addProduct(String pName, int pQuantities, String pCategory, float pPrice, float pSize, String pDescription)
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
    public String getCategory(int itemNumber) {
        // for test modify inventory    
        if(itemNumber == 1)
           return "100";
       else 
           return "200";
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
