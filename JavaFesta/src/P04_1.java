import java.util.Scanner;

//목표 몸무게 광요's solve 
public class P04_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;

		System.out.print("현재몸무게 : ");
		num1 = sc.nextInt();
		System.out.print("목표몸무게 : ");
		num2 = sc.nextInt();
		int i = 1;
		while (true) {
			System.out.printf("%d주차 감량 몸무게 : ", i);
			num1 -= sc.nextInt();
			i++;
			if (num1 <= num2) {
				System.out.printf("%dkg 달성!! 축하합니다!", num1);
				break;
			}
		}

		sc.close();

	}

}
