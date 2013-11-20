/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author hanrongli
 */
public class employee
{
    private String employeeName;
    private int employeeID;
    private String title;
    private String currentWork;
    private String nextWork;
    private int numOfWorkDone;


    /*
     * constructor for employee
     */
    public employee(String name, int id,String title, String currentWork, String nextWork, int number)
    {
        this.employeeName=name;
        this.employeeID=id;
        this.title=title;
        this.currentWork=currentWork;
        this.nextWork=nextWork;
        this.numOfWorkDone=number;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public void setEmployeeName(String newName)
    {
        this.employeeName=newName;
    }

    public int getID()
    {
        return employeeID;
    }

    public void setID(int id)
    {
        this.employeeID=id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String newPosition)
    {
        this.title=newPosition;
    }

    public String getCurrentWork()
    {
        return currentWork;
    }

    public void setCurrentWork(String newCurrentWork)
    {
        this.currentWork=newCurrentWork;
    }

    public String getNextWork()
    {
        return nextWork;
    }

    public void setNextWork(String newNextWork)
    {
        this.nextWork=newNextWork;
    }

    public int getNumOfWorkDone()
    {
        return numOfWorkDone;
    }

    public void setNumOfWorkDone(int newNumer)
    {
        this.numOfWorkDone=newNumer;
    }

}
