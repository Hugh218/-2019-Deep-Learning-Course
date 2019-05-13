import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====에버랜드에 오신 걸 환영합니다!=====");
		System.out.println("나이를 말씀해주세요");
		int input_age = sc.nextInt();
		System.out.println("인원수를 말씀해주세요");
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

		System.out.printf("총 %d 입니다", t_pay);

		sc.close();

	}

}
