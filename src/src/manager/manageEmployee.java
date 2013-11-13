/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;
import database.manager.ManagerDB;

/**
 *
 * @author hanrongli
 */
public class manageEmployee {
    private Manager database;
    
    
    
    public String getEmployeeName(){
        return database.
    }
    
    public void setEmployeeName(String newName){
        this.employeeName=newName;
    }
    
    public int getID(){
        return employeeID;
    }
    
    public void setID(int id){
        this.employeeID=id;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String newPosition){
        this.title=newPosition;
    }
    
    public String getCurrentWork(){
        return currentWork;
    }
    
    public void setCurrentWork(String newCurrentWork){
        this.currentWork=newCurrentWork;
    }
    
    public String getNextWork(){
        return nextWork;
    }
    
    public void setNextWork(String newNextWork){
        this.nextWork=newNextWork;
    }
    
    public int getNumOfWorkDone(){
        return numOfWorkDone;
    }
    
    public void setNumOfWorkDone(int newNumer){
        this.numOfWorkDone=newNumer;
    }
    
    
    
    
    public Object[] getEmployeeList(){
        Object[] tempArray;
        tempArray = database.getEmployeeList();
        return tempArray;
    }
    
    public boolean addEmployee(String name, int id, String title, String currentWork, String nextWork, int numberDone){
        database.addEmployee(name,id, title, currnentWork, nextWork, numberDone);
        return true;
    }
    
    
    public float getEmployeeSpeed(int employeeID){
        return database.getEmployeeSpeed(employeeID);
    }
    
    /*
     * pre an employee type e
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
    
    
    public String checkNumDone(int num){
        if(e.NumOfWorkDone()<=0){
            return 0;
        }
        return e.getNextWork();
    }
    
    /*
     * param manager type in newPosition
     * change the employee position
     */
    public void changeTitle(String newTitle){
        Employee.setTitle(newTitle);
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
     
     public String searchEmployee(String name){
     return null;
     }
     
     
     
     /*
     *pre all the employee in the database
     * show a arranged list sorted by type of position(Stock Handler, Receiver, Shipper)
     
     public void sortByPosition(){
     
     }
     
}
