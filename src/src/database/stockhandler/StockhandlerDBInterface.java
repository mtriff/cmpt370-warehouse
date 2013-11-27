package database.stockhandler;

/**
 * An interface, contains all methods to be used by Stock Handler features
 * @author Matt
 */
public interface StockhandlerDBInterface
{
    /**
     * Get all product details, using the id
     * @param productId ID of the product to get the details for
     * @return Object[] with all product details
     */
    public Object[] getProductDetails(int productId);

    /**
     * Get the bin(s) ID where the given product is stored
     * @param productId ID of the product to get the location of
     * @return Object[] containing all the locations of the product
     */
    public Object[] getProductLocation(int productId);

    /**
     * Get all the products contained in a given bin
     * @param binId ID of the bin to get all the products of
     * @return Object[] listing all the products in the specified bin
     */
    public Object[] getBinProducts(int binId);

    /**
     * Sort the items given so that an optimal path for gathering products is computed
     * @param itemsObject[] List of items to sort
     * @return Object[] of items sorted from first to gather to last to gather
     */
    public Object[] findBestPath(Object[] itemsObject[]);

    /**
     * Assigns the destination bins for an array of items
     * @param itemsObject[] List of items to be assigned a location
     * @return Object[] of items with bin numbers assigned
     */
    public Object[] assignBins(Object[] itemsObject[]);
}
