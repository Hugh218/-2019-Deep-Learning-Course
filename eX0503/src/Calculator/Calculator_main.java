package Calculator;

public class Calculator_main {
	public static void main(String[] args) {
		int num1 = 75;
		int num2 = 7;

		Calculator cal = new Calculator(num1, num2);
//		cal.num1 = 20;
		System.out.println(cal.sum());
		System.out.println(cal.sub());
		System.out.println(cal.mul());
		System.out.println(cal.div());

	}
}
