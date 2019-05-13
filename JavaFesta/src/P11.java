//반올림

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();

		if (input % 10 >= 5) {
			input = input - input % 10 + 10;
		} else {
			input = input - input % 10;
		}

		System.out.print("반올림 수 : " + input);

		sc.close();
	}

}
