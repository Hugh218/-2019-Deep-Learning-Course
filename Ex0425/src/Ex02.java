import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.print("�� ���� �� : ");
		System.out.println((num1>=num2) ? num1 -num2 : num2 -num1);
		
	}

}