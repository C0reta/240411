package Vehicle;

public class Bus extends vehicle {

	// ������ ���� �̰� �°���?
	public Bus(String name, double fuel, double fuelEfficiency) {
		super.vehicle(name, fuel, fuelEfficiency);
	}

	public void move() {
		super.move();
		System.out.println("[Bus] Driving 10 km...");
	}

}
