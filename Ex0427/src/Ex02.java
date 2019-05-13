import java.util.Random;
import java.util.Scanner;

class Ex02 {

	public static void main(String[] args) {
		int ran1, ran2, ran3;
		int input1, input2, input3 = 0;

		int strike = 0;
		int ball = 0;

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		while (true) {
			ran1 = random.nextInt(20) + 1;
			ran2 = random.nextInt(20) + 1;
			ran3 = random.nextInt(20) + 1;
			if ((ran1 != ran2) && (ran1 != ran3) && (ran2 != ran3)) {

				System.out.print(ran1 + "\t");
				System.out.print(ran2 + "\t");
				System.out.println(ran3 + "\t");

				break;
			}
		}

		while (strike < 3) {
			strike = 0;
			ball = 0;
			System.out.print("첫번째 숫자 입력 >> ");
			input1 = sc.nextInt();
			System.out.print("두번째 숫자 입력 >> ");
			input2 = sc.nextInt();
			System.out.print("세번째 숫자 입력 >> ");
			input3 = sc.nextInt();

			if (ran1 == input1) {
				strike += 1;
			} else if ((ran1 == input2) || (ran1 == input3)) {
				ball += 1;
			}
			if (ran2 == input2) {
				strike += 1;
			} else if ((ran2 == input1) || (ran2 == input3)) {
				ball += 1;
			}
			if (ran3 == input3) {
				strike += 1;
			} else if ((ran3 == input1) || (ran3 == input2)) {
				ball += 1;
			}
		
			if (strike == 0 && ball == 0)
				System.out.println("OUT!");
			else
				System.out.println(strike + " S " + ball + " B ");

		}
		sc.close();
	}
}
