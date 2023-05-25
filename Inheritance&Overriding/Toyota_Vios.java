package Attendance2_Inheritance;

/*  Luisa T. Dala
 *  INF 224
 *  Date: 25/05/2023
 *  
 *  This is the subclass boat named Toyota Vios 
 *  This class inherits the attributes of the Vehicle class, including speed, color, price, and stop().
 *  This class modifies stop() to match the Toyota Vios.
 *  This class has unique properties and methods, which are tireType and drive().
 */

public class Toyota_Vios extends Vehicle{
	
	String tireType; // This represents the tire type for Toyota Vios
	
	public Toyota_Vios(int speed, String color, String tireType, double price) {
		super(speed, color, price);
		this.tireType = tireType;
	}
	
	public void drive() {
		System.out.println("The Toyota Vios is driving.");		
	}
	
	// This method overrides the stop() method in the Vehicle class to make it suitable for Toyota Vios.
	@Override
	public void stop() {
		System.out.println("The Toyota Vios brakes and stops.");
	}

	

}
