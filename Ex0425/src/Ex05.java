import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("DB: ");
		int db = sc.nextInt();
		System.out.print("���ڰ��� ����: ");
		int calc = sc.nextInt();
		System.out.print("OS: ");
		int os = sc.nextInt();
		System.out.print("���������: ");
		int network = sc.nextInt();
		System.out.print("����Ʈ�������: ");
		int sw = sc.nextInt();

		int sum = db + calc + os + network + sw;
		/*
		 * if (db<8) { System.out.println("���հ��Դϴ�!"); } else if (calc<8) {
		 * System.out.println("���հ��Դϴ�!"); } else if (os<8) {
		 * System.out.println("���հ��Դϴ�!"); } else if (network<8) {
		 * System.out.println("���հ��Դϴ�!"); } else if (sw<8) {
		 * System.out.println("���հ��Դϴ�!"); } else if (sum >=60 ) {
		 * System.out.println("�հ��Դϴ�!"); } else { System.out.println("Ż���Դϴ�!"); }
		 */

		/*
		 * if (sum >=60 && db>=8&&calc>=8&&os>=8&&network>=8&&sw>=8) {
		 * System.out.println("�հ��Դϴ�!"); } else System.out.println("���հ��Դϴ�!");
		 */
		
		
		
		//  ������ 
		if (sum < 60 && db < 8 || calc < 8 || os < 8 || network < 8 || sw < 8) {
			System.out.println("���հ��Դϴ�!");
		} else
			System.out.println("�հ��Դϴ�!");

	}

}
