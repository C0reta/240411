package RemotePractice2;

public class TV implements RemoteController {
	public int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void getVolume() {
		System.out.println("현재 볼륨: " + this.volume);
	}

	@Override
	public void setMute() {
		this.volume = 0;
		System.out.println("TV가 음소거 처리되었습니다.");
	}

}
