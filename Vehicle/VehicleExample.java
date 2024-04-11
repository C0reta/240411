package Vehicle;

public class VehicleExample {

	public static void main(String[] args) {
		Bus bus = new Bus("Tayo", 100, 12);
		Airplane airplane = new Airplane("Ssyong", 100, 0.1);
		Tank tank = new Tank("TankTank", 50, 4);
		Driver driver = new Driver("Nana");

		vehicle[] Vehicle = { bus, airplane, tank };
		// vehicle.showVehicle();

		driver.drive(bus);
		driver.drive(airplane);

	}

}
