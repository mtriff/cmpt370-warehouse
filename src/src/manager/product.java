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
    private String productName;
    private float productPrice;
    private int quantities;
    private int productNum;
    private String description;
    
    
    /*
    * constructor for product
    */
    public product(String pName, float pPrice, int pQuantities, int pNum, String pDescription){
        this.productName=pName;
        this.productPrice=pPrice;
        this.quantities=pQuantities;
        this.productNum=pNum;
        this.description=pDescription;
    }

    
    public String getProductName(){
        return productName;
    }
    
    public float getProductPrice(){
        return productPrice;
    }
    
    public int getProductQuantities(){
        return quantities;
    }
    
    public int getProductNum(){
        return productNum;
    }
    
    public String getDescription(){
        return description;
    }
    
    public void setProductName(String newProductName){
        this.productName=newProductName;
    }

    
    public void setProductPrice(float newProductPrice){
        this.productPrice=newProductPrice;
    }
    
    public void setProductQuan(int newQuantities){
        this.quantities=newQuantities;
    }
    
    public void setProductNum(int newProductNum){
        this.productNum=newProductNum;
    }
    
    public void setDescription(String newDescription){
        this.description=newDescription;
    }
            
}
