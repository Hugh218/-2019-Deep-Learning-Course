import java.util.Scanner;

public class P03_1 {

	public static void main(String[] args) {

		System.out.print("���μ����� �� ���� �Է��ϼ���. : ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int i = 2; // �μ��� �ּ�ġ
		System.out.printf("%d =", input);
		while (true) {
			if (input % i == 0) { // �������������� �μ��̴� �׶���
				input /= i; // ���� ���� ����
				System.out.print(i); // �μ��� ���
				if (input > 2) { // ���� �Է°��� �ּ� �μ� 2���� ũ�� * ���
					System.out.print("*");
				}
			} else {
				i++;// ���������� ������ �ش� ���� �μ��� �ƴ����� 1�� ����.
			}
			if (input == 1)
				break; // �Էµ� ���� 1�̸� �μ��� �������������� ����.
		}

		sc.close();

	}

}
