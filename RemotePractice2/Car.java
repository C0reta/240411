package RemotePractice2;

public class Car implements RemoteController {

	@Override
	public void turnOn() {
		System.out.println("차 시동을 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("차 시동을 끕니다.");

	}

	public void setVolume(int volume) {
		// TODO Auto-generated method stub

	}

	public void getVolume() {
		// TODO Auto-generated method stub

	}

	public void setMute() {
		// TODO Auto-generated method stub

	}

}
