/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manager;

import database.manager.ManagerDB;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ronglihan
 */

//test for manageEmployee

public class ManagerJUnitTest {
    
    public ManagerJUnitTest() {
    }
    private manageEmployee mEmployee;
    private String[] newEmployee;
    private ManagerDB database;
    
    
    private manageProduct mProduct;
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        newEmployee = new String[3];
        database = new ManagerDB();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    
    
     //test for manageEmployee
     @Test
     public void testGetEmployeeList() {
         System.out.println("getEmployeeList");
         Object[] expectedArray=null;
         //manageEmployee mEmployee=new manageEmployee();
         //ManagerDB managerDB = new ManagerDB();
         expectedArray=database.getEmployeesList();
         assertArrayEquals(expectedArray,mEmployee.getEmployeeList());
         
     }
     
     @Test
     public void testGetNew() {
         System.out.println("getNew");
         assertArrayEquals(newEmployee,mEmployee.getNew());
     }
     
     
     @Test
     public void testSetNew() {
         System.out.println("setNew");
         String name= "Tom";
         String number= "4";
         String title="Manager";
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         mEmployee.setNew(name,number,title);
         assertArrayEquals(expectedArray,mEmployee.getEmployeeList());
     }
     
     @Test
     public void testDeleteEmployee(){
         System.out.println("Test deleteEmployee");
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         mEmployee.deleteEmployee(this);
         assertArrayEquals(expectedArray,mEmployee.getEmployeeList());
     }
     
     //test for manageProduct
     public void testGetProductList(){
         System.out.println("getProductList");
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         assertArrayEquals(expectedArray,mEmployee.getEmployeeList());
     }
     
     public void testAddProduct(){
         System.out.println("Test AddProduct");
         String name="iPad";
         int quantities=100;
         String catagory="3";
         float price=100;
         float size=10;
         mProduct.addProduct(name, quantities, catagory, price, size, catagory);   
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         assertArrayEquals(expectedArray,mEmployee.getEmployeeList());
     }
   
     
     public void testDeleteProduct(){
         System.out.println("Test deleteProduct");
         Object[] expectedArray=null;
         expectedArray=database.getEmployeesList();
         mEmployee.deleteEmployee(this);
         assertArrayEquals(expectedArray,mEmployee.getEmployeeList());
         
     }
     
}
