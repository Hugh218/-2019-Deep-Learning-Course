import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� ������? >> ");
		int orange = sc.nextInt();
		int number = 52;
		
		int box = orange/number;
		
		System.out.println("��𾾰� �� �ڽ��� �� �� �ִ� �ڽ��� ���� ? "+box);
	}

}
