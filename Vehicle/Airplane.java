package Vehicle;

public class Airplane extends vehicle {
	public Airplane(String name, double fuel, double fuelEfficiency) {
		super.vehicle(name, fuel, fuelEfficiency);
	}

	public void move() {
		super.move();
		System.out.println("[Airplane] Driving 10 km...");
	}

}
