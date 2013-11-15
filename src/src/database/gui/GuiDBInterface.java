/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.gui;


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
     * @return Object[] of the (row, column) coordinates of each bin in the warehouse 
     */
    public Object[] getBinLocations();
    
    /**
     * Performs login check
     * @param userId The id of the user being authenticated
     * @param password The password of the user being authenticated
     * @param type The type of user being authenticated (1 is Manager, 2 is Stock Handler, 3 is Receiver, 4 is Shipper)
     * @return 
     */
    public boolean login(int userId, String password, int type);
}
