import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�뵿�ð��� �Է��ϼ��� : ");
		int play_time = sc.nextInt();

		int basic_time = 8;
		int basic_pay = 5000;
		double rate = 1.5;
		
		int over_time = play_time - basic_time;
		int over_pay = (int) (basic_pay * rate);

		int t_pay = 0;

		if (play_time > basic_time) {
			// �ʰ��ٹ���
			t_pay = basic_time * basic_pay + over_time * over_pay;
		} else {
			t_pay = play_time * basic_pay;
		}
		System.out.printf("�� �ӱ��� %d �Դϴ�", t_pay);

		/*
		 * int b_pay = 5000;
		 * 
		 * int o_time = time - 8; int o_pay = (int) (b_pay * o_time * 1.5);
		 * 
		 * int pay = 0; if (time <= 8) { pay = time * b_pay; } else { pay = 40000 +
		 * o_pay; }
		 */
//		System.out.println("�� �ӱ��� " + pay + "�Դϴ�");

		sc.close();
	}

}
