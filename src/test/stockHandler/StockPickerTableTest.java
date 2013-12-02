/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stockHandler;

import javax.swing.JTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Spencer
 */
public class StockPickerTableTest {
    
    public StockPickerTableTest() {
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
     * Test of loadTable method, of class StockPickerTable.
     */
    @Test
    public void testLoadTable() {
        System.out.println("loadTable");
        int orderNumber = 0;
        StockPickerTable instance = new StockPickerTable();
        Object[][] expResult = null;
        Object[][] result = instance.loadTable(orderNumber);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addItem method, of class StockPickerTable.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        int itemNum = 0;
        JTable palletTable = null;
        StockPickerTable instance = new StockPickerTable();
        Object[] expResult = null;
        Object[] result = instance.addItem(itemNum, palletTable);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printTable method, of class StockPickerTable.
     */
    @Test
    public void testPrintTable() {
        System.out.println("printTable");
        JTable palletTable = null;
        StockPickerTable instance = new StockPickerTable();
        instance.printTable(palletTable);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
