/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.stockhandler;

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
public class StockhandlerDBTest {
    
    public StockhandlerDBTest() {
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
     * Test of getOrder method, of class StockhandlerDB.
     */
    @Test
    public void testGetOrder() {
        System.out.println("getOrder");
        int orderId = 11;
        StockhandlerDB instance = new StockhandlerDB();
        Object[][] result = instance.getOrder(orderId);
        assertNotNull(result);
    }

    /**
     * Test of getReadyOrderNummbers method, of class StockhandlerDB.
     */
    @Test
    public void testGetReadyOrderNumbers() {
        System.out.println("getReadyOrderNummbers");
        StockhandlerDB instance = new StockhandlerDB();
        Integer[] result = instance.getReadyOrderNumbers();
        assertNotNull(result);
    }
}