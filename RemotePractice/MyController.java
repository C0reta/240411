package RemotePractice;

public class MyController {
	Controller rc = null;

	public void setRemote(Audio audio) {
		this.rc = audio;
		System.out.println("오디오용 리모컨으로 변경되었습니다.");
	}

	public void setRemote(Car car) {
		this.rc = car;
		System.out.println("자동차용 리모컨으로 변경되었습니다.");
	}

	public void setRemote(TV tv) {
		this.rc = tv;
		System.out.println("TV용 리모컨으로 변경되었습니다.");
	}

	public void turnOn() {
		this.rc.turnOn();
	}

	public void turnOff() {
		this.rc.turnOff();
	}

	public void setMute() {
		this.rc.setMute();
	}

	public void setVolume(int volume) {
		this.rc.setVolume(volume);
	}

	public void getVolume() {
		this.rc.getVolume();
	}

}
