package Attendance2_Inheritance;

/*	Luisa T. Dala
 *  INF 224
 *  Date: 25/05/2023
 *  
 *  This is the superclass Vehicle
 *  This class represents the attributes of the different means of transportation, including speed, color, price, and stop().
 *  
 */


public class Vehicle {
	
	 	int speed; // This represents the speed of the vehicle
	    String color;  // This represents the color of the vehicle
	    double price;  // This represents the price  of the vehicle

	    public Vehicle(int speed, String color, double price) {
	    	this.speed = speed;
	        this.color = color;
	        this.price = price;
	    }
	    
	    // This method stops the vehicle 
		public void stop() {
	        System.out.println("Vehicle stopped.");
	    }

}
