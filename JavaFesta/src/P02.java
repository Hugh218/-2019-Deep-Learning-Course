
//collatz ���� 

import java.util.Scanner;

public class P02 {
	int number = 0;

	public static int CollatzNumber(int a) {
		int cnt = 0;

		while (true) {
			if (a == 1) {
				break;
			}

			if (a % 2 == 0) {
				// ¦��
				a = a / 2;
				cnt += 1;
			} else if (a % 2 == 1) {
				// Ȧ��
				a = a * 3 + 1;
				cnt += 1;
			}
		}

		return cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >> ");
		int input = sc.nextInt();

		int number = CollatzNumber(input);
		System.out.println(number);

		sc.close();
	}

}
