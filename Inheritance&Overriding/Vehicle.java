
public class Vehicle {
	
	
		String name; 
	 	int speed;
	    String color;
	    double price;

	    public Vehicle(String name, int speed, String color, double price) {
	        this.name = name;
	    	this.speed = speed;
	        this.color = color;
	        this.price = price;
	    }

	    public void stop() {
	        System.out.println("Vehicle stopped.");
	    }

}
