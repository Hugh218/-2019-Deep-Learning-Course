import java.util.Scanner;

public class Method_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է� : ");
		int num1 = sc.nextInt();
		System.out.println("�� ��° ���� �Է� : ");
		int num2 = sc.nextInt();
		
		
		int result = getAbsoluteValue(num1,num2);
		System.out.println(getAbsoluteValue(num1, num2));
		System.out.println("��� Ȯ�� : " + result);
	}
	
	public static int getAbsoluteValue(int num1, int num2) {
		int result = num1 - num2;
		
		if(result<0) {
			result*=-1;
		}
		
		return result;
	}

}