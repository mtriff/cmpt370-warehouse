/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.stockhandler;

/**
 * Implementation of all Stock Handler database tasks
 * @author Matt
 */
public class StockhandlerDB implements StockhandlerDBInterface 
{
    @Override
    public Object[] getProductDetails(int prodId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] getProductLocation(int prodId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] getBinProducts(int binId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] findBestPath(Object[] itemsObject[]) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] assignBins(Object[] itemsObject[]) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class getProductDetails {

        public getProductDetails() {
        }
    }
    
}
