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
    public Object[] getEmployeesList();
    
    
    /**
     * Add an employee to the company
     * @param name The name of the employee
     * @param id
     * @param title
     * @param currentWork
     * @param nextWork
     * @param number
     * @return The ID assigned to the new employee
     */
    public void addEmployee(String name, int id,String title, String currentWork, String nextWork, int number);
    
    
    public String getEmployeeName(int employeeId);
    
    
    public void setEmployeeName(String name,int employeeId);
    
    /**
     * Get the average speed of the employee in performing their tasks
     * @param employeeId The ID of the employee to check
     * @return The speed of the employee, or null on failure
     */
    public float getEmployeeSpeed(int employeeId);
    
    public void setEmployeeSpeed(float speed,int employeeId);
    
    public String getTitle(int employeeId);
    
    /**
     * Change the title of an employee
     * @param title
     * @param employeeId The ID of the employee whose title we will update
     * @return True on success, False on failure
     */
<<<<<<< HEAD
<<<<<<< HEAD
    public boolean setTitle(int employeeId, String title);
=======
    public void setTitle(String title,int employeeId);
>>>>>>> database
    
    /**
     * Creates a new (empty) order with the current date
     * @return The ID of the newly created order
     */
<<<<<<< HEAD
    public boolean setEmployeeName(int employeeId, String name);
=======
    public void setTitle(String title,int employeeId);
>>>>>>> manager
    
    /**
     * Creates a new (empty) order with the current date
     * @return The ID of the newly created order
     */
=======
>>>>>>> database
    
    /**
     * Creates a new (empty) order with the current date
     * @param employeeId
     * @return The ID of the newly created order
     */
    public String getCurrentWork(int employeeId);
    
    public void setCurrentWork(String currentWork, int employeeId);
<<<<<<< HEAD
    
    public String getNextWork(int employeeId);
    
    public void setNextWork(String nextWork, int employeeId);
    
    public int getNumofWorkDone(int employeeId);
    
    public void setNumofWorkDone(int num ,int employeeId);
    
    
    
=======
    
    public String getNextWork(int employeeId);
    
    public void setNextWork(String nextWork, int employeeId);
    
    public int getNumofWorkDone(int employeeId);
    
    public void setNumofWorkDone(int num ,int employeeId);
    
    
    
>>>>>>> database
    //public int addProduct(String pName, int pQuantities, String pCategory, float pPrice, float pSize, String pDescription);
    
    
    //Product
    
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
<<<<<<< HEAD
<<<<<<< HEAD

=======
    
>>>>>>> manager
=======
    
>>>>>>> database
    /**
     *
     * @param description
     * @param itemNumber
     */
    public void setProductDescription (int itemNumber, String description);
    
    /**
<<<<<<< HEAD
<<<<<<< HEAD
     * 
     * @param itemId
     * @param size 
=======
     *
     * @param itemId
     * @param size
>>>>>>> manager
=======
     *
     * @param itemId
     * @param size
>>>>>>> database
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
<<<<<<< HEAD
<<<<<<< HEAD

=======
    
>>>>>>> manager
=======
    
>>>>>>> database
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
<<<<<<< HEAD
<<<<<<< HEAD

=======
    
>>>>>>> manager
=======
    
>>>>>>> database
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
<<<<<<< HEAD
<<<<<<< HEAD
     * 
=======
     *
>>>>>>> database
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
<<<<<<< HEAD
     * 
=======
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
>>>>>>> manager
=======
     *
>>>>>>> database
     * @return List of products
     */
    public Object[] getProducts();
    
    /**
     * Adds a new item to the warehouse system
     * @param name The name of the product
     * @param category ID of the category this product belongs to
     * @param price The price the product sells for
     * @param weight The weight of the item, in kilograms
<<<<<<< HEAD
<<<<<<< HEAD
     * @return The ID number of the newly added item 
=======
     * @return The ID number of the newly added item
>>>>>>> database
     */
    public int addProduct(String name, int category, float price, float weight);
    
    public Object[] getProductList();
    
<<<<<<< HEAD
}
=======
     * @return The ID number of the newly added item
     */
    public int addProduct(String name, int category, float price, float weight);
    
    public Object[] getProductList();
    
}
>>>>>>> manager
=======
}
>>>>>>> database
