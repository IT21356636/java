import java.util.Scanner;						// input library


public class RoomChargeCalculator {            // one class design 
	
	public static Scanner scan = new Scanner(System.in);
	public static String inputs;       // user inputs variable "yes or no"
	
	 public static int deluxDoublefixedFee = 5000;
	 public static int standardFamilyfixedFee = 3000;
	 public static int standardSinglefixedFee = 2000;
	 
	 public static int balconyFee = 500;
	 public static int parkingFee = 200;
	 public static int tvFee = 200;
	 public static int kitchenFee = 1000;
	 public static int famKitchenFee = 500;
	 public static int wifiFee = 100;
	 public static int gardenFee = 200;
	 public static int acFee = 500;
	 
	 static String balcony;
	 static String parking;
	 static String tv;
	 static String kitchen;
	 static String famKitchen;
	 static String wifi;
	 static String ac;
	 static String garden;



	 	// Menu
	 	
	 public static void main(String[] args) {
		  System.out.println("Welcome to Room Charge Calculator!!\n\n****Please select a number you need****\n\n");
		  System.out.println("1.Delux Double Room");
		  System.out.println("2.Standard Family Room");
		  System.out.println("3.Standard Single Room");
		  System.out.println("4.Quit\n");
		  System.out.print("Please Enter Number 1-4: ");
		  
		  int choice = scan.nextInt();
		  
		  switch (choice) {
		  case 1:	System.out.println();
		  			System.out.println("Delux double room fixed fee: " + deluxDoublefixedFee + "\n");
		  			
		  			System.out.println("*************************************************");
		  			System.out.println("Aditional chargers if the following were requested");
		  			System.out.println("*************************************************");
		  			System.out.println(" Balcony Charge: " + balconyFee);			//display all additional chargers 
		  			System.out.println(" Parking Charge: " + parkingFee);
		  			System.out.println(" TV Charge: " + tvFee);
		  			System.out.println(" Kitchen Charge: " + kitchenFee);
		  			System.out.println(" WiFi Charge: " + wifiFee);
		  			
		  			System.out.println("***Do you want aditional service?***");
		  			System.out.println("(If you want get aditional service please enter 'yes', if not enter 'no')");
		  			inputs = scan.next();
		  			
		  					if (inputs.toLowerCase().equals("yes")) {					//if condition for ask services
		  						System.out.println("\n");
		  						
		  						System.out.println("Do you want balcony?");
		  						balcony = scan.next();
		  						boolean balconyOK = confirmed(balcony);
		  						
		  						System.out.println("Do you want parking?");
		  						parking = scan.next();
		  						boolean parkOK = confirmed(parking);
		  						
		  						System.out.println("Do you want to watch TV?");
		  						tv = scan.next();
		  						boolean tvOK = confirmed(tv);
		  						
		  						System.out.println("Do you want kitchen");
		  						kitchen = scan.next();
		  						boolean kitchenOK = confirmed(kitchen);
		  						
		  						System.out.println("Do you want wifi");
		  						wifi = scan.next();
		  						boolean wifiOK = confirmed(wifi);
		  						
		  						
		  						getChargeDeluxDouble(balconyOK, parkOK, tvOK, kitchenOK, wifiOK);   //Method 1 
		  						
		  					}else {
		  						System.out.println("Total room charge : " + deluxDoublefixedFee);
		  					}
		  			break;
		  					
		  					
		  case 2:	System.out.println();
					System.out.println("Standerd family room fixed fee: " + standardFamilyfixedFee + "\n");
					
					System.out.println("*************************************************");
					System.out.println("Aditional chargers if the following were requested");
					System.out.println("*************************************************");
					
					System.out.println(" Parking Charge: " + parkingFee);
					System.out.println(" Kitchen Charge: " + famKitchenFee);
					System.out.println(" Garden Charge: " + gardenFee);
					
					System.out.println("***Do you want aditional service?***");
					System.out.println("(If you want get aditional service please enter 'yes', if not enter 'no')");
					inputs = scan.next();
					
							if (inputs.toLowerCase().equals("yes")) {
								System.out.println("\n");
								
								
								
								System.out.println("Do you want parking?");
								parking = scan.next();
								boolean parkOK = confirmed(parking);
								
								System.out.println("Do you want kitchen");
								famKitchen = scan.next();
								boolean kitchenOK = confirmed(famKitchen);
								
								System.out.println("Do you want garden?");
								garden = scan.next();
								boolean gardenOK = confirmed(garden);
								
								
								getChargeStandardFamily(parkOK, kitchenOK, gardenOK);		// Method 2
								
							}else {
								System.out.println("Total room charge : " + standardFamilyfixedFee);
							}
					break;
					
					
		  case 3:	System.out.println();
					System.out.println("Standerd family room fixed fee: " + standardSinglefixedFee + "\n");
					
					System.out.println("***************************************************");
					System.out.println("Aditional chargers if the following were requested");
					System.out.println("***************************************************");
					
					System.out.println(" Parking Charge: " + parkingFee);
					System.out.println(" A/C Charge: " + acFee);
					System.out.println(" Wifi Charge: " + wifiFee);
					
					System.out.println("***Do you want aditional service?***");
					System.out.println("(If you want get aditional service please enter 'yes', if not enter 'no')");
					inputs = scan.next();
			
							if (inputs.toLowerCase().equals("yes")) {
								System.out.println();
								
								
								
								System.out.println("Do you want parking?");
								parking = scan.next();
								boolean parkOK = confirmed(parking);
								
								System.out.println("Do you want A/C?");
								ac = scan.next();
								boolean acOK = confirmed(ac);
								
								System.out.println("Do you want Wifi?");
								wifi = scan.next();
								boolean wifiOK = confirmed(wifi);
								
								
								getChargeStandardSingle(parkOK, acOK, wifiOK);			// Method 3
								
							}else {
								System.out.println("Total room charge : " + standardSinglefixedFee);
							}
					break;
						
		  case 4:	System.out.println("***Thak you!! Now you are exit our system***");
		            scan.close();
		            break;
		            
		  default:	System.out.println("Invalid number. System will STOP.....");
		   			break;
		  

		  }
	}
	 
public static boolean confirmed(String result) {            
	boolean input;
			if(result.toLowerCase().equals("yes")) {
				input = true;								 
			}
			else {
				input = false;
			}
			
			return input;
}

public static int orderPrice(boolean userInput, int fee ) {
			if(userInput == true) {
				return fee;
			} else {
				fee = 0;
				return fee;
			}
}


public static void getChargeDeluxDouble(boolean balcony, boolean parking, boolean tv, boolean kitchen, boolean wifi) {
	int addBalconyFee = orderPrice(balcony, balconyFee);
	int addParkingFee = orderPrice(parking, parkingFee);
	int addTvFee = orderPrice(tv, tvFee);
	int addKitchenFee = orderPrice(kitchen, kitchenFee);
	int addWifiFee = orderPrice(wifi, wifiFee);
	
	int totalCost = deluxDoublefixedFee + addBalconyFee + addParkingFee + addTvFee + addKitchenFee + addWifiFee;   // calculate total
	System.out.println("Final total room charge is : " + totalCost);

}

public static void getChargeStandardFamily(boolean parking, boolean famKitchen, boolean garden) {
	
	int addParkingFee = orderPrice(parking, parkingFee);
	int addFamKitchenFee = orderPrice(famKitchen, famKitchenFee);
	int addGardenFee = orderPrice(garden, gardenFee);
	
	int totalCost = standardFamilyfixedFee + addParkingFee + addFamKitchenFee + addGardenFee;			// calculate total
	System.out.println("Final total room charge is : " + totalCost);

}

public static void getChargeStandardSingle(boolean parking, boolean ac, boolean wifi) {
	
	int addParkingFee = orderPrice(parking, parkingFee);
	int addAcFee = orderPrice(ac, acFee);
	int addWifiFee = orderPrice(wifi, wifiFee);
	
	int totalCost = standardSinglefixedFee + addParkingFee + addAcFee + addWifiFee;						// calculate total
	System.out.println("Final total room charge is : " + totalCost);

}

}
