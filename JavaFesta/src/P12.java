import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		System.out.println("�ִ� ����� & �ּ� ����� ���ϱ�");
		Scanner sc = new Scanner(System.in);

		int var1;
		int var2;
		int LCM;
		int r = 1;

		System.out.print("����1�Է�>> ");
		var1 = sc.nextInt();
		System.out.print("����2�Է�>> ");
		var2 = sc.nextInt();

		int tmp1 = var1, tmp2 = var2;
		if (var1 < var2) {
			var1 = tmp2;
			var2 = tmp1;
		}

		while (r > 0) {
			r = var1 % var2;
			var1 = var2;
			var2 = r;
		}
		
		LCM = tmp1 * tmp2 / var1;
		System.out.println("�ִ����� : " + var1);
		System.out.println("�ּҰ���� : " + LCM);

		sc.close();
	}

}
