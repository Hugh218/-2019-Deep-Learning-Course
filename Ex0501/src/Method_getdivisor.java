
public class Method_getdivisor {
	public static void main(String[] args) {

		int num1 = 9;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);

		System.out.println(divisor);

		getDivisor(10);
		getDivisor(16);
		getDivisor(24);

		int num = 10;
		int result = getSumOfDivisors(num);

		System.out.println(num + "의 약수의 합: " + result);

		getDivisor(num);

		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);

	}

	public static void getPerfectNumber(int startValue, int endValue) {

		for (int i = startValue; i <= endValue; i++) {
			int result = getSumOfDivisors(i) - i;
//			int sum = 0;
//			
//			for (int j = 1; j < i; j++) {
//				if (i % j == 0) {
//					sum += j;
//				}
//			}
			if (result == i) {
				System.out.print(i + " ");
			}

		}

	}

	public static boolean isDivisor(int num1, int num2) {

		return num1 % num2 == 0 ? true : false;
	}

	public static void getDivisor(int num1) {
		System.out.print(num1 + "의 약수 : ");
		int i = 0;
		while (true) {
			i++;
			if (num1 % i == 0) {
				System.out.print(i + " ");
			}
			if (num1 == i) {
				break;
			}
		}
		System.out.println();

	}

	public static int getSumOfDivisors(int i) {
		int sum = 0;

		for (int j = 1; j <= i; j++) {
			if (i % j == 0) {
				sum += j;
			}
		}

		return sum;
	}
}
