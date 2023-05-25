package Attendance2_Inheritance;

/*  Luisa T. Dala
 *  INF 224
 *  Date: 25/05/2023
 *  
 *  This is the subclass boat named Fandago Yacht 
 *  This class inherits the attributes of the Vehicle class, including speed, color, price, and stop().
 *  This class modifies stop() to match the Fandago yacht.
 *  This class has unique properties and methods, which are mainSailColor and float_().
 */


public class Fandago_Yacht extends Vehicle {

	String mainSailColor; // This represents the main sail color for Fandago Yacht
	
	public Fandago_Yacht(int speed, String color, String mainSailColor, double price) {
		super(speed, color, price);
		this.mainSailColor = mainSailColor;
	}
	
	// float is a data type so I change it to float_(). 
	public void float_() {
		System.out.println("The Fandago yacht is sailing.");		
	}
	
	// This method overrides the stop() method in the Vehicle class to make it suitable for Fandago Yacht.
	@Override
	public void stop() {
		System.out.println("The Fandago yacht has come to a stop in the middle of the sea.");
	}
}
