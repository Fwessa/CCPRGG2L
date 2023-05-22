
public class Plane extends Vehicle{

	public Plane(String name, int speed, String color, double price) {
		super(name, speed, color, price);
		
	}

	@Override
	public void stop() {
		System.out.println("The plane is landing.");
	}
}
