import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("입력 : ");
			int num = sc.nextInt();

			if (num >= 10) {
				System.out.println("10보다 큽니다.");
				break;
			}

		}

	}

}
