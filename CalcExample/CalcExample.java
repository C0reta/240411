package CalcExample;

public class CalcExample {
	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		// Calculator calc = new GoodCalc(); mo also dekiru

		System.out.println(calc.add(3, 4));
		System.out.println(calc.subtract(3, 4));

		int[] ar = { 2, 3, 4 };

		System.out.println(calc.average(ar));
	}

}
