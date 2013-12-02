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
public class GuiDBInterfaceTest {
    
    public GuiDBInterfaceTest() {
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
     * Test of createBin method, of class GuiDBInterface.
     */
    @Test
    public void testCreateBin() {
        System.out.println("createBin");
        int row = 0;
        int column = 0;
        GuiDBInterface instance = new GuiDBInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.createBin(row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeBin method, of class GuiDBInterface.
     */
    @Test
    public void testRemoveBin() {
        System.out.println("removeBin");
        int row = 0;
        int column = 0;
        GuiDBInterface instance = new GuiDBInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.removeBin(row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBinLocations method, of class GuiDBInterface.
     */
    @Test
    public void testGetBinLocations() {
        System.out.println("getBinLocations");
        GuiDBInterface instance = new GuiDBInterfaceImpl();
        Object[] expResult = null;
        Object[] result = instance.getBinLocations();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class GuiDBInterface.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        int userId = 0;
        String password = "";
        int type = 0;
        GuiDBInterface instance = new GuiDBInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.login(userId, password, type);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemLocation method, of class GuiDBInterface.
     */
    @Test
    public void testGetItemLocation() {
        System.out.println("getItemLocation");
        int itemId = 0;
        GuiDBInterface instance = new GuiDBInterfaceImpl();
        Integer[] expResult = null;
        Integer[] result = instance.getItemLocation(itemId);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class GuiDBInterfaceImpl implements GuiDBInterface {

        public boolean createBin(int row, int column) {
            return false;
        }

        public boolean removeBin(int row, int column) {
            return false;
        }

        public Object[] getBinLocations() {
            return null;
        }

        public boolean login(int userId, String password, int type) {
            return false;
        }

        public Integer[] getItemLocation(int itemId) {
            return null;
        }
    }
}