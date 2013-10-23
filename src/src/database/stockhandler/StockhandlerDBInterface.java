package database.stockhandler;

import java.sql.Array;

/**
 * An interface, contains all methods to be used by Stock Handler features
 * @author Matt
 */
public interface StockhandlerDBInterface {
    /**
     * Get all product details, using the id
     * @param productId ID of the product to get the details for
     * @return Array with all product details
     */
    public Array getProductDetails(int productId);
    
    /**
     * Get the bin(s) ID where the given product is stored
     * @param productId ID of the product to get the location of
     * @return Array containing all the locations of the product
     */
    public Array getProductLocation(int productId);
    
    /**
     * Get all the products contained in a given bin
     * @param binId ID of the bin to get all the products of
     * @return Array listing all the products in the specified bin
     */
    public Array getBinProducts(int binId);

    /**
     * Sort the items given so that an optimal path for gathering products is computed
     * @param itemsArray List of items to sort
     * @return Array of items sorted from first to gather to last to gather
     */
    public Array findBestPath(Array itemsArray);
    
    /**
     * Assigns the destination bins for an array of items
     * @param itemsArray List of items to be assigned a location
     * @return Array of items with bin numbers assigned
     */
    public Array assignBins(Array itemsArray);
}
