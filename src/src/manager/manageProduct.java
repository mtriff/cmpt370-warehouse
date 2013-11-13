/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;
import database.manager.ManageProductDB;


/**
 *
 * @author hanrongli
 */
public class manageProduct {
    
    private ManageProductDB database;
    private product Product;
    
    /*
     *param name: a String, price: a float, quantities: an integer, itemNum: an integer, description: a String
     *add a new product into the management system
     */
    
    public Object[] getProductList(){
        Object[] tempArray;
        tempArray = database.getProductList();
        return tempArray;
    }
    
    public boolean addProduct(String name, int quantities, String category, float price, float size, String description){
        Product=new product(name,quantities,category,price, size, description);
        return true;
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
        Product.setProductQuantities(newQuantities);
    }
    
    /*
     * param: manager type in newQuantities
     * change the product quantities
     */
    public void changeCategory(String newProductCategory){
        Product.setProductCategory(newProductCategory);
    }
    
    /*
     * param: manager type in newDescription
     * change the product description
     */
    public void changeProductDescription(String newDescriptioin){
        Product.setProductDescription(newDescriptioin);
    }
    
    
    /*
     * pre a product name as key to search in the system
     * search the product as the manager type in the UI
     *pre return the search result
     
     public String searchProduct(String name){
     return "";
     }
     
     
     /*
     *pre param:all the product in the database
     * show a arranged list sorted by price from low to high
     
     public void sortByPrice(){
     
     }
     
     /*
     *pre param:all the product in the database
     * show a arranged list sorted by product number in increase order
     
     public void sortByItemNum(){
     
     }*/
    
}
