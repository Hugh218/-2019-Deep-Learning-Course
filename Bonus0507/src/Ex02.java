import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		String[][] member = new String[5][2];
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		String id = "";
		String pw = "";
		while (true) {
			System.out.print("[1]�α��� [2]ȸ������ [3]���� >>");
			int input = sc.nextInt();
			if (input == 1) {
				System.out.println("=====�α���=====");
				System.out.print("ID �Է� : ");
				id = sc.next();
				System.out.print("PW �Է� : ");
				pw = sc.next();

				int loc = 0;
				for (int i = 0; i < cnt; i++) {
					if (member[i][0].equals(id) && member[i][1].equals(pw)) {
						loc++;
					}
				}
				if (loc == 1) {
					System.out.println("�α��� ����!!");
				} else {
					System.out.println("���̵� �� ��й�ȣ�� �ٽ� Ȯ�����ּ���.");
				}

			} else if (input == 2) {
				System.out.println("=====ȸ������=====");
				if (cnt < 5) {
					System.out.print("ID �Է� : ");
					id = sc.next();
					System.out.print("PW �Է� : ");
					pw = sc.next();
					member[cnt][0] = id;
					member[cnt][1] = pw;
					cnt++;
				} else {
					System.out.println("�� �̻� ����� �Ұ����մϴ�.");
				}

			} else if (input == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("��Ȯ�� ���ڸ� �ٽ� �Է����ּ���.");
			}
		}

	}

}
