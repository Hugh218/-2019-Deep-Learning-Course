import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		while (true) {
			int com = random.nextInt(3) + 1;

			System.out.print("����(1) ����(2) ��(3) �� �ϳ��� �����ϼ��� >>");
			int user = sc.nextInt();

			switch (com) {
			case 1:
				if (com == user) {
					System.out.println("��ǻ��(����), ����(����)");
					System.out.println("�����ϴ�.");
				} else if (com < user) {
					if (user == 2) {
						System.out.println("��ǻ��(����), ����(����)");
						System.out.println("�¸��߽��ϴ�.");
					} else {
						System.out.println("��ǻ��(����), ����(��)");
						System.out.println("�й��߽��ϴ�.");
					}
				}
				break;
			case 2:
				if (com == user) {
					System.out.println("��ǻ��(����), ����(����)");
					System.out.println("�����ϴ�.");
				} else if (com < user) {
					System.out.println("��ǻ��(����), ����(��)");
					System.out.println("�¸��߽��ϴ�.");
				} else {
					System.out.println("��ǻ��(����), ����(����)");
					System.out.println("�й��߽��ϴ�.");
				}
				break;
			case 3:
				if (com == user) {
					System.out.println("��ǻ��(��), ����(��)");
					System.out.println("�����ϴ�.");
				} else if (com > user) {
					if (user == 1) {
						System.out.println("��ǻ��(��), ����(����)");
						System.out.println("�¸��߽��ϴ�.");
					} else {
						System.out.println("��ǻ��(��), ����(����)");
						System.out.println("�й��߽��ϴ�.");
					}

				}
				break;

			}
		}

	}

}
