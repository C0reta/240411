package Vehicle;

public class vehicle {
	private String name;
	private double fuel;
	private double fuelEfficiency;
	private int distance = 0;

	public double getFuel() {
		return this.fuel;
	}

	public void vehicle(String name, double fuel, double fuelEfficiency) {
		this.name = name;
		this.fuel = fuel;
		this.fuelEfficiency = fuelEfficiency;
	}

	public void showVehicle() {
		System.out.println("==========");
		System.out.println("Name: " + this.name);
		System.out.println("Remained fuel(L): " + this.fuel);
		System.out.println("Moved distance(km): " + this.distance);
		System.out.println("==========");
	}

	public void move() {
		this.fuel -= 10 / this.fuelEfficiency;
		this.distance += 10;

		if (this.fuel < 10) {
			System.out.println("Less fuel!");
		}
	}

}
