package RemoteExample;

public class Television implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV �ѱ�");

	}

	@Override
	public void TurnOff() {
		System.out.println("TV ����");

	}

}
