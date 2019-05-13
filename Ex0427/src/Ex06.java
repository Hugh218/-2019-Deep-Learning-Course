import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
			
				for (int j = 1; j < 10; j++) {
				System.out.print(num + "*" + j + "=" + num * j);
				System.out.print("\t");
			
		}
	}

}
