import java.util.Scanner;

public class dia {

	public static void main(String[] args) {
		// 다이아몬드 출력 입력값의 1.5배값이 총 출력값.
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();

		// 중간라인까지 * 출력 (중간부까지 출력함)
		for (int j = 1; j <= line; j++) {
			for (int k = j; k <= line - 1; k++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= 2 * j - 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 중간 라인 이후부터 * 출력 (중간부는 출력하지않음)
		for (int j = 1; j <= line - 1; j++) {
			for (int k = 1; k <= j; k++) {
				System.out.print(" ");
			}
			for (int l = 1; l < 2 * (line - j); l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
