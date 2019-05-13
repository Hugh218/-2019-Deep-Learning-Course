import java.util.Scanner;

public class P21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Çà °³¼ö : ");
		int line = sc.nextInt();

		for (int i = 0; i < line; i++) {
			for (int j = i; j < line; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

	
}


