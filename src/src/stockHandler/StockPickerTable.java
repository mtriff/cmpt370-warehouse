/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stockHandler;
import database.*;
import database.shipper.ShipperDB;
import database.stockhandler.StockhandlerDB;
import database.shipper.ShipperDBInterface;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.logging.Level;
import database.stockhandler.*;
import java.util.logging.Logger;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import sun.security.util.Length;
/**
 *
 * @author Spencer
 */
public class StockPickerTable extends JComponent {
    StockhandlerDB database=new StockhandlerDB();
    ShipperDB database2=new ShipperDB();
    
    private MessageFormat header;
    
   
     
    
     /**
     * @param palletTable
     * @return number of items loaded
     */
    public Object[][] loadTable(int orderNumber )
    {
        StockhandlerDB db =new StockhandlerDB();
            
  //      jTable1.setModel(new javax.swing.table.DefaultTableModel((Object[][]) newShipment.shipRequire(),shipmentTitle));
        Object[][] stockArray;
        stockArray = (Object[][]) db.getOrder(orderNumber);
        return stockArray;
    }
    
    /**
     *
     * @param itemNum The items inventory number
     * @param palletTable the pallet number
     * @return The object that was added
     */   
    public Object[] addItem(int itemNum, javax.swing.JTable palletTable)
    {
        DefaultTableModel model = (DefaultTableModel) palletTable.getModel();
        Object[] temp = database2.getShipmentList();
        model.addRow(database.getProductDetails(itemNum));
        return database.getProductDetails(itemNum);
    }
    
    
    
    /**
     *  Prints the table that is input
     * @param palletTable the table that is to be printed
     */
    
    public void printTable(javax.swing.JTable palletTable ) 
        {
        try {  
            palletTable.print(JTable.PrintMode.FIT_WIDTH, header, null);
        } catch (PrinterException ex) {
            Logger.getLogger(StockPickerTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
 

}
