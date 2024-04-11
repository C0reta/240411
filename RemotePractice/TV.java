package RemotePractice;

public class TV implements Controller {
	int MAX_VOLUME = 100;
	int MIN_VOLUME = 0;
	int Volume = 50;

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}

	public void setMute() {
		this.Volume = 0;
		System.out.println("TV가 음소거 처리되었습니다.");
	}

	public void setVolume(int volume) {
		this.Volume = volume;
	}

	public void getVolume() {
		System.out.println("현재 볼륨: " + this.Volume);
	}

}
