/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.shipper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import shipper.shipmentTask;

/**
 *
 * @author Matt
 */
public class ShipperDBTest {
    
    public ShipperDBTest() {
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
     * Test of getShipmentList method, of class ShipperDB.
     */
    @Test
    public void testGetShipmentList() {
        System.out.println("getShipmentList");
        ShipperDB instance = new ShipperDB();
        Object[] expResult = null;
        Object[] result = instance.getShipmentList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPendingShipmentList method, of class ShipperDB.
     */
    @Test
    public void testGetPendingShipmentList() {
        System.out.println("getPendingShipmentList");
        ShipperDB instance = new ShipperDB();
        Object[] expResult = null;
        Object[] result = instance.getPendingShipmentList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStockHandlers method, of class ShipperDB.
     */
    @Test
    public void testGetStockHandlers() {
        System.out.println("getStockHandlers");
        ShipperDB instance = new ShipperDB();
        Object[] expResult = null;
        Object[] result = instance.getStockHandlers();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getShippingCompanies method, of class ShipperDB.
     */
    @Test
    public void testGetShippingCompanies() {
        System.out.println("getShippingCompanies");
        ShipperDB instance = new ShipperDB();
        Object[] expResult = null;
        Object[] result = instance.getShippingCompanies();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewShipment method, of class ShipperDB.
     */
    @Test
    public void testSetNewShipment() {
        System.out.println("setNewShipment");
        shipmentTask newTask = null;
        ShipperDB instance = new ShipperDB();
        boolean expResult = false;
        boolean result = instance.setNewShipment(newTask);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}