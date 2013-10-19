/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.gui;

import java.sql.Array;


/**
 *
 * @author Matt
 */
public interface GuiDBInterface {
    
    /**
     * Creates a bin at the specified location
     * @param row The row that the bin is in
     * @param column The column that the bin is in
     * @return ID of the newly created bin
     */
    public int createBin(int row, int column);
    
    /**
     * Remove the bin at the specified location
     * @param id The id of the bin to be deleted
     * @return true on success, false on failure
     */
    public boolean removeBin(int id);
    
    /**
     * Get the ID of the bin at (row, column)
     * @param row The row the bin is located at
     * @param column The column the bin is located at
     * @return ID of the bin at the requested location, or null if no bin is there
     */
    public int getBinId(int row, int column);
    
    /**
     * Get the locations of all of the bins in the warehouse
     * @return Array of the (row, column) coordinates of each bin in the warehouse 
     */
    public Array getBinLocations();
}
