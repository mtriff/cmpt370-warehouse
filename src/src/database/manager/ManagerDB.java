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
    public Object[] getEmployeesList() {
        Object[] returnArr=new String[3];
        
        returnArr[0]=1;
        returnArr[1]=2;
        returnArr[2]=3;
        return returnArr;
    }
    
    
    @Override
    public void addEmployee(String name, int id,String title, String currentWork, String nextWork, int number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
<<<<<<< HEAD
=======
    @Override
    public String getEmployeeName(int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setEmployeeName(String name,int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
>>>>>>> database
    @Override
    public String getEmployeeName(int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
<<<<<<< HEAD
    public void setEmployeeName(String name,int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
<<<<<<< HEAD
    public int createOrder() {
=======
    public float getEmployeeSpeed(int employeeId) {
=======
    public void setEmployeeSpeed(float speed,int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getTitle(int employeeId) {
>>>>>>> database
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
<<<<<<< HEAD
    public void setEmployeeSpeed(float speed,int employeeId) {
>>>>>>> manager
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
=======
    public void setTitle(String title,int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public String getCurrentWork(int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void setCurrentWork(String currentWork, int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public String getNextWork(int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void setNextWork(String nextWork, int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public int getNumofWorkDone(int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void setNumofWorkDone(int num ,int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    /*//edit by Rongli Han
     @Override
     public int addProduct(String pName, int pQuantities, String pCategory, float pPrice, float pSize, String pDescription){
     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }*/
    
    
    // added by Xingze
>>>>>>> database
    @Override
    public String getTitle(int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
<<<<<<< HEAD
    public String getProductName(int itemNumber) {
        
        // for test modify inventory
        if(itemNumber == 1)
<<<<<<< HEAD
           return "One";
       else 
           return "Two";
=======
    public void setTitle(String title,int employeeId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> manager
    }
    
    
=======
            return "One";
        else
            return "Two";
    }
    
>>>>>>> database
    @Override
<<<<<<< HEAD
    public void setProductName(String name, int itemNumber) {
<<<<<<< HEAD
       
=======
    public String getCurrentWork(int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
>>>>>>> manager
=======
        
>>>>>>> database
    }
    
    @Override
<<<<<<< HEAD
    public int getProductNumber(String itemName) {
        // for test modify inventory
        if(itemName.compareTo("One")==0)
<<<<<<< HEAD
           return 1;
       else 
           return 2;
=======
    public void setCurrentWork(String currentWork, int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
>>>>>>> manager
=======
            return 1;
        else
            return 2;
>>>>>>> database
    }
    
    @Override
<<<<<<< HEAD
    public void setProductNumber(int itemNumber, String itemName) {
=======
    public String getNextWork(int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void setNextWork(String nextWork, int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public int getNumofWorkDone(int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public void setNumofWorkDone(int num ,int employeeId){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    /*//edit by Rongli Han
     @Override
     public int addProduct(String pName, int pQuantities, String pCategory, float pPrice, float pSize, String pDescription){
     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }*/
    
    
    // added by Xingze
    @Override
    public String getProductName(int itemNumber) {
>>>>>>> manager
        
        // for test modify inventory
        if(itemNumber == 1)
            return "One";
        else
            return "Two";
    }
    
    @Override
<<<<<<< HEAD
    public int getProductPrice(int itemNumber) {
        // for test modify inventory
        if(itemNumber == 1)
            return 100;
        else
            return 200;
    }
    
    @Override
    public int getProductQuantity(int itemNumber) {
<<<<<<< HEAD
         // for test modify inventory    
=======
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
>>>>>>> manager
=======
        // for test modify inventory
>>>>>>> database
        if(itemNumber == 1)
            return 100;
        else
            return 200;
    }
    
<<<<<<< HEAD
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
<<<<<<< HEAD
       
=======
        
>>>>>>> manager
=======
    @Override
    public void setProductQuantity(int quantity, int itemNumber) {
        
>>>>>>> database
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
<<<<<<< HEAD
<<<<<<< HEAD
       // for test modify inventory    
=======
        // for test modify inventory
>>>>>>> manager
=======
        // for test modify inventory
>>>>>>> database
        if(itemNumber == 1)
            return "100";
        else
            return "200";
<<<<<<< HEAD
    }
    
    @Override
    public float getProductSize(int itemNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public float getProductWeight(int itemNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
>>>>>>> database
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
    
    @Override
<<<<<<< HEAD
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
    
    @Override
=======
>>>>>>> database
    public Object[] getProductList() {
        Object[] returnArr=new String[3];
        
        returnArr[0]=1;
<<<<<<< HEAD
        returnArr[1]=2; 
        returnArr[2]=3; 
=======
        returnArr[1]=2;
        returnArr[2]=3;
>>>>>>> database
        return returnArr;
    }
}
