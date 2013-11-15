/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.receiver;


/**
 *
 * @author Matt
 */
public interface ReceiverDBInterface {
    //Get all the products for the given order
    public Object[] getOrderProducts(int orderId);
    
    /**
     * Sets the status as "Received" for the given order, records the current date 
     * @param orderId ID of the order to be changed
     * @return True on success, False on failure
     */
    public boolean markOrderReceived(int orderId);
    
    /**
     * Sets the status of the order to the value as provided
     * @param orderId ID of the order to be changed
     * @param status Status of the order, must be one of: ""
     * @return 
     */
    public boolean setOrderStatus(int orderId, String status);
    
    /**
     * Adds the list of items provided to an order
     * @param orderId ID of the order to be changed
     * @param itemsList List of items to be added to the list
     * @return True on success, false on failure
     */
    public boolean addItemsToOrder(int orderId, Object[] itemsList);
    
    /** Sets the tracking number for a given shipment
     * @param orderId The order to be modified
     * @param trackingNum The tracking number to be added to the shipment
     * @return True on success, False on failure
     */
    public boolean setTrackingNumber(int orderId, String trackingNum);
    
    /**
     * Updates the quantity of items required for the shipment
     * @param orderId The order to be modified
     * @param productId The product to be modified
     * @param quantity The number to be added to the current quantity (negative to remove items)
     * @return True on success, False on failure
     */
    public boolean updateProductQuantity(int orderId, int productId, int quantity);
    
    /**
     * Get all details for an order (excluding the products in the order)
     * @param orderId The order to get the details for
     * @return Object[] containing all order details, or null on failure
     */
    public Object[] getOrderDetails(int orderId);
 
    /**
     * Get the current status for an order
     * @param orderId The order to get the status of
     * @return String of the current status of the order, or null on failure
     */
    public String getOrderStatus(int orderId);
    
    /**
     * Adds a new item to the warehouse system
     * @param name The name of the product
     * @param category ID of the category this product belongs to
     * @param price The price the product sells for
     * @param weight The weight of the item, in kilograms
     * @return The ID number of the newly added item 
     */
    public int addProduct(String name, int category, float price, float size,float weight);
    
    /**
     * Get the listing of all possible categories for a product
     * @return An Object[] containing all categories, or null on failure
     */
    public Object[] getProductCategories();
    
    /**
     * Add a new category to the list of potential categories
     * @param name The name of the category
     * @return The ID of the newly added category, or null on failure
     */
    public int addProductCategory(String name);
    
    /**
     * Increase the amount of stock for an item in the database
     * @param productID ID of the item to increase the stock of
     * @param quantity The amount to increase the stock by
     * @return true on success, false on failure
     */
    public boolean addStock(int productID, int quantity);
}