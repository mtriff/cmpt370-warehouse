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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createBin method, of class GuiDB.
     */
    @Test
    public void testCreateBin() {
        System.out.println("createBin");
        GuiDB instance = new GuiDB();
        boolean expResult = false;
        boolean result = instance.createBin(-1, -1);
        assertEquals(expResult, result);
        result=instance.createBin(1,1);
        assertEquals(true, result);
        result=instance.createBin(1, 1);
        assertEquals(false, result);        
        assertEquals(true, instance.createBin(2,2));
    }

    /**
     * Test of removeBin method, of class GuiDB.
     */
    @Test
    public void testRemoveBin() {
        System.out.println("removeBin");
        int row = 0;
        int column = 0;
        GuiDB instance = new GuiDB();
        boolean expResult = false;
        boolean result = instance.removeBin(row, column);
        assertEquals(expResult, result);
        assertEquals(false, instance.removeBin(0,0));
        assertEquals(true, instance.removeBin(2, 2));
   }

    /**
     * Test of getBinLocations method, of class GuiDB.
     */
    @Test
    public void testGetBinLocations() {
        System.out.println("getBinLocations");
        GuiDB instance = new GuiDB();
        String[] expResult = null;
        String[] result = instance.getBinLocations();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        GuiDB instance = new GuiDB();
        boolean expResult = true;
        boolean result = instance.login(1, "password", 1);
        assertEquals(expResult, result);
        assertEquals(false, instance.login(2, "fake", 1));
        assertEquals(false, instance.login(1, "badpass", 1));
        assertEquals(false, instance.login(1, "password", 2));
    }
}