package RemotePractice2;

public class Audio implements RemoteController {
	public int volume;

	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");

	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");

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
		System.out.println("오디오가 음소거 처리되었습니다.");

	}

}
