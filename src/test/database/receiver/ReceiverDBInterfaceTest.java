/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.receiver;

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
public class ReceiverDBInterfaceTest {
    
    public ReceiverDBInterfaceTest() {
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
     * Test of addItemsToOrder method, of class ReceiverDBInterface.
     */
    @Test
    public void testAddItemsToOrder() {
        System.out.println("addItemsToOrder");
        int orderId = 0;
        Object[] itemsList = null;
        ReceiverDBInterface instance = new ReceiverDBInterfaceImpl();
        boolean expResult = false;
        boolean result = instance.addItemsToOrder(orderId, itemsList);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class ReceiverDBInterface.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        String name = "";
        int category = 0;
        float price = 0.0F;
        float size = 0.0F;
        float weight = 0.0F;
        ReceiverDBInterface instance = new ReceiverDBInterfaceImpl();
        int expResult = 0;
        int result = instance.addProduct(name, category, price, size, weight);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductCategories method, of class ReceiverDBInterface.
     */
    @Test
    public void testGetProductCategories() {
        System.out.println("getProductCategories");
        ReceiverDBInterface instance = new ReceiverDBInterfaceImpl();
        Object[] expResult = null;
        Object[] result = instance.getProductCategories();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ReceiverDBInterfaceImpl implements ReceiverDBInterface {

        public boolean addItemsToOrder(int orderId, Object[] itemsList) {
            return false;
        }

        public int addProduct(String name, int category, float price, float size, float weight) {
            return 0;
        }

        public Object[] getProductCategories() {
            return null;
        }
    }
}