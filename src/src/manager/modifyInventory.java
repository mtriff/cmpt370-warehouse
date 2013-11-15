/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;


import database.manager.ManagerDB;
import javax.swing.JFrame;
import warehouseui.InventoryModifyPopup;

/**
 * modify inventory, change data and location
 * @author Xingze
 */
public class modifyInventory {
    
    private ManagerDB database;
    private String testString;
    public modifyInventory(){
        database =new ManagerDB();
    }
    
       /**
     * 
     * @param ProductNumber
     * @return 
     */
    public String getProductName(int ProductNumber){
        return database.getProductName(ProductNumber);
    }
    
    /**
     * 
     * @param name
     * @param ProductNumber 
     */
    public void setProductName(String name, int ProductNumber){
         testString =  testString + "Name = " + name + "\r\n";// for test
        database.setProductName(name, ProductNumber);
    }
    
    /**
     * 
     * @param ProductName
     * @return 
     */
    public int getProductNumber(String ProductName){
        
        return database.getProductNumber(ProductName);
    }
    
    /**
     * 
     * @param ProductNumber
     * @param ProductName 
     */
    public void setProductNumber(int ProductNumber, String ProductName){
        testString =  testString + "ProductNumber = " + ProductNumber + "\r\n";// for test
        database.setProductNumber(ProductNumber, ProductName);
    }

    /**
     * 
     * @param description
     * @param ProductNumber 
     */
    public void setProductDescription (String description,int ProductNumber){
        testString =  testString + "description = " + description + "\r\n";// for test
        database.setProductDescription(ProductNumber,description );
    }
    
    /**
     * 
     * @param category
     * @param ProductNumber 
     */
    public void setCategory(int category,int ProductNumber){
        testString =  testString + "category = " + category + "\r\n";// for test
        database.setProductCategory(ProductNumber,category);
    }
    
    /**
     * 
     * @param ProductNumber
     * @return 
     */
    public int getProductPrice(int ProductNumber){
        return database.getProductPrice(ProductNumber);
    }
    
    /**
     * 
     * @param price
     * @param ProductNumber 
     */
    public void setProductPrice(int price, int ProductNumber){
        testString =  testString + "price = " + price + "\r\n";// for test
        database.setProductPrice(price, ProductNumber);
    }

    /**
     * 
     * @param ProductNumber
     * @return 
     */
    public int getProductQuantity(int ProductNumber){
        return database.getProductQuantity(ProductNumber);
    }
    
    /**
     * 
     * @param quantity
     * @param ProductNumber 
     */
    public void setProductQuantity(int quantity,int ProductNumber){
        
        testString =  testString + "quantity = " + quantity + "\r\n"; // for test
        database.setProductQuantity(quantity, ProductNumber);
    }
    
    /**
     * 
     * @param location
     * @param ProductNumber 
     */
    public void setLocation(int location, int ProductNumber){
        testString =  testString + "location = " + location + "\r\n";  // for test
        database.setLocation(location,ProductNumber);
    }    
    /**
     * 
     * @param ProductNumber
     * @return 
     */
    public int getLocation(int ProductNumber){
        
        return database.getLocation(ProductNumber);
    }
    
            
    public static void main(String[] argo){
        modifyInventory test = new modifyInventory();

        InventoryModifyPopup newInv = new InventoryModifyPopup();
        newInv.setVisible(true);

        
    }

    public Object getProductCategory(int ProductNumber) {
        return database.getCategory(ProductNumber);
    }
    
    public String getProductDescription(int ProductNumber){
        return database.getProductDescription(ProductNumber);
    }
    
    
    @Override
    public String toString(){
        return testString;
    }
}
