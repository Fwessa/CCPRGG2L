
public class Main {
	
	public static void main(String[] args) {
		Car car = new Car("Toyota-Vios",170, "Red", 18010.92);
		Plane plane = new Plane("U-2",528, "Blue", 120000000.00);
		Boat boat = new Boat("Fandago Yacht", 18, "White", 545000.00);
		
		System.out.println("Car");
		System.out.println(car.name);
		System.out.println("Speed: "+car.speed+"kmph");
		System.out.println("Color: " + car.color);
		System.out.println("Price: $"+car.price );
		car.stop();
		
		System.out.println();
		
		System.out.println("Plane");
		System.out.println(plane.name);
		System.out.println("Speed: "+plane.speed+"mph");
		System.out.println("Color: " +plane.color);
		System.out.println("Price: $"+plane.price);
		plane.stop();
		
		System.out.println();
		
		System.out.println("Boat");
		System.out.println(boat.name);
		System.out.println("Speed: "+boat.speed+"kn");
		System.out.println("Color: " +boat.color);
		System.out.println("Price: $"+boat.price);
		boat.stop();
		
	}
}
