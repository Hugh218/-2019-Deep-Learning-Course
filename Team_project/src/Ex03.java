import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작할 단을 입력하세요 >> ");
		int input = sc.nextInt();

		for (int i = input; i <= 19; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + i * j);
			}
			System.out.println();
		}

	}

}
