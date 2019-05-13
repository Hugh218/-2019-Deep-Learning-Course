package Coin;

import java.util.Scanner;

public class Coin_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coin coin = new Coin();
		int click = 0;
		while (click != 4) {
			System.out.print("1.저금 2.인출 3.금액확인 4.종료 >>");
			click = sc.nextInt();

			switch (click) {
			case 4:
				System.out.println("종료합니다");
				break;
			case 1:
				System.out.print("저금할 금액을 입력하세요.");
				int inputmoney = sc.nextInt();
				coin.deposit(inputmoney);
				break;
			case 2:
				System.out.print("인출할 금액을 입력하세요.");
				//coin.money = 0;
				int outputmoney = sc.nextInt();
				if (coin.showMoney() > outputmoney) {
					coin.withdraw(outputmoney);
				} else {
					System.out.println("출력이 불가능합니다.");
				}

				break;
			case 3:
				System.out.println(coin.showMoney());
				break;
			default:
				System.out.println("실행할 수 없는 명령입니다.");
				break;
			}

		}

	}

}
