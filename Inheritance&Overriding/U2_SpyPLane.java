package Attendance2_Inheritance;

/*  Luisa T. Dala
 *  INF 224
 *  Date: 25/05/2023
 *  
 *  This is the subclass boat named  U2 SpyPLane.
 *  This class inherits the attributes of the Vehicle class, including speed, color, price, and stop().
 *  This class modifies stop() to match the U2 SpyPLane.
 *  This class has unique properties and methods, which are wingSpan and fly().
 */
public class U2_SpyPLane extends Vehicle{
	
	int wingSpan; // This represents the wing span of U2 spy plane
	
	public U2_SpyPLane(int speed, String color, int wingSpan, double price) {
		super(speed, color, price);
		this.wingSpan = wingSpan;
	}
	
	public void fly() {
		System.out.println("The U2 Spy Plane has successfully taken off and is now soaring through the sky.");
	}
		
	// This method overrides the stop() method in the Vehicle class to make it suitable for Toyota Vios.
	@Override
	public void stop() {
		System.out.println("The U2 Spy Plane is landing.");
	}

	
}
