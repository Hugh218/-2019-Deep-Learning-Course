import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int snr = 0;
		int adult = 0;
		int yth = 0;
		int child = 0;

		while (true) {
			System.out.print("���� �������� ���� �Է�(0 �Է½� ����) : ");
			int age = sc.nextInt();

			if (age >= 65) {
				snr += 1;
			} else if (age >= 20) {
				adult += 1;
			} else if (age >= 8) {
				yth += 1;
			} else if (age >= 1) {
				child += 1;
			} else {
				break;
			}
		}

		int sum = snr + adult + yth + child;
		System.out.println("--���� ���� --");
		System.out.println("�ʹ��� ��������");
		System.out.println("�� " + sum + "��: ����" + snr + "��, ���� " 
		+ adult + "��, û�ҳ� " + yth + "��, �Ƶ� " + child + "��");
		int aid=0;
		if (child >= 3) {
			aid = (child-2)*500000;
		} 
		
		System.out.println("���ڳ� �������� " + aid + "�� ���޵˴ϴ�.");

	}

}
