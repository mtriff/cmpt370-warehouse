/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.reporting;

import java.sql.Array;

/**
 *
 * @author Matt
 */
public interface ReportingDBInterface {
    
    /**
     * Get a list of all the products and their full information
     * @return Array of products in the warehouse system, or null on failure
     */
    public Array getProductList();
    
    /**
     * Get a list of all the product orders and their full information
     * @return An array of the product orders
     */
    public Array getProductOrderList();
    
    /**
     * Get a list of product orders that occurred between date1 and date2 and their full information
     * @param date1 The earliest date in the range
     * @param date2 The latest date in the range
     * @return An array of the product orders
     */
    public Array getProductOrdersWithin(String date1, String date2);
    
    /**
     * Get a list of all the shipments and their full information
     * @return An array of the shipments
     */
    public Array getShipmentList();
    
    /**
     * Get a list of shipments that occurred between date1 and date2 and their full information
     * @param date1 The earliest date in the range
     * @param date2 The latest date in the range
     * @return An array of the shipments
     */
    public Array getShipmentWithin(String date1, String date2);
    
    /**
     * Get the information for the stock level for each of the bins in the warehouse
     * @return All the stock information for the warehouse
     */
    public Array getBinStockLevels();
    
    
    /**
     * Get the information for how fast each product moves in and out of the warehouse
     * @return A list with each item's basic information and the speed that it moves in and out of the warehouse
     */
    public Array getProductTurnoverSpeed();
}
