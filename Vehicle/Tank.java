package Vehicle;

public class Tank extends vehicle {

	public Tank(String name, double fuel, double fuelEfficiency) {
		super.vehicle(name, fuel, fuelEfficiency);
	}

	public void move() {
		super.move();
		System.out.println("[Tank] Driving 10 km...");
	}

}
