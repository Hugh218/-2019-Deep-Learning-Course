package Coin;

import java.util.Scanner;

public class Coin_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Coin coin = new Coin();
		int click = 0;
		while (click != 4) {
			System.out.print("1.���� 2.���� 3.�ݾ�Ȯ�� 4.���� >>");
			click = sc.nextInt();

			switch (click) {
			case 4:
				System.out.println("�����մϴ�");
				break;
			case 1:
				System.out.print("������ �ݾ��� �Է��ϼ���.");
				int inputmoney = sc.nextInt();
				coin.deposit(inputmoney);
				break;
			case 2:
				System.out.print("������ �ݾ��� �Է��ϼ���.");
				//coin.money = 0;
				int outputmoney = sc.nextInt();
				if (coin.showMoney() > outputmoney) {
					coin.withdraw(outputmoney);
				} else {
					System.out.println("����� �Ұ����մϴ�.");
				}

				break;
			case 3:
				System.out.println(coin.showMoney());
				break;
			default:
				System.out.println("������ �� ���� ����Դϴ�.");
				break;
			}

		}

	}

}
