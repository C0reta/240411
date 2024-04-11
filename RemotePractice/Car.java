package RemotePractice;

public class Car implements Controller {

	@Override
	public void turnOn() {
		System.out.println("시동을 겁니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("시동을 끕니다.");

	}

	@Override
	public void setMute() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getVolume() {
		// TODO Auto-generated method stub

	}

}
