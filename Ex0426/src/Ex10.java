import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		String choice = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("돈 입력 >> ");
		int money = sc.nextInt();
		int price = 0;

		while (true) {

			System.out.print("1.콜라(800) 2.생수(500) 3.비타민워터(1500) >> ");
			int drink = sc.nextInt();
			switch (drink) {
			case 1:
				price = 800;

				if (money < price) {

					System.out.println("돈이 부족합니다.");
					System.out.println("잔액: " + money);
				} else {
					money = money - price;
					System.out.println("콜라가 나옵니다");
					System.out.println("잔액: " + money);
				}
				System.out.print("계속하시겠습니까? (y/n)");
				choice = sc.next();
				break;

			case 2:
				price = 500;

				if (money < price) {

					System.out.println("돈이 부족합니다.");
					System.out.println("잔액: " + money);
					break;
				} else {
					money = money - price;
					System.out.println("생수가 나옵니다");
					System.out.println("잔액: " + money);
					if (money < price) {
						break;

					}
				}

				System.out.print("계속하시겠습니까? (y/n)");
				choice = sc.next();
				break;

			case 3:
				price = 1500;

				if (money < price) {

					System.out.println("돈이 부족합니다.");
					System.out.println("잔액: " + money);
				} else {
					money = money - price;
					System.out.println("비타민음료가 나옵니다");
					System.out.println("잔액: " + money);
				}
				System.out.print("계속하시겠습니까? (y/n)");
				choice = sc.next();
				break;
			}

			if (money < 500 || choice.equals("n")) {
				System.out.println("잔돈: " + money);
				int chun = money / 1000;
				int five = (money - chun * 1000) / 500;
				int hund = (money - chun * 1000 - five * 500) / 100;
				System.out.println("천원 : " + chun + "오백원 : " + five + "백원 : " + hund);
				break;
			}

		}
	}

}
