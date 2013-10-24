package shipper;

import java.sql.Array;

/**
*
* @author Xingze
*/

public class makeShipment {

	private shipmentTask newTask;
	private int wayBill;
	private int deliveryTime;
	private String stockPicker;



/**
* @return shipment number of all shipment requirements in an array
* 
*/	
	public Array shipRequire(){
		return null;
	}
	
/**
* @param number: waybill number from user input
* @param tiem : delivery time from user input
*/

	public void inputShipInfor(int number, int time){
		wayBill = number;
		deliveryTime = time;
	}

/**
* @param picker: the choosen picker form GUI
*/
	public void choosePicker(String picker){
		stockPicker = picker;
	}

/**
*	Assign task to a stock picker by create the shipment task
*/
	public void creatShipment(){
		
	}
	
/**
 *  Store the information info database
 *  @return true is success, false otherwise
 */
	public Boolean makeRecord(){
		return false;
	}

}
