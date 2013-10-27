/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;
import java.sql.Array;

/**
 *
 * @author hanrongli
 */
public class manageEmployee {
    private employee Employee;
    
    /*
     * per an employee type e
     * check the employee current working task
     * post if the employee is busy return current working task
     *       otherwise return "currently free"
     */
    public String checkWorkTask(employee e){
        if(e.getCurrentWork()==null){
            return "currently free";
        }
        return "current work condition: " + e.getCurrentWork();
    }
    
    /*
     * pre an employee type e
     * check the employee next working task
     * post if the employee have the next work task return next working task
     *       otherwise return "no upcoming working task"
     */
    
    public String checkNextTask(employee e){
        if(e.getNextWork()==null){
            return "no upcoming working task";
        }
        return "next work task: "+ e.getNextWork();
    }
    
    /*
     * param manager type in newPosition
     * change the employee position
     */
    public void changePosition(String newPosition){
        Employee.setPosition(newPosition);
    }
    
    /*
     * param manager type in newWorkTask
     * change the employee current work task
     */
    public void changeWorkTask(String newWorkTask){
        Employee.setCurrentWork(newWorkTask);
    }
    
    
    /*
     * param manager type in newNextWork
     * change the employee next work task
     */
    public void changeNextTask(String newNextWork){
        Employee.setNextWork(newNextWork);
    }
    
    /*
     * pre an employee name as key to search in the system
     * search the employee as the manager type in the UI
     *pre return the search result
     */
    public String searchEmployee(String name){
        return null;
    }
    
    
    
    /*
     *pre all the employee in the database
     * show a arranged list sorted by type of position(Stock Handler, Receiver, Shipper)
     */
    public void sortByPosition(){
        
    }
    
}
