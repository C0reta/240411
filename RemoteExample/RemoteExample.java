package RemoteExample;

public class RemoteExample {

	public static void main(String[] args) {
		Television television = new Television();
		Radio radio = new Radio();

		television.turnOn();
		television.TurnOff();

		radio.turnOn();
		radio.TurnOff();

	}

}
