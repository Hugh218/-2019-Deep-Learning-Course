import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int Age = sc.nextInt();

		if (Age >= 20) {
			System.out.println("�����Դϴ�.");
			System.out.println("�м�");
		} 
		if (Age < 20){
			System.out.println("�̼������Դϴ�.");
		}
		
		System.out.println("�����");

	}

}
