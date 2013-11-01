/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.shipper;

/**
 *
 * @author Matt
 */
public class ShipperDB implements ShipperDBInterface {

    /*
     * Returning dummy data for now.
     */
    @Override
    public Object[] getShipmentList() {
        Object[] returnArr=new String[3];
    
        returnArr[0]=1;
        returnArr[1]=2; //Added by Xingze
        returnArr[2]=3; //Added by Xingze
        return returnArr;
    }

    @Override
    public Object[] getPendingShipmentList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
     * Returning dummy data for now.
     */
    @Override
    public Object[] getShipmentDetails(int shipmentId) {
        Object[][] returnArr=new Object[][]{
            {null, "pending", "TRACK124125DS21", 329.9, "U of S, Saskatoon, SK, Canada"}
        };

        return returnArr;
    }
    
    /*
     * Returning dummy data for now.
     */
    @Override
    public Object[] getShipmentProducts(int shipmentId) {
        Object[][] returnArr=new Object[][]{
                {1,"Nexus 7",30,"Saskatoon","2013-05-07"},
                {2,"Lenovo X230",26,"Beijing","2013-06-09"},
                {3,"iPad Mini",15,"London","2013-06-12"}
            };   
        
        return returnArr;
    }

    @Override
    public String getShipmentStatus(int shipmentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float getShipmentWeight(int shipmentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int createShipment(String destination) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addItemsToShipment(Object[] itemList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setShipmentStatus(int shipmentId, String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean markShipmentSent(int shipmentId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setShipmentDate(int shipmentId, String date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setShipmentDestination(int shipmentId, String destination) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateProductQuantity(int shipmentId, int productId, int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setTrackingNumber(int shipmentId, String trackingNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean decreaseStock(int productID, int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /*
     * Returning dummy data for now.
     */
    @Override
    public Object[] getStockHandlers() {
        Object[] returnArr=new Object[][]{
            {1, "Johnny"},{2,"Amy"},{3,"Bush"}
        };
        
        return returnArr;
    }

    @Override
    public Object[] getShippingCompanies() {
       Object[] returnArr=new Object[][]{
            {1, "UPS"},{2,"DHL"},{3,"EMS"}
        };
       return returnArr;
    }
}
