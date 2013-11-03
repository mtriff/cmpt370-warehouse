package receiver;

/**
* Class for incoming order
* @author Xingze
*/
public class orderItem {

    private String itemName;

    private int itemQuantity;
    private String itemCategory;
    private float price;
    private float size;
    private String itemDescription;

/**
 * 
 * @param itemName
 * @param orderID
 * @param itemQuantity
 * @param itemCategory
 * @param price
 * @param size
 * @param itemDescription 
 */
    public orderItem(String itemName, int itemQuantity, String itemCategory, float price, float size, String itemDescription) {
        this.itemName = itemName;
//        this.orderID = orderID;
        this.itemQuantity = itemQuantity;
        this.itemCategory = itemCategory;
        this.price = price;
        this.size = size;
        this.itemDescription = itemDescription;
    }



/**
 * Add the order into database
 * @return true if success, false otherwise
 */
	public Boolean addToDatabse(){
		return null;
		
	}


//public int getOrderID() {
//	return orderID;
//}

//public void setOrderID(int orderID) {
//	this.orderID = orderID;
//}

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

public String getItemCategory() {
	return itemCategory;
}

public void setItemCategory(String itemCategory) {
	this.itemCategory = itemCategory;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public float getsize() {
	return size;
}

public void setsize(float size) {
	this.size = size;
}

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
	
    @Override
        public String toString(){
//            return "Number =" + orderID + "\r\n" 
              return "Name =" + itemName + "\r\n"
                   +"Quantity =" + itemQuantity +"\r\n"                  
                   +"Category =" + itemCategory + "\r\n"
                   +"Price =" + price +"\r\n"
                   +"Size =" + size +"\r\n"
                   +"Description =" + itemDescription + "\r\n";
        }
}
