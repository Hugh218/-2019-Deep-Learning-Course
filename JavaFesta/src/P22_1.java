
import java.util.Scanner;

// n��°�ױ���  ��� ,1,2,4,7,11 ---- 
public class P22_1 {

	public static void main(String[] args) {

		int number = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("N �Է� : ");
		number = sc.nextInt();
		int count = 1;
		int j = 1;

		for (int i = 0; i < number; i++) {
			System.out.print(j + " ");
			j += count;
			count++;
		}

		sc.close();
	}

}
