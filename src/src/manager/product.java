/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author hanrongli
 */
public class product {
    private String itemName;
    private int itemQuantities;
    private String itemCategory;
    private float price;
    private float size;
    private String itemDescription;
    
    
    /*
     * constructor for product
     */
    public product(String pName, int pQuantities, String pCategory, float pPrice, float pSize, String pDescription){
        this.itemName=pName;
        this.itemQuantities=pQuantities;
        this.itemCategory=pCategory;
        this.price=pPrice;
        this.size=pSize;
        this.itemDescription=pDescription;
    }
    
    
    public String getProductName(){
        return itemName;
    }
    
    public void setProductName(String newProductName){
        this.itemName=newProductName;
    }
    
    public int getProductQuantities(){
        return itemQuantities;
    }
    
    public void setProductQuantities(int newQuantities){
        this.itemQuantities=newQuantities;
    }
    
    public String getProductCategory(){
        return itemCategory;
    }
    
    public void setProductCategory(String newCategory){
        this.itemCategory = newCategory;
    }
    
    
    public String getDescription(){
        return itemDescription;
    }
    
    public void setProductDescription(String newDescription){
        this.itemDescription=newDescription;
    }
    
    public float getProductProductPrice() {
        return price;
    }
    
    public void setProductPrice(float price) {
        this.price = price;
    }
    
    public float getProductSize() {
        return size;
    }
    
    public void setProductSize(float size) {
        this.size = size;
    }            
}
