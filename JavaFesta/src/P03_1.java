import java.util.Scanner;

public class P03_1 {

	public static void main(String[] args) {

		System.out.print("소인수분해 할 수를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i = 2; // 인수의 최소치
		System.out.printf("%d =", input);
		while (true) {
			if (input % i == 0) { // 나머지가없으면 인수이니 그때에
				input /= i; // 나눈 목값을 갱신
				System.out.print(i); // 인수를 출력
				if (input > 2) { // 남은 입력값이 최소 인수 2보다 크면 * 출력
					System.out.print("*");
				}
			} else {
				i++;// 나누어지지 않으면 해당 값이 인수가 아님으로 1씩 증가.
			}
			if (input == 1)
				break; // 입력된 값이 1이면 인수가 나오지않음으로 종료.
		}

		sc.close();

	}

}
