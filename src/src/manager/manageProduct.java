/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;
import database.manager.ManagerDB;


/**
 *
 * @author hanrongli
 */
public class manageProduct
{

    private ManagerDB database;


    public manageProduct()
    {
        database =new ManagerDB();
    }


    /**
     *
     * @param itemNumber
     * @return
     */

    public String getItemName(int itemNumber)
    {
        return database.getProductName(itemNumber);
    }

    /**
     *
     * @param name
     * @param itemNumber
     */
    public void setItemName(String name, int itemNumber)
    {
        database.setProductName(name, itemNumber);
    }

    /**
     *
     * @param itemName
     * @return
     */
    public int getItemNumber(String itemName)
    {
        return database.getProductNumber(itemName);
    }

    /**
     *
     * @param itemNumber
     * @param itemName
     */
    public void setItemNumber(int itemNumber, String itemName)
    {
        //Not to be implemented (Item number is SET by the database
        //database.setProductNumber(itemNumber, itemName);
    }


    /**
     *
     * @param itemNumber
     * @return
     */
    public float getItemPrice(int itemNumber)
    {
        return database.getProductPrice(itemNumber);
    }

    /**
     *
     * @param price
     * @param itemNumber
     */
    public void setItemPrice(int price, int itemNumber)
    {
        database.setProductPrice(price, itemNumber);
    }

    /**
     *
     * @param itemNumber
     * @return
     */
    public int getItemQuantity(int itemNumber)
    {
        return database.getProductQuantity(itemNumber);
    }

    /**
     *
     * @param quantity
     * @param itemNumber
     */
    public void setItemQuantity(int quantity,int itemNumber)
    {
        database.setProductQuantity(quantity, itemNumber);
    }

    /**
     *
     * @param itemNumber
     * @return
     */
    public int getLocation(int itemNumber)
    {
        return database.getLocation(itemNumber);
    }

    /**
     *
     * @param location
     * @param itemNumber
     */
    public void setLocation(int location, int itemNumber)
    {
        database.setLocation(location, itemNumber);
    }


    /**
     *
     * @param itemNumber
     * @return
     */
    public Object getItemCategory(int itemNumber)
    {
        return database.getCategory(itemNumber);
    }

    /**
     *
     * @param category
     * @param itemNumber
     */
    public void setItemCategory(int category,int itemNumber)
    {
        database.setProductCategory(category, itemNumber);
    }


    /**
     *
     * @param itemNumber
     * @return
     */
    public String getItemDescription(int itemNumber)
    {
        return database.getProductDescription(itemNumber);
    }

    /**
     *
     * @param description
     * @param itemNumber
     */
    public void setItemDescription (int itemNumber,String description)
    {
        database.setProductDescription(itemNumber,description);
    }


    public Object[] getProductList()
    {
        Object[] tempArray;
        tempArray = database.getProductList();
        return tempArray;
    }


    /*
     *param name: a String, price: a float, quantities: an integer, itemNum: an integer, description: a String
     *add a new product into the management system
     */
<<<<<<< HEAD
    public boolean addProduct(String name, int quantities, String category, float price, float size, String description){
=======
    public boolean addProduct(String name, int quantities, String category, float price, float size, String description)
    {
>>>>>>> master
        database.addProductForList(name,quantities,category,price, size, description);
        return true;
    }


    public void deleteProduct(Object valueAt) {
        database.deleteProduct((int) valueAt);
    }




}
