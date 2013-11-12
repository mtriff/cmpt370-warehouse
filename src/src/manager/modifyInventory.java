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
    
    public modifyInventory(){
        database =new ManagerDB();
    }
    
       /**
     * 
     * @param itemNumber
     * @return 
     */
    public String getItemName(int itemNumber){
        return database.getItemName(itemNumber);
    }
    
    /**
     * 
     * @param name
     * @param itemNumber 
     */
    public void setItemName(String name, int itemNumber){
         database.setItemName(name, itemNumber);
    }
    
    /**
     * 
     * @param itemName
     * @return 
     */
    public int getItemNumber(String itemName){
        return database.getItemNumber(itemName);
    }
    
    /**
     * 
     * @param itemNumber
     * @param itemName 
     */
    public void setItemNumber(int itemNumber, String itemName){
        database.setItemNumber(itemNumber, itemName);
    }

    /**
     * 
     * @param description
     * @param itemNumber 
     */
    public void setItemDescription (String description,int itemNumber){
        database.setItemDescription(description, itemNumber);
    }
    
    /**
     * 
     * @param category
     * @param itemNumber 
     */
    public void setCategory(int category,int itemNumber){
        database.setCategory(category, itemNumber);
    }
    
    /**
     * 
     * @param itemNumber
     * @return 
     */
    public int getItemPrice(int itemNumber){
        return database.getItemPrice(itemNumber);
    }
    
    /**
     * 
     * @param price
     * @param itemNumber 
     */
    public void setItemPrice(int price, int itemNumber){
        database.setItemPrice(price, itemNumber);
    }

    /**
     * 
     * @param itemNumber
     * @return 
     */
    public int getItemQuantity(int itemNumber){
        return database.getItemQuantity(itemNumber);
    }
    
    /**
     * 
     * @param quantity
     * @param itemNumber 
     */
    public void setItemQuantity(int quantity,int itemNumber){
        database.setItemQuantity(quantity, itemNumber);
    }
    
    /**
     * 
     * @param location
     * @param itemNumber 
     */
    public void setLocation(int location, int itemNumber){
        database.setLocation(location, itemNumber);
    }    
    /**
     * 
     * @param itemNumber
     * @return 
     */
    public int getLocation(int itemNumber){
        return database.getLocation(itemNumber);
    }
    
            
    public static void main(String[] argo){
        modifyInventory test = new modifyInventory();

        InventoryModifyPopup newInv = new InventoryModifyPopup();
        newInv.setVisible(true);

        
    }

    public Object getItemCategory(int itemNumber) {
        return database.getCategory(itemNumber);
    }
    
    public String getItemDescription(int itemNumber){
        return database.getItemDescription(itemNumber);
    }
}
