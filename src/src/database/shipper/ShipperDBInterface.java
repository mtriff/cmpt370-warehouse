/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.shipper;
/**
 * An interface, contains all methods to be used by Shipping features
 * @author Matt
 */
public interface ShipperDBInterface {    
    
    /**
     * Get a list of all the shipments and their full information
     * @return An array of the shipments
     */
    public Object[] getShipmentList();
    
    /**
     * Get a list of all the shipments that have not been sent with their full 
     * information
     * @return An array of the shipments
     */
    public Object[] getPendingShipmentList();
    
    /**
     * Get all the details for a shipment (excludes products)
     * @param shipmentId ID of the shipment to get the details for
     * @return An Object[] of all the details of the shipment (excluding products)
     */
     public Object[] getShipmentDetails(int shipmentId);
    
     /**
      * Get all of the items requested for a shipment
      * @param shipmentId ID of the shipment to get the details for
      * @return An Object[] of all the products from the shipment
      */
    public Object[] getShipmentProducts(int shipmentId);

    /**
     * Get the current status of the shipment
     * @param shipmentId ID of the shipment to get the status for
     * @return The status of the shipment, or null on failure
     */
    public String getShipmentStatus(int shipmentId);

    /**
     * Get the weight of the shipment
     * @param shipmentId ID of the shipment to get the weight for
     * @return The weight of the shipment, in kilograms
     */
    public float getShipmentWeight(int shipmentId);
    
    /**
     * Create a new shipment, returns the new shipments ID
     * @param destination The full address for the shipment
     * @return The newly assigned ID of the shipment on success, null on failure
     */
    public int createShipment(String destination);
    
    /**
     * Adds the list of products to the shipment
     * @param itemList The list of items to be added to the shipment
     * @return true on success, false on failure
     */
    public boolean addItemsToShipment(Object[] itemList);
    
    /**
     * Set the status for a shipment
     * @param shipmentId ID of the shipment to set the status
     * @param status The status to be set
     * @return true on success, false on failure
     */
    public boolean setShipmentStatus(int shipmentId, String status);
    
    /**
     * Sets the send date of a shipment to the current date
     * @param shipmentId ID of the shipment to change the status to "Shipped"
     * @return true on success, false on failure
     */
    public boolean markShipmentSent(int shipmentId);
    
    /**
     * Sets the shipment date the shipment was sent
     * @param shipmentId ID of the shipment to set the date on
     * @param date Date the product was shipped, in "" date format
     * @return true on success, false on failure
     */
    public boolean setShipmentDate(int shipmentId, String date);
    
    /**
     * Changes the destination for the shipment
     * @param shipmentId ID of the shipment to set the destination
     * @param destination Full address of the new destination for the shipment
     * @return true on success, false on failure
     */
    public boolean setShipmentDestination(int shipmentId, String destination);
    
    /**
     * Updates the quantity of items required for the shipment
     * @param shipmentId ID of the shipment to update the quantity
     * @param productId ID of the product that will be updated
     * @param quantity The amount to change the quantity by (positive or negative)
     * @return true on success, false on failure
     */
    public boolean updateProductQuantity(int shipmentId, int productId, int quantity);
    
    /**
     * Sets the tracking number for a given shipment
     * @param shipmentId The shipment to be modified
     * @param trackingNum The tracking number to be added to the shipment
     * @return True on success, False on failure
     */
    public boolean setTrackingNumber(int shipmentId, String trackingNum);
    
    /**
     * Decreases the stock of an item in the warehouse
     * @param productID The ID of the item to change the stock of
     * @param quantity The amount to lower the stock by
     * @return true on success, false on failure
     */
    public boolean decreaseStock(int productID, int quantity);
    
    /**
     * Returns a listing of all stock pickers
     * @return an array that includes employee number and name
     */
    public Object[] getStockHandlers();
}
