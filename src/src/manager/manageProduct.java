/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import java.sql.Array;

/**
 *
 * @author hanrongli
 */
public class manageProduct {
    
    private product Product;
    
    /*
    *param name: a String, price: a float, quantities: an integer, itemNum: an integer, description: a String
    *add a new product into the management system
    */
    public void addProduct(String name, float price, int quantities, int itemNum, String description){
        Product.setProductName(name);
        Product.setProductPrice(price);
        Product.setProductQuan(quantities);
        Product.setProductNum(itemNum);
        Product.setDescription(description);   
    }
    
    /*
    * param manager type in newPrice
    * change the product price
    */
    public void changePirce(float newPrice){
        Product.setProductPrice(newPrice);
    }
    
    /*
    * param: manager type in newQuantities
    * change the product quantities
    */
    public void changeQuantities(int newQuantities){
        Product.setProductQuan(newQuantities);
    }
    
     /*
    * param: manager type in newQuantities
    * change the product quantities
    */
    public void changeNumber(int newProductNum){
        Product.setProductNum(newProductNum);
    }
    
    /*
    * param: manager type in newDescription
    * change the product description
    */
    public void changeDescription(String newDescriptioin){
        Product.setDescription(newDescriptioin);
    }
    
    /*
    * pre a product name as key to search in the system
    * search the product as the manager type in the UI
    *pre return the search result
    */
    public String searchProduct(String name){
        return "";
    }
    
    /*
    *pre all the product in the database
    *find the best sale product in the whole warehouse
    *posts return the best sale product name
    */
    public String bestSale(){
        return "";
    }

    /*
    *pre param:all the product in the database
    * show a arranged list sorted by price from low to high
    */
    public void sortByPrice(){
        
    }
    
    /*
    *pre param:all the product in the database
    * show a arranged list sorted by product number in increase order
    */
    public void sortByItemNum(){
        
    }
    
}
