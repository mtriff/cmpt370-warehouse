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

    public makeShipment(){
        newTask = new shipmentTask();
    }


/**
* @return shipment number of all shipment requirements in an array
* 
*/	
	public Object shipRequire(){
		//todo  get info from database

		Object shipmentInfo[][];
            shipmentInfo = new Object[][]{
                {1,"iPad Air",30,"Saskatoon",2013},
                {2,"Nexus7",25,"Beijing",2013}
            };
		return shipmentInfo;
	}
	
/**
* @param number: waybill number from user input
* @param tiem : delivery time from user input
*/

	public void inputDeliveryInfo(int number, int time){
		wayBill = number;
		deliveryTime = time;
	}

	public void inputItemInfor(int number, String name, 
			int quantity, String destination, int date){
            newTask.setItemNumber(number);
            newTask.setitemName(name);
            newTask.setitemQuantity(quantity);
            newTask.setitemDestination(destination);
            newTask.setitemDate(date);
            
            //Test code
            System.out.println(number + name + quantity + destination +date);
		
	}

	public Object pickerRequire(){
		Object picker[][];
		picker = new Object[][]{
			{"Obama"},{"Bush"},{"Biden"}
		};
		return picker;
	}

/**
* @param picker: the choosen picker form GUI
*/
	public void setPicker(String picker, String wayBill){            
            int bill = Integer.parseInt(wayBill);
     //       int time = Integer.parseInt(deliveryTime);
            newTask.setStockPicker(picker);
            newTask.setwayBill(bill);
      //      newTask.setitemDate(time);
            
            System.out.println(newTask.toString());
                  
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
