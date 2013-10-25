/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author hanrongli
 */
public class employee {
    private String employeeName;
    private String position;
    private String currentWork;
    private String nextWork;
    private int numOfWorkDone;
    
    
    /*
    * constructor for employee
    */
    public employee(String name, String position, String currentWork, String nextWork, int number){
        this.employeeName=name;
        this.position=position;
        this.currentWork=currentWork;
        this.nextWork=nextWork;
        this.numOfWorkDone=number;
    }
    
    public String getEmployeeName(){
        return employeeName;
    }
    
    public String getPosition(){
        return position;
    }
    public String getCurrentWork(){
        return currentWork;
    }
    
    public String getNextWork(){
        return nextWork;
    }
    
    public int getNumOfWorkDone(){
        return numOfWorkDone;
    }
    
    public void setEmployeeName(String newName){
        this.employeeName=newName;
    }
    
    public void setPosition(String newPosition){
        this.position=newPosition;
    }
    public void setCurrentWork(String newCurrentWork){
        this.currentWork=newCurrentWork;
    }
    
    public void setNextWork(String newNextWork){
        this.nextWork=newNextWork;
    }
    
    public void setNumOfWorkDone(int newNumer){
        this.numOfWorkDone=newNumer;
    }
}
