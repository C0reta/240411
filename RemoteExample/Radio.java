package RemoteExample;

public class Radio implements RemoteControl {

	@Override
	public void turnOn() {
		System.out.println("Radio �ѱ�");

	}

	@Override
	public void TurnOff() {
		System.out.println("Radio ����");

	}

}
