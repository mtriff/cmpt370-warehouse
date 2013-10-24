package shipper;

public class shipmentTask {
	
	private int waiBill;
	private int deliveryTime;
	private String itemNumber;
	private int itemAmount;
	private String stockPicker;
	
	/**
	 *
	 * @author Xingze
	 */
	
	public shipmentTask(int waiBill, int deliveryTime, String itemNumber,
			int itemAmount, String stockPicker) {
		super();
		this.waiBill = waiBill;
		this.deliveryTime = deliveryTime;
		this.itemNumber = itemNumber;
		this.itemAmount = itemAmount;
		this.stockPicker = stockPicker;

	}

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
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public int getItemAmount() {
		return itemAmount;
	}
	public void setItemAmount(int itemAmount) {
		this.itemAmount = itemAmount;
	}
	
	
}
