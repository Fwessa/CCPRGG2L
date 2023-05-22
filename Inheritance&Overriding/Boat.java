
public class Boat extends Vehicle {
	

	
	public Boat(String name, int speed, String color, double price) {
		super(name, speed, color, price);
	
	}

	@Override
	public void stop() {
		System.out.println("The boat stopped at the middle of the sea.");
	}
}
