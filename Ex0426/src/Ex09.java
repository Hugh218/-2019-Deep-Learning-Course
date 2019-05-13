import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int cs = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("돈 입력 >> ");
		int money = sc.nextInt();
		while (true) {
			System.out.println("1.콜라(800) 2.생수(500) 3.비타민워터(1500) >> ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				cs = 800;
				money = money - cs;
				break;
			case 2:
				cs = 500;
				money = money - cs;
				break;
			case 3:
				cs = 1500;
				money = money - cs;
				break;
			default:
				break;

			}

			if (money > cs) {
				System.out.println("잔액 : " + money);
				System.out.println("계속하시겠습니까? (y/n) ");
				String choice = sc.next();
				if (choice.equals("y")) {
					if (money < 500) {
						break;
					}
				} else {
					break;
				}
			} else {

				System.out.println("돈이 부족합니다!");
			}

		}

	}

}
