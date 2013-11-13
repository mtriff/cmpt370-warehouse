/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.manager;

/**
 *
 * @author Matt
 */
public interface ManagerDBInterface {
    
    /**
     * Gets the list of all employees
     * @return An array containing all employees in the system, or null on failure
     */
    public Object[] getEmployees();
    
    /**
     * Get the average speed of the employee in performing their tasks
     * @param employeeId The ID of the employee to check
     * @return The speed of the employee, or null on failure
     */
    public float getEmployeeSpeed(int employeeId);
          
    /**
     * Add an employee to the company
     * @param name The name of the employee
     * @return The ID assigned to the new employee
     */
    public int addEmployee(String name);
            
    
    /**
     * Change the title of an employee
     * @param employeeId The ID of the employee whose title we will update
     * @return True on success, False on failure
     */
    public boolean setTitle(int employeeId, String title);
    
    /**
     * 
     * @param employeeId
     * @param name
     * @return 
     */
    public boolean setEmployeeName(int employeeId, String name);
    
   /**
    * Creates a new (empty) order with the current date
    * @return The ID of the newly created order
    */
    public int createOrder();
    
    /**
     * Adds a data point using the time provided, to the average time the employee
     * takes for their tasks
     * @param employeeId ID of the employee to add the data point to 
     * @param time Time in seconds
     * @return The updated average after the addition of the new data point
     */
    public float addSpeedDatapoint(int employeeId, float time);
    
    
    /**
     * 
     * @param itemNumber
     * @return 
     */
    public String getProductName(int itemNumber);
    
    /**
     * 
     * @param name
     * @param itemNumber 
     */
    public void setProductName(String name, int itemNumber);
    
    /**
     * 
     * @param itemName
     * @return 
     */
    public int getProductNumber(String itemName);
    
    /**
     * 
     * @param itemNumber
     * @param itemName 
     */
    public void setProductNumber(int itemNumber, String itemName);

    /**
     * 
     * @param description
     * @param itemNumber 
     */
    public void setProductDescription (int itemNumber, String description);
    
    /**
     * 
     * @param itemId
     * @param size 
     */
    public void setProductSize(int itemId, float size);
    
    /**
     * 
     * @param itemNumber
     * @return 
     */
    public String getProductDescription(int itemNumber);
    /**
     * 
     * @param category
     * @param itemNumber
     * @return 
     */
    public void setProductCategory(int itemId, int categoryId);

    /**
     * 
     * @param itemNumber
     * @return 
     */
    public int getProductPrice(int itemNumber);
    
    /**
     * 
     * @param price
     * @param itemNumber 
     */
    public void setProductPrice(int itemId, float price);

    /**
     * 
     * @param itemNumber
     * @return 
     */
    public int getProductQuantity(int itemId);
    
    /**
     * 
     * @param quantity
     * @param itemNumber
     * @return 
     */
    public void setProductQuantity(int itemId, int quantity);
    
    /**
     * 
     * @param location
     * @param itemNumber 
     */
    public void setLocation(int location, int itemNumber);
    
    /**
     * 
     * @param itemNumber
     * @return 
     */
    public int getLocation(int itemNumber);
    
    
    /**
     * 
     * @param itemNumber
     * @return 
     */
    public int getCategory(int itemNumber);
    
    /**
     * 
     * @param itemNumber
     * @return 
     */
    public float getProductSize(int itemNumber);
    
   /**
    * 
    * @param itemNumber
    * @return 
    */
    public float getProductWeight(int itemNumber);
    
    /**
     * 
     * @return List of products
     */
    public Object[] getProducts();
    
    /**
     * Adds a new item to the warehouse system
     * @param name The name of the product
     * @param category ID of the category this product belongs to
     * @param price The price the product sells for
     * @param weight The weight of the item, in kilograms
     * @return The ID number of the newly added item 
     */
    public int addProduct(String name, int category, float price, float weight);    
    
}
