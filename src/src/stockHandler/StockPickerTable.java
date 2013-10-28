/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stockHandler;
import database.*;
import database.stockhandler.StockhandlerDB;
import java.awt.*;
import java.awt.event.*;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import java.util.logging.Level;

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
    
    
    private MessageFormat header;
    private JTable jTable2;
    
   
    //select * from PalletTable where completed = NULL
    //create a new table for every instance of a non-completed pallet

       
    
     /**
     * @param palletTable
     * @return
     */
    public int loadTable(javax.swing.JTable palletTable )
    {
        for (int i = 0; i <= 5 /*database.getLength*/; i++)
        {
            addItem(i, palletTable);
        }
            
        
        return 5 /*database.getLength*/;
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
        model.addRow(database.getProductDetails(itemNum));
        return database.getProductDetails(itemNum);
    }
    
   
    /*
            Prints off the table
    */

    /**
     *
     * @param palletTable
     * @return the 
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
