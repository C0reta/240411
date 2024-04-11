package RemotePractice;

public class RemotePractice {

	public static void main(String[] args) {
		MyController rmc = new MyController();

		Audio audio = new Audio();
		Car car = new Car();
		TV tv = new TV();

		rmc.setRemote(audio);
		rmc.turnOn();
		rmc.setVolume(30);
		rmc.getVolume();
		rmc.setMute();
		rmc.turnOff();

		rmc.setRemote(car);
		rmc.turnOn();
		rmc.turnOff();

		rmc.setRemote(tv);
		rmc.turnOn();
		rmc.setVolume(80);
		rmc.getVolume();
		rmc.setMute();
		rmc.turnOff();

	}

}
