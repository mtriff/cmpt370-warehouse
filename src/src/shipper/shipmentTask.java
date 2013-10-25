package shipper;

public class shipmentTask {
	
	private int waiBill;
	private int deliveryTime;
	private int itemNumber;
	private int itemQuantity;
	private String stockPicker;
	private String itemDestination;
	private int itemDate;
	private String itemName;
	
	/**
	 *
	 * @author Xingze
	 */


	public int getWaiBill() {
		return waiBill;
	}
	public void setWaiBill(int waiBill) {
		this.waiBill = waiBill;
	}
	public int getDeliveryTime() {
		return deliveryTime;
	}
	public void setDeliveryTime(int deliveryTime) {
		this.deliveryTime = deliveryTime;
	}
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
	public int getitemDate(){
            return itemDate;
        }
        public void setitemDate(int itemDate){
            this.itemDate = itemDate;
        }

}
