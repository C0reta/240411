package RemotePractice2;

public class MyController implements RemoteController {
	RemoteController rmc = null;
	// 이거!!! 이거!!! 이거 시발!!!!!

	public void setSystem(Audio audio) {
		this.rmc = audio;
		System.out.println("오디오용 리모컨으로 변경되었습니다.");
	}

	public void setSystem(Car car) {
		this.rmc = car;
		System.out.println("자동차용 리모컨으로 변경되었습니다.");
	}

	public void setSystem(TV tv) {
		this.rmc = tv;
		System.out.println("TV용 리모컨으로 변경되었습니다.");
	}

	@Override
	public void turnOn() {
		this.rmc.turnOn();
	}

	@Override
	public void turnOff() {
		this.rmc.turnOff();

	}

	@Override
	public void setVolume(int volume) {
		this.rmc.setVolume(volume);
	}

	@Override
	public void getVolume() {
		this.rmc.getVolume();
	}

	@Override
	public void setMute() {
		this.rmc.setMute();
	}

}
