import java.util.Scanner;

//�ӱ� ���
public class P15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ѽð��� �Է��ϼ��� : ");
		int hour = sc.nextInt();
		int h_pay = 5000;
		int b_time = 8;
		double over_time_rate = 1.5;
		int over_pay = (int) (h_pay * over_time_rate);
		int o_time = hour - b_time;

		if (hour <= 8) {
			System.out.println("�� �ӱ��� " + hour * h_pay + "�� �Դϴ�.");
		} else {
			System.out.println("�� �ӱ��� " + (b_time * h_pay + o_time * over_pay) + "�� �Դϴ�.");
		}
		sc.close();
	}

}
