package Vehicle;

public class Bus extends vehicle {

	// 생성자 복사 이거 맞겠지?
	public Bus(String name, double fuel, double fuelEfficiency) {
		super.vehicle(name, fuel, fuelEfficiency);
	}

	public void move() {
		super.move();
		System.out.println("[Bus] Driving 10 km...");
	}

}
