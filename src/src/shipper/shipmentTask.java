package shipper;

public class shipmentTask {
	
	private int wayBill;
//	private int deliveryTime;
	private int itemNumber;
	private int itemQuantity;
	private String stockPicker;
	private String itemDestination;
	private String itemDate;
	private String itemName;
	
	/**
	 *
	 * @author Xingze
         * @param stockPicker
	 */
        public void setStockPicker(String stockPicker){
            this.stockPicker = stockPicker;
        }
        
        public String getStockPicker(){
            return stockPicker;
        }

	public int getwayBill() {
		return wayBill;
	}
	public void setwayBill(int wayBill) {
		this.wayBill = wayBill;
	}
//	public int getDeliveryTime() {
//		return deliveryTime;
//	}
//	public void setDeliveryTime(int deliveryTime) {
//		this.deliveryTime = deliveryTime;
//	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public int getitemQuantity() {
		return itemQuantity;
	}
	public void setitemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
        public String getitemDestination(){
            return itemDestination;
        }
        public void setitemDestination(String itemDestination){
            this.itemDestination = itemDestination;
        }
        public String getitemName(){
            return itemDestination;
        }
        public void setitemName(String itemName){
            this.itemName = itemName;
        }
	public String getitemDate(){
            return itemDate;
        }
        public void setitemDate(String itemDate){
            this.itemDate = itemDate;
        }
        
        @Override
        public String toString(){
            return "Number =" + itemNumber + "\r\n" 
                   +"Name =" + itemName + "\r\n"
                   +"Quantity =" + itemQuantity +"\r\n"
                   +"Destination =" + itemDestination + "\r\n"
                   +"Data =" + itemDate + "\r\n"
                   +"Stock Picker =" + stockPicker +"\r\n"
                   +"Bill Number =" + wayBill +"\r\n" ;
        }

    void setWayBill(int bill) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
//	private int wayBill;
//	private int deliveryTime;
//	private int itemNumber;
//	private int itemQuantity;
//	private String stockPicker;
//	private String itemDestination;
//	private int itemDate;
//	private String itemName;