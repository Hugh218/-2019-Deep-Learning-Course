import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 :");
		int curWeight = sc.nextInt();
		int golWeight = 0;
		while (true) {
			System.out.print("목표 몸무게 :");
			golWeight = sc.nextInt();
			if (golWeight > curWeight) {
				System.out.println("다시 입력하세요");
			} else {
				break;
			}

		}

		int loss = 0;
		int weak = 0;

		while (true) {

			weak++;
			System.out.println(weak + "주차 감량 몸무게");
			loss = sc.nextInt();
			curWeight -= loss;

			if (curWeight <= golWeight) {
				System.out.println(curWeight + "kg 달성!! 축하합니다!");
				break;

			}

		}

	}

}
