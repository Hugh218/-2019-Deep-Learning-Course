
//package ��Ʈ�ʽ���;

import java.util.Random;
import java.util.Scanner;

public class InfinityStone {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("���Ǵ�Ƽ ������ ã�� ������");

		while (true) {

			System.out.println("[1]�����̽����� [2]�Ŀ����� [3]���ε彺�� [4]Ÿ�ӽ��� [5]����Ƽ����  [6]����");

			int choice = new Scanner(System.in).nextInt();

			if (choice == 1) {
				// ���� ������ Index���� ���
				System.out.println("��Ű : �����̽������� ������ؼ���... �迭�� ������ Ȱ���� �� �˾ƾ��Ѵ�... ");
				System.out.println("��Ű : int[] array : {1,2,3,4,5} �迭�� ���� �Ŀ�... ������ ���� ����ϸ�");
				System.out.println("��Ű : �����̽� ������ ������ �� ���� ���̴�...");

				int[] array = { 1, 2, 3, 4, 5 };

				System.out.print("��� ->");
				System.out.println("int [] array = {" + array[4] + "," + array[3] + "," + array[2] + "," + array[1]
						+ "," + array[0] + "}");

			} else if (choice == 2) {
				// ���������� �迭 ���� �ְ�
				System.out.println("�γ� : �Ŀ������� ������ؼ���... ��ǻ�Ϳ��� ����ºο��� �̰ܾ� �Ѵ�... ");
				System.out.println("�γ� : ��ǻ�Ϳ��� ������������ �Ͽ� �̰ܶ�");
				System.out.println("�γ� : 3�� ���� �¸��Ѵٸ� �Ŀ� ������ ������ �� ���� ���̴�...");

				int cntCom = 0;
				int cntUser = 0;
				Random rd = new Random();
				String[] rsp = { "����", "����", "��" };
				int dap_count = 0;
				int com_count = 0;
				while (true) {
					System.out.print("����,����,�� �� �ϳ��� �Է��ض� : ");
					String dap = sc.next();

					char dp = dap.charAt(0);
					String com = rsp[rd.nextInt(3)];
					char co = com.charAt(0);

					if (dp == co) {
						System.out.println("���º�!");
					} else if ((dp == '��' && co == '��') || (dp == '��' && co == '��') || (dp == '��' && co == '��')) {
						com_count++;
						System.out.printf("���� %d��!\n",com_count);
						

					} else if ((co == '��' && dp == '��') || (co == '��' && dp == '��') || (co == '��' && dp == '��')) {
						dap_count++;
						System.out.printf("���� %d��!\n",dap_count);
						
					}

					if (dap_count == 3) {
						System.out.println("�Ŀ������� ���� �ڰ��� ����ϴ�");
						break;
					} else if (com_count == 3) {
						System.out.println("�ٽ� �����ض�");
						break;
					}
				}

			} else if (choice == 3) {
				// ���ٿ� ����
				System.out.println("ġŸ�츮 ���� : ���ε彺���� ������ؼ���... ��ǻ�Ͱ� �� ���ڸ� �˾ƾ��Ѵ�... ");
				System.out.println("ġŸ�츮 ���� : ��ǻ�Ͱ� �� ���ڸ� �����Ͽ� ��ǻ���� ���ڸ� ���߾��");
				System.out.println("ġŸ�츮 ���� : 5ȸ�ȿ� ���ڸ� ����ٸ� ���ε彺���� ���� �� ������...\n");
				int number = rand.nextInt(99) + 1;
				int input = 0;

				
				for (int life = 5; life > 0; life--) {
					System.out.print("���ڸ� �Է��ض�.. ũŪ(1~99) : ");
					input = sc.nextInt();
					if (life == 1) {
						System.out.println("���ε� ������ �������� ���ߴ�.");
						break;

					}

					if (input < number) {
						System.out.println("up");
						System.out.println("�����" + (life - 1) + "�� ���Ҵ�.");
					} else if (input > number) {
						System.out.println("down");
						System.out.println("�����" + (life - 1) + "�� ���Ҵ�.");
					} else {
						System.out.println("success!");
						break;
					}
				}

			} else if (choice == 4) {
				// �ú��� ���
				// �ʴ��� �ð� �Է½� ����Ϸ�
				System.out.println("���μ�Ʈ �� : Ÿ�ӽ����� ������ؼ���... �ð��� Ȱ���� �� �˾ƾ��Ѵ�... ");
				System.out.println("���μ�Ʈ �� : �ʴ����� �Է¹����� �ʸ� �ð��� �а� �ʷ� �ٲ��� �ȴٸ�");
				System.out.println("���μ�Ʈ �� : Ÿ�ӽ����� ������ �� ���� ���̴�...");

				System.out.print("�ʸ� �Է��ض� >>");
				int time = sc.nextInt();

				int hour = (time / 60) / 60;
				int minute = (time / 60) % 60;
				int second = time % 60;
				System.out.println(hour + "��" + minute + "��" + second + "��");

				System.out.println("�ð��� ���� �ڰ��� ����ϴ�... � �������� ��ũ�������� ���� �츱 ������...");

			} else if (choice == 5) {
				// �̵ �ﰢ��
				System.out.println("�ݷ��� : ����Ƽ������ ������ؼ���... ���� ���� ���� ��ŭ ���� �ﰢ���� ������ �Ѵ�.. ");
				System.out.println("�ݷ��� : ���� ���ڸ� ���� ��(1 ~ 10) �� ���ڸ�ŭ �� �ﰢ���� ����ٸ�...");
				System.out.println("�ݷ��� : ����Ƽ������ ������ �� ���� ���̴�...");
				System.out.println("�ݷ��� : �ݺ����� �� �� ����Ѵٸ� ���ѷ����� �������� �𸥴ٱ�!");

				int line = rand.nextInt(10) + 1;
				System.out.println("�ݷ��Ͱ� ���� ���� >> " + line);
				int i, j, k;

				for (i = 1; i <= line; i++) {
					for (k = i; k < line; k++) {
						System.out.print(" ");
					}
					for (j = 0; j < 2 * i - 1; j++) {
						System.out.print("*");
					}
					System.out.println();
				}

				System.out.println("¦¦¦! �Ϻ��ϱ�");

			} else if (choice == 6) {
				System.out.println("��� ���� ������� ���� ����...");
				break;
			} else {
				System.out.println("��Ʈ�� : ��Ȯ�� ���ڸ� �Է����� �ʴ´ٸ� ���ڿ����� �������� ����...!");

			}

		}

	}

}