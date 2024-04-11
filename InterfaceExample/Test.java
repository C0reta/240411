package InterfaceExample;

interface A {
	public void a();
}

interface B {
	public void b();
}

interface C extends A, B {
	public default void c() {
		System.out.println("인터페이스에서 바디가 있는 디폴트 메소드를 가질 수 있다.");
	}
}

abstract class E {
	public abstract void e();
}

class D extends E implements C {
	public void a() {

	}

	public void b() {

	}

	public void c() {

	}

	public void e() {

	}
}

public class Test {

	public static void main(String[] args) {
		A a = new D();
		a.a();

		D d = new D();
		d.a();
		d.b();
		d.c();
		d.e();
	}

}
