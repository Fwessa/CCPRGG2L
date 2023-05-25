package Attendance2_Inheritance;


/*	Luisa T. Dala
 *  INF 224
 *  Date: 25/05/2023
 *  
 *  This runs the program. 
 */


public class Main {
	
	
	public static void main(String[] args) {
		
		// Create new instances for each subclasses. 
		Toyota_Vios toyotaV = new Toyota_Vios(170, "Red","All-Season Tires", 18010.92); 
		U2_SpyPLane spyPlane = new U2_SpyPLane(528, "Blue",103, 120000000.00);
		Fandago_Yacht FandagoY = new Fandago_Yacht( 18, "White", "Red", 545000.00);
		
		
		// Prints Toyota Vios information
		System.out.println("Toyota Vios");
		System.out.println("Speed: "+toyotaV.speed+"kmph");
		System.out.println("Color: " + toyotaV.color);
		System.out.println("Tire Type: " + toyotaV.tireType);
		System.out.println("Price: $"+toyotaV.price );
		
		// Perform actions on the ToyotaVios instance
		toyotaV .drive();
		toyotaV .stop(); // Call the stop method specific to ToyotaVios
		
		
		System.out.println();
		
		
		// Prints U-2 Spy Plane information
		System.out.println("U-2 Spy Plane");
		System.out.println("Speed: "+spyPlane.speed+"mph");
		System.out.println("Color: " +spyPlane.color);
		System.out.println("Wing Span: " + spyPlane.wingSpan +"feet");
		System.out.println("Price: $"+spyPlane.price);
		
		// Perform actions on the U2 Spy Plane instance
		spyPlane.fly();
		spyPlane.stop();// Call the stop method specific to U2 Spy Plane
		
		
		System.out.println();
		
		
		// Prints Fandago Yacht information
		System.out.println("Fandago Yacht");
		System.out.println("Speed: "+FandagoY.speed+"kn");
		System.out.println("Color: " +FandagoY.color);
		System.out.println("Main Sail Color: " + FandagoY.mainSailColor);
		System.out.println("Price: $"+FandagoY.price);
		
		// Perform actions on the Fandago Yacht instance
		FandagoY.float_();
		FandagoY.stop(); // Call the stop method specific to Fandago Yacht
		
	}
}
