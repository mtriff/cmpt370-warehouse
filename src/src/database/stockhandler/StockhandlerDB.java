/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.stockhandler;

import java.sql.Array;

/**
 * Implementation of all Stock Handler database tasks
 * @author Matt
 */
public class StockhandlerDB implements StockhandlerDBInterface 
{
    @Override
    public Array getProductDetails(int prodId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Array getProductLocation(int prodId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Array getBinProducts(int binId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Array findBestPath(Array itemsArray) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Array assignBins(Array itemsArray) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
