package RemotePractice2;

public class Main {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Car car = new Car();
		TV tv = new TV();

		MyController rmc = new MyController();

		rmc.setSystem(audio);
		rmc.turnOn();
		rmc.setVolume(80);
		rmc.getVolume();
		rmc.setMute();
		rmc.turnOff();

		rmc.setSystem(car);
		rmc.turnOn();
		rmc.turnOff();

		rmc.setSystem(tv);
		rmc.turnOn();
		rmc.setVolume(30);
		rmc.getVolume();
		rmc.setVolume(50);
		rmc.getVolume();
		rmc.turnOff();

	}
}