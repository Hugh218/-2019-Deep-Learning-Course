import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while (true) {
			System.out.println("���ڸ� �Է��ϼ���");
			num = sc.nextInt();
			
			sum += num;
			if (sum >= 50) {
				System.out.println(sum);
				System.out.println("������ �Ϸ�Ǿ����ϴ�");
				break;
			}
		}

	}

}
