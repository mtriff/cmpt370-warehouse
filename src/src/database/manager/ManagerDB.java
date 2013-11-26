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
    public void addEmployee(String name, int id, String title)
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
        try
        {
            MysqlDB.runQuery("UPDATE employee SET name='"+name+"' WHERE id="+employeeId+";");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }                }

    @Override
    public int getEmployeeID(String name)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/*Candidates for removal
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
*/
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
        try
        {
            MysqlDB.runQuery("UPDATE employee SET title='"+title+"' WHERE id="+employeeId+";");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }                }

/*
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

*/
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
    public void setProductName(String itemName, int itemNumber)
    {
        try
        {
            ResultSet results=MysqlDB.runQuery("UPDATE product SET name='"+itemName+"' WHERE id="+itemNumber+";");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }             
    }

    @Override
    public int getProductNumber(String itemName)
    {
        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT id FROM product WHERE name='"+itemName+"';");

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

    /* Candidate for removal
    @Override
    public void setProductNumber(int itemNumber, String itemName)
    {

    }
*/
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
        try
        {
            ResultSet results=MysqlDB.runQuery("UPDATE product SET quantity='"+quantity+"' WHERE id="+itemNumber+";");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }            
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
        return getProductName(itemNumber);
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
        setProductName(description, itemNumber);
    }

    @Override
    public void setProductSize(int itemId, float size)
    {
        try
        {
            MysqlDB.runQuery("UPDATE product SET size='"+size+"' WHERE id="+itemId+";");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }                
    }

    @Override
    public void setProductCategory(int itemId, int categoryId)
    {
        try
        {
            MysqlDB.runQuery("UPDATE product SET category='"+categoryId+"' WHERE id="+itemId+";");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }            
    }

    @Override
    public void setProductPrice(int itemId, float price)
    {
        try
        {
            MysqlDB.runQuery("UPDATE product SET price='"+price+"' WHERE id="+itemId+";");
        }
        catch (SQLException ex)
        {
            Logger.getLogger(ManagerDB.class.getName()).log(Level.SEVERE, null, ex);
        }          
    }

/*
    @Override
    public Object[] getProducts()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    @Override
    public int addProduct(String name)
    {
       return 2000;
    }

    @Override
    public Object[] getProductList() 
    {   //Number,Name,Quantity,Category,Size,Weight,Location,Price,Description
        try
        {
            ResultSet results=MysqlDB.runQuery("SELECT product.id, product.name, prodStock.onHand, product.category, product.size, product.weight, product.price, prodLocation.binID FROM product JOIN prodLocation JOIN prodStock WHERE product.id=prodLocation.id AND product.id=prodStock.id;");

            if(results.last())
            {
                int numResults=results.getRow();
                Object[][] returnArray=new Object[numResults][9];
                if(results.first())
                {
                    results.previous();
                    int rowCount=0;
                    while(results.next())
                    {
                        System.out.println(results.toString());
                        returnArray[rowCount][0]=results.getInt(1);
                        returnArray[rowCount][1]=results.getString(2);
                        returnArray[rowCount][2]=results.getInt(3);
                        returnArray[rowCount][3]=results.getInt(4);
                        returnArray[rowCount][4]=results.getFloat(5);
                        returnArray[rowCount][5]=results.getFloat(6);
                        returnArray[rowCount][6]=results.getInt(7);
                        returnArray[rowCount][7]=results.getFloat(8);
                        returnArray[rowCount][8]=results.getString(2);

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
}
