import java.util.Scanner;

public class dia {

	public static void main(String[] args) {
		// ���̾Ƹ�� ��� �Է°��� 1.5�谪�� �� ��°�.
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();

		// �߰����α��� * ��� (�߰��α��� �����)
		for (int j = 1; j <= line; j++) {
			for (int k = j; k <= line - 1; k++) {
				System.out.print(" ");
			}
			for (int l = 1; l <= 2 * j - 1; l++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// �߰� ���� ���ĺ��� * ��� (�߰��δ� �����������)
		for (int j = 1; j <= line - 1; j++) {
			for (int k = 1; k <= j; k++) {
				System.out.print(" ");
			}
			for (int l = 1; l < 2 * (line - j); l++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
