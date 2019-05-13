import java.util.Scanner;

class Ex03 {
	public static void main(String[] args) {
		/*
		 * for (int i=3;i<=100;i+=3) { System.out.println(i);
		 */

		for (int j = 1; j <= 100; j ++) {
			if (j%3==0 && j%5==0) {
				System.out.print(j+" ");
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = num; i <= num * 10; i += num) {
			System.out.print(i+" ");
		}
		sc.close();
	}
}
