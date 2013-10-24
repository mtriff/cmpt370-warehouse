package receiver;

/**
* Class for incoming order
* @author Xingze
*/
public class orderItem {

	private int productID;
	private int orderID;
	private int itemQuantity;
	private String itemName;
	private int itemCategory;
	private float price;
	private float weight;

	
/**
 * 	
 * @param productID
 * @param orderID
 * @param itemQuantity
 * @param itemName
 * @param itemCategory
 * @param price
 * @param weight
 */
	
public orderItem(int productID, int orderID, int itemQuantity,
			String itemName, int itemCategory, float price, float weight) {
		super();
		this.productID = productID;
		this.orderID = orderID;
		this.itemQuantity = itemQuantity;
		this.itemName = itemName;
		this.itemCategory = itemCategory;
		this.price = price;
		this.weight = weight;
	}

/**
 * Add the order into database
 * @return true if success, false otherwise
 */
	public Boolean addToDatabse(){
		return null;
		
	}

public int getProductID() {
	return productID;
}

public void setProductID(int productID) {
	this.productID = productID;
}

public int getOrderID() {
	return orderID;
}

public void setOrderID(int orderID) {
	this.orderID = orderID;
}

public int getItemQuantity() {
	return itemQuantity;
}

public void setItemQuantity(int itemQuantity) {
	this.itemQuantity = itemQuantity;
}

public String getItemName() {
	return itemName;
}

public void setItemName(String itemName) {
	this.itemName = itemName;
}

public int getItemCategory() {
	return itemCategory;
}

public void setItemCategory(int itemCategory) {
	this.itemCategory = itemCategory;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public float getWeight() {
	return weight;
}

public void setWeight(float weight) {
	this.weight = weight;
}
	
	
}
