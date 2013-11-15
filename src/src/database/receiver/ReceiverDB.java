/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.receiver;

import database.MysqlDB;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Matt
 */
public class ReceiverDB implements ReceiverDBInterface {

    @Override
    public Object[] getOrderProducts(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean markOrderReceived(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setOrderStatus(int orderId, String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addItemsToOrder(int orderId, Object[] itemsList) {
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setTrackingNumber(int orderId, String trackingNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateProductQuantity(int orderId, int productId, int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] getOrderDetails(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOrderStatus(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override  
    public int addProduct(String name, int category, float price,float size, float weight) {
        System.out.println("Using addProduct");
        String query="INSERT INTO product(name, category, price, weight) VALUES ('"
                +name+"',"+category+","+price+","+weight+");"
                +"SELECT last_insert_id() AS last_id FROM product;";
        
        try {
          ResultSet results=MysqlDB.runQuery(query);

          if(results!=null)
          {
              System.out.println("Returning ID: "+results.getInt("last_id"));
              return results.getInt("last_id");
          }
        } catch (SQLException ex) {
          Logger.getLogger(ReceiverDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;
    }

    //Added by Xingze for test
    @Override
    public Object[] getProductCategories() {
        try {
            ResultSet results=MysqlDB.runQuery("SELECT name FROM prodCategory;");
 
            if(results.last())
            {
                int numResults=results.getRow();
                Object[] returnArray=new String[numResults];
                if(results.first())
                {
                    int rowCount=0;
                    while(results.next())
                    {
                        returnArray[rowCount]=results.getObject("name");
                        rowCount++;
                    }
                    
                    return returnArray;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReceiverDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }

    @Override
    public int addProductCategory(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addStock(int productID, int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
