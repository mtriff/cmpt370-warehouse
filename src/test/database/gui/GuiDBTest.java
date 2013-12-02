/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.gui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Matt
 */
public class GuiDBTest {
    
    GuiDB database;
    
    public GuiDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        database=new GuiDB();
        boolean returned=database.createBin(100, 100);
        assert(returned);
    }
    
    @After
    public void tearDown() {
        database.removeBin(100, 100);
    }

    /**
     * Test of createBin method, of class GuiDB.
     */
    @Test
    public void testCreateBin() {
        System.out.println("createBin");
        
        boolean expResult = true;
        boolean result = database.createBin(99,99);
        assertEquals(expResult, result);
    }

    /**
     * Test of removeBin method, of class GuiDB.
     */
    @Test
    public void testRemoveBin() {
        /*Note, these tests may be skewed by your current map layout*/
        System.out.println("removeBin");
        int row = 100;
        int column = 100;
        
        boolean expResult = true;
        boolean result = database.removeBin(row, column);
        assertEquals(expResult, result);
        assertEquals(false, database.removeBin(0,0));
        assertEquals(false, database.removeBin(2, 2));
        database.createBin(100, 100);
   }

    /**
     * Test of getBinLocations method, of class GuiDB.
     */
    @Test
    public void testGetBinLocations() {
        System.out.println("getBinLocations");
        String[] result = database.getBinLocations();
        assertNotNull(result);
    }

    /**
     * Test of login method, of class GuiDB.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        int userId = 0;
        String password = "";
        int type = 0;
        
        boolean expResult = true;
        boolean result = database.login(1, "password", 1);
        assertEquals(expResult, result);
        assertEquals(false, database.login(2, "fake", 1));
        assertEquals(false, database.login(1, "badpass", 1));
        assertEquals(false, database.login(1, "password", 2));
    }

    /**
     * Test of getItemLocation method, of class GuiDB.
     */
    @Test
    public void testGetItemLocation() {
        System.out.println("getItemLocation");
        int itemId = 1;
        Integer[] expResult = new Integer[1];
        expResult[0]=2;
        Integer[] result = database.getItemLocation(itemId);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of getBinIndicesFromID method, of class GuiDB.
     */
    @Test
    public void testGetBinIndicesFromID() {
        System.out.println("getBinIndicesFromID");
        int id = 1;
        String[] result = database.getBinIndicesFromID(id);
        assertNotNull(result);
    }
}