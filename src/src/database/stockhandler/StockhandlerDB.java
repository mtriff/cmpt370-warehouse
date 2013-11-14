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
    /* Addes the orders items to the table Please change the export to be of type  */  
    public Object[][] getOrder(int orderId) {
        
        Object[][] returnArr;
        returnArr = new Object[][]{
            {"Object number", "location", "Name",5, "DescriptionS", "", ""},
            {"Object number", "location", "NameS",20000000, "Description", "", ""},
            {"Object number", "location", "Name",2, "Description", "", ""}          
        };
        return returnArr;
    }
    
    public Integer[] getReadyOrderNummbers() {
        
        Integer[] returnArr;
        returnArr = new Integer[]{3,4,5,34,54};
        return returnArr;
    }
    
    
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
