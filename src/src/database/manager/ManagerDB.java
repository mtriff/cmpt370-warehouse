/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.manager;

import database.MysqlDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matt
 */
public class ManagerDB implements ManagerDBInterface
{

    @Override
    public Object[] getEmployeesList()
    {
         try
        {
            ResultSet results=MysqlDB.runQuery("SELECT * FROM employees;");

            if(results.last())
            {
                int numResults=results.getRow();
                Object[][] returnArray=new Object[numResults][3];
                if(results.first())
                {
                    results.previous();
                    int rowCount=0;
                    while(results.next())
                    {

                        System.out.println(results.toString());
                        returnArray[rowCount][0]=results.getInt(1);
                        returnArray[rowCount][1]=results.getString(2);
                        returnArray[rowCount][2]=results.getString(3);

                        rowCount++;
                    }

                    return returnArray;
                }
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }



    @Override
    public void addEmployee(String name, int id,String title, String currentWork, String nextWork, int number)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getEmployeeName(int employeeId)
    {
         try
        {
            ResultSet results=MysqlDB.runQuery("SELECT name FROM employees WHERE id="+employeeId+";");

            if(results.last())
            {
                return results.getString(1);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;     
    }

    @Override
    public void setEmployeeName(String name,int employeeId)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getEmployeeID(String name)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmployeeID(String name,int employeeId)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getEmployeeSpeed(int employeeId)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEmployeeSpeed(float speed,int employeeId)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTitle(int employeeId)
    {
       try
        {
            ResultSet results=MysqlDB.runQuery("SELECT title FROM employees WHERE id="+employeeId+";");

            if(results.last())
            {
                return results.getString(1);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;     
    }

    @Override
    public void setTitle(String title,int employeeId)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public String getCurrentWork(int employeeId)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setCurrentWork(String currentWork, int employeeId)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getNextWork(int employeeId)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNextWork(String nextWork, int employeeId)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getNumofWorkDone(int employeeId)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setNumofWorkDone(int num ,int employeeId)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    //edit by Rongli Han
    @Override
    public int addProductForList(String pName, int pQuantities, String pCategory, float pPrice, float pSize, String pDescription)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    // added by Xingze
    @Override
    public String getProductName(int itemNumber)
    {

        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT name FROM product WHERE id="+itemNumber+";");

            if(results.last())
            {
                return results.getString(1);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;     
    }

    @Override
    public void setProductName(String name, int itemNumber)
    {

    }

    @Override
    public int getProductNumber(String itemName)
    {
        // for test modify inventory
        if(itemName.compareTo("apple")==0)
            return 1;
        else if(itemName.compareTo("banana")==0)
            return  2;
        else
            return -1;
    }

    @Override
    public void setProductNumber(int itemNumber, String itemName)
    {

    }

    @Override
    public float getProductPrice(int itemNumber)
    {
        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT price FROM product WHERE id="+itemNumber+";");

            if(results.last())
            {
                return results.getFloat(1);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;     
    }

    @Override
    public int getProductQuantity(int itemNumber)
    {
        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT onHand FROM prodStock WHERE id="+itemNumber+";");

            if(results.last())
            {
                return results.getInt(1);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;     
    }

    @Override
    public void setProductQuantity(int quantity, int itemNumber)
    {

    }

    @Override
    public void setLocation(int location, int itemNumber)
    {

    }

    @Override
    public int getLocation(int itemNumber)
    {
        // for test modify inventory
        if(itemNumber == 1)
            return 1010;
        else if(itemNumber == 2)
            return  2020;
        else
            return -1;
    }

    @Override
    public int getCategory(int itemNumber)
    {

        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT category FROM product WHERE id="+itemNumber+";");

            if(results.last())
            {
                return results.getInt(1);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;     
    }

    @Override
    public String getProductDescription(int itemNumber)
    {
        // for test modify inventory
        if(itemNumber == 1)
            return "100";
        else if(itemNumber == 2)
            return "200";
        else
            return "";
    }

    @Override
    public float getProductSize(int itemNumber)
    {

        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT size FROM product WHERE id="+itemNumber+";");

            if(results.last())
            {
                return results.getFloat(1);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;     
    }

    @Override
    public float getProductWeight(int itemNumber)
    {

        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT weight FROM product WHERE id="+itemNumber+";");

            if(results.last())
            {
                return results.getFloat(1);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return -1;     
    }

    @Override
    public void setProductDescription(int itemNumber, String description)
    {
        //      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setProductSize(int itemId, float size)
    {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public void setProductCategory(int itemId, int categoryId)
    {
        //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    @Override
    public void setProductPrice(int itemId, float price)
    {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public Object[] getProducts()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int addProduct(String name, int category, float price, float weight)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] getProductList() 
    {   //Number,Name,Quantity,Category,Size,Weight,Location,Price,Description
        Object[][] returnArr=new Object[][]{
                {1,"Apple","20","Food","20","30","0105","100","Fruit"},
                {2,"Banana","15","Food","30","40","0205","100","Fruit"},
                {3,"Orange","35","Food","40","50","0305","100","Fruit"}
        };
        return returnArr;
    }
}
