import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====�������忡 ���� �� ȯ���մϴ�!=====");
		System.out.println("���̸� �������ּ���");
		int input_age = sc.nextInt();
		System.out.println("�ο����� �������ּ���");
		int person = sc.nextInt();

		double discount = 0.5;
		int base_pay = 5000;
		
		int c_age = 19;
		int c_pay = (int) (base_pay * discount);
		
		int t_pay = 0;

		if (c_age > input_age) {
			t_pay = c_pay * person;
		} else {
			t_pay = base_pay * person;
		}

		System.out.printf("�� %d �Դϴ�", t_pay);

		sc.close();

	}

}
