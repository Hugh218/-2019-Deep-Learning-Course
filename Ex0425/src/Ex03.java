import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�󱸰��� ������ �Է��ϼ��� : ");
		int ball = sc.nextInt();
		int box = 5;
		
		System.out.print("�ʿ��� ������ �� : ");
		System.out.println((ball%box==0)? ball/box : ball/box+1);

	}

}
