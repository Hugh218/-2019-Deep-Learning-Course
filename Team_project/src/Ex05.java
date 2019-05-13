import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int snr = 0;
		int adult = 0;
		int yth = 0;
		int child = 0;

		while (true) {
			System.out.print("가족 구성원의 나이 입력(0 입력시 종료) : ");
			int age = sc.nextInt();

			if (age >= 65) {
				snr += 1;
			} else if (age >= 20) {
				adult += 1;
			} else if (age >= 8) {
				yth += 1;
			} else if (age >= 1) {
				child += 1;
			} else {
				break;
			}
		}

		int sum = snr + adult + yth + child;
		System.out.println("--조사 종료 --");
		System.out.println("귀댁의 가족구성");
		System.out.println("총 " + sum + "명: 노인" + snr + "명, 성인 " 
		+ adult + "명, 청소년 " + yth + "명, 아동 " + child + "명");
		int aid=0;
		if (child >= 3) {
			aid = (child-2)*500000;
		} 
		
		System.out.println("다자녀 지원금이 " + aid + "원 지급됩니다.");

	}

}
