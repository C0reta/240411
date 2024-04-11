package Vehicle;

public class Driver {
	private String name;

	public Driver(String name) {
		this.name = name;
	}

	public void drive(vehicle Vehicle) {
		Vehicle.move();
	}

}
