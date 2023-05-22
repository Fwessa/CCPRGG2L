
public class Car extends Vehicle{

	public Car(String name, int speed, String color, double price) {
		super(name, speed, color, price);
	}

	@Override
	public void stop() {
		System.out.println("The car brakes and stops.");
	}

}
