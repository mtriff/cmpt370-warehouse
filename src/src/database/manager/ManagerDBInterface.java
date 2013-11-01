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
    public boolean setTitle(int employeeId);
    
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
}
