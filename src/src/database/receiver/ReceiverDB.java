/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package database.receiver;


/**
 *
 * @author Matt
 */
public class ReceiverDB implements ReceiverDBInterface {

    @Override
    public Object[] getOrderProducts(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean markOrderReceived(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setOrderStatus(int orderId, String status) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addItemsToOrder(int orderId, Object[] itemsList) {
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setTrackingNumber(int orderId, String trackingNum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateProductQuantity(int orderId, int productId, int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] getOrderDetails(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getOrderStatus(int orderId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override  //Change category by Xingze
    public int addProduct(String name, String category, float price, float weight) {
       return 42;
    }

    //Added by Xingze for test
    @Override
    public Object[] getProductCategories() {
        Object[] returnArr=new String[5];
        returnArr[0]="Food";
        returnArr[1]="Electronics"; 
        returnArr[2]="Software"; 
        returnArr[3]="Toys & Baby"; 
        returnArr[4]="Watches & Luggage"; 
        return returnArr;
    }

    @Override
    public int addProductCategory(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addStock(int productID, int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
