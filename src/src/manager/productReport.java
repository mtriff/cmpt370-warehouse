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
public class productReport {
    private manageProduct ManageProduct;
    private String bestSale;
    private String mostStock;
    private String frequentMove;
    
    
    /*
    *pre all the product in the database
    *find the recently add items
    *posts return related items name
    */
    public String newAdd(){
        return null;
    }
    
    
    /*
    *pre all the product in the database
    *find the recently delete items
    *posts return related items name
    */
    public String newDelete(){
        return null;
    }
    
    
    /*
    *pre all the product in the database
    *find the best sale product in the whole warehouse
    *posts return the best sale product name
    */
    public String bestSale(){
        return null;
    }
    
    
    /*
    *pre all the product in the database
    *find the product which has maximum inventory in the whole warehouse
    *posts return the related product name
    */
    public String mostStock(){
        return null;
    }
    
    
    /*
    *pre all the employee in the database
    *find the most efficient employee in the whole warehouse
    *posts return the most efficient employee name
    */
    public String frequentMove(){
        return null;
    }
}
