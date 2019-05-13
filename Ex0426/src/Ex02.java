import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int perf = sc.nextInt();
		int bonus = 0;

		if (perf <= 99) {
			bonus = 0;
		} else if (perf <= 199) {
			bonus = 20;
		} else if (perf <= 299) {
			bonus = 20 + 30;
		} else {
			bonus = 20 + 30 + 50;
		}
		System.out.println(perf + bonus + "¸¸¿ø");
		sc.close();
	}

}
