import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		int cs = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("�� �Է� >> ");
		int money = sc.nextInt();
		while (true) {
			System.out.println("1.�ݶ�(800) 2.����(500) 3.��Ÿ�ο���(1500) >> ");
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
				System.out.println("�ܾ� : " + money);
				System.out.println("����Ͻðڽ��ϱ�? (y/n) ");
				String choice = sc.next();
				if (choice.equals("y")) {
					if (money < 500) {
						break;
					}
				} else {
					break;
				}
			} else {

				System.out.println("���� �����մϴ�!");
			}

		}

	}

}
