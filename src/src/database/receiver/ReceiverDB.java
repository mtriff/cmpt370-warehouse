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
import receiver.orderItem;


/**
 *
 * @author Matt
 */
public class ReceiverDB implements ReceiverDBInterface {

    @Override
    public boolean addItemsToOrder(int orderId, Object[] itemsList) {
            orderItem newItem=(orderItem) itemsList[0];
        
            String query="INSERT INTO product(name, category, price, size, weight) VALUES ('"
                +newItem.getItemName()+"',"+newItem.getItemCategory()+","+newItem.getPrice()+","+newItem.getSize()+","+newItem.getWeight()+");";
            System.out.println(query);
        try {
          ResultSet results=MysqlDB.runQuery(query);

          if(results!=null)
          {
              query="SELECT last_insert_id() AS last_id FROM product;";
              results=MysqlDB.runQuery(query);
              
              System.out.println("Returning ID: "+results.getInt("last_id"));
              int currId=results.getInt("last_id");
              query="INSERT INTO shipmentManifest VALUES ("+orderId+","+currId+","+newItem.getItemQuantity()+");";
              results=MysqlDB.runQuery(query);
              
              if(results!=null)
              {
                  return true;
              }
          }
        } catch (SQLException ex) {
          Logger.getLogger(ReceiverDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    @Override  
    public int addProduct(String name, int category, float price,float size, float weight) {
        //System.out.println("Using addProduct");
        String query="INSERT INTO product(name, category, price, size, weight) VALUES ('"
                +name+"',"+category+","+price+","+size+","+weight+");"
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
                    results.previous();
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


}
