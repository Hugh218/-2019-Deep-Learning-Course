import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//�� ���� �Է� �޾� ���� ����� ���
		//�������, �������, ������ ����� �߰�
		int num1, num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("1��° ���� �Է� >> ");
		num1 = sc.nextInt();
		System.out.println("2��° ���� �Է� >> ");
		num2 = sc.nextInt();
		
		int res_add = num1 + num2 ;
		int res_sub = num1 - num2;
		int res_mul = num1 * num2;
		float res_div = (float)num1/num2;
		
		System.out.println("���� ��� >> " + res_add);
		System.out.println("���� ��� >> " + res_sub);
		System.out.println("������ ��� >> " + res_mul);
		System.out.println("���� ��� >> " + res_div);
		
	}

}
