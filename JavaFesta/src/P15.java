import java.util.Scanner;

//임금 계산
public class P15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일한시간을 입력하세요 : ");
		int hour = sc.nextInt();
		int h_pay = 5000;
		int b_time = 8;
		double over_time_rate = 1.5;
		int over_pay = (int) (h_pay * over_time_rate);
		int o_time = hour - b_time;

		if (hour <= 8) {
			System.out.println("총 임금은 " + hour * h_pay + "원 입니다.");
		} else {
			System.out.println("총 임금은 " + (b_time * h_pay + o_time * over_pay) + "원 입니다.");
		}
		sc.close();
	}

}
