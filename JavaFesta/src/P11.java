//�ݿø�

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();

		if (input % 10 >= 5) {
			input = input - input % 10 + 10;
		} else {
			input = input - input % 10;
		}

		System.out.print("�ݿø� �� : " + input);

		sc.close();
	}

}
