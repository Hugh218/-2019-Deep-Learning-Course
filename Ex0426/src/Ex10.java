import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		String choice = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("�� �Է� >> ");
		int money = sc.nextInt();
		int price = 0;

		while (true) {

			System.out.print("1.�ݶ�(800) 2.����(500) 3.��Ÿ�ο���(1500) >> ");
			int drink = sc.nextInt();
			switch (drink) {
			case 1:
				price = 800;

				if (money < price) {

					System.out.println("���� �����մϴ�.");
					System.out.println("�ܾ�: " + money);
				} else {
					money = money - price;
					System.out.println("�ݶ� ���ɴϴ�");
					System.out.println("�ܾ�: " + money);
				}
				System.out.print("����Ͻðڽ��ϱ�? (y/n)");
				choice = sc.next();
				break;

			case 2:
				price = 500;

				if (money < price) {

					System.out.println("���� �����մϴ�.");
					System.out.println("�ܾ�: " + money);
					break;
				} else {
					money = money - price;
					System.out.println("������ ���ɴϴ�");
					System.out.println("�ܾ�: " + money);
					if (money < price) {
						break;

					}
				}

				System.out.print("����Ͻðڽ��ϱ�? (y/n)");
				choice = sc.next();
				break;

			case 3:
				price = 1500;

				if (money < price) {

					System.out.println("���� �����մϴ�.");
					System.out.println("�ܾ�: " + money);
				} else {
					money = money - price;
					System.out.println("��Ÿ�����ᰡ ���ɴϴ�");
					System.out.println("�ܾ�: " + money);
				}
				System.out.print("����Ͻðڽ��ϱ�? (y/n)");
				choice = sc.next();
				break;
			}

			if (money < 500 || choice.equals("n")) {
				System.out.println("�ܵ�: " + money);
				int chun = money / 1000;
				int five = (money - chun * 1000) / 500;
				int hund = (money - chun * 1000 - five * 500) / 100;
				System.out.println("õ�� : " + chun + "����� : " + five + "��� : " + hund);
				break;
			}

		}
	}

}
