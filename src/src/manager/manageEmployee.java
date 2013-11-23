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
public class manageEmployee
{
    private ManagerDB database;
    private String[] newEmployee;
    private String name;
    private String number;
    private String title;


    public manageEmployee()
    {
        newEmployee = new String[3];
        database = new ManagerDB();
    }

    public Object[] getEmployeeList()
    {
        Object[] tempArray;
        tempArray = database.getEmployeesList();
        return tempArray;
    }

    public String[] getNew()
    {

//        newEmployee[0] = name;
//        newEmployee[1] = number;
//        newEmployee[2] = title;
        for(int i = 0; i<3; i++)
        {
            System.out.println(newEmployee[i]);
            System.out.println("*");
        }
        return newEmployee;
    }

    public void setNew(String name, String number, String title)
    {

        newEmployee[0] = new String(name);
        newEmployee[1] = new String(number);
        newEmployee[2] = new String(title);

//        this.name = name;
//        this.number = number;
//        this.title = title;

        for(int i = 0; i<3; i++)
        {
            System.out.println(newEmployee[i]);
        }
    }
}
////    public String getEmployeeName(){
////        return database.getEmployeeName();
////    }
////
////    public void setEmployeeName(String newName, int employeeID){
////        database.setEmployeeName(newName,employeeID);
////    }
////
//////    /*public int getEmployeeID(){
//////        return employeeID;
//////    }
//////
//////    public void setEmployeeID(int employeeID){
//////        this.employeeID=id;
//////    }*/
////
////    public String getTitle(int employeeID){
////        return database.getTitle();
////    }
////
////    public void setTitle(String newPosition,int employeeID ){
////        database.setTitle(newPosition,employeeID);
////    }
////
////    public String getCurrentWork(int employeeID){
////        return database.getCurrentWork(employeeID);
////    }
////
////    public void setCurrentWork(String newCurrentWork, int employeeID){
////        database.setCurrentWork(currentWork,employeeID)
////    }
////
////    public String getNextWork(int employeeID){
////        return database.getNextWork();
////    }
////
////    public void setNextWork(String newNextWork, int employeeID){
////        database.setNextWork(newNextWork,employeeID)
////    }
////
////    public int getNumOfWorkDone(int employeeID){
////        return database.getNumOfWorkDone(employeeID);
////    }
////
////    public void setNumOfWorkDone(int newNumer, int employeeID){
////        database.setNumOfWorkDone(newNumber, employeeID);
////    }
////
////
////    public Object[] getEmployeeList(){
////        Object[] tempArray;
////        tempArray = database.getEmployeeList();
////        return tempArray;
////    }
////
////    public boolean addEmployee(String name, int id, String title, String currentWork, String nextWork, int numberDone){
////        database.addEmployee(name,id, title, currnentWork, nextWork, numberDone);
////        return true;
////    }
////
////
////    public float getEmployeeSpeed(int employeeID){
////        return database.getEmployeeSpeed(employeeID);
////    }
////
//    /*
//     * pre an employee type e
//     * check the employee current working task
//     * post if the employee is busy return current working task
//     *       otherwise return "currently free"
//     */
//    public String checkWorkTask(employee e){
//        if(e.getCurrentWork()==null){
//            return "currently free";
//        }
//        return "current work condition: " + e.getCurrentWork();
//    }
//
//    /*
//     * pre an employee type e
//     * check the employee next working task
//     * post if the employee have the next work task return next working task
//     *       otherwise return "no upcoming working task"
//     */
//
//    public String checkNextTask(employee e){
//        if(e.getNextWork()==null){
//            return "no upcoming working task";
//        }
//        return "next work task: "+ e.getNextWork();
//    }
//
//
//    public String checkNumDone(int num){
//        if(e.NumOfWorkDone()<=0){
//            return 0;
//        }
//        return e.getNextWork();
//    }
//
//
//    /*
//     * pre an employee name as key to search in the system
//     * search the employee as the manager type in the UI
//     *pre return the search result
//
//     public String searchEmployee(String name){
//     return null;
//     }
//
//
//
//     /*
//     *pre all the employee in the database
//     * show a arranged list sorted by type of position(Stock Handler, Receiver, Shipper)
//
//     public void sortByPosition(){
//
//     }
//
//}
