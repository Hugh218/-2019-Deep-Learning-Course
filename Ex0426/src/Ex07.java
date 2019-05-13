import java.util.Random;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(20) + 1;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("number : ");
			int number = sc.nextInt();

			if (num > number) {
				System.out.println("up");
			} else if (num < number) {
				System.out.println("down");
			} else {
				System.out.println("success!");
				break;
			}
		}
	}

}
