import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DB: ");
		int db = sc.nextInt();
		System.out.print("전자계산기 구조: ");
		int calc = sc.nextInt();
		System.out.print("OS: ");
		int os = sc.nextInt();
		System.out.print("데이터통신: ");
		int network = sc.nextInt();
		System.out.print("소프트웨어공학: ");
		int sw = sc.nextInt();

		int sum = db + calc + os + network + sw;
		/*
		 * if (db<8) { System.out.println("불합격입니다!"); } else if (calc<8) {
		 * System.out.println("불합격입니다!"); } else if (os<8) {
		 * System.out.println("불합격입니다!"); } else if (network<8) {
		 * System.out.println("불합격입니다!"); } else if (sw<8) {
		 * System.out.println("불합격입니다!"); } else if (sum >=60 ) {
		 * System.out.println("합격입니다!"); } else { System.out.println("탈락입니다!"); }
		 */

		/*
		 * if (sum >=60 && db>=8&&calc>=8&&os>=8&&network>=8&&sw>=8) {
		 * System.out.println("합격입니다!"); } else System.out.println("불합격입니다!");
		 */
		
		
		
		//  미적용 
		if (sum < 60 && db < 8 || calc < 8 || os < 8 || network < 8 || sw < 8) {
			System.out.println("불합격입니다!");
		} else
			System.out.println("합격입니다!");

	}

}
