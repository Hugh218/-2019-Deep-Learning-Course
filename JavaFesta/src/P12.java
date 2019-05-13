import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		System.out.println("최대 공약수 & 최소 공배수 구하기");
		Scanner sc = new Scanner(System.in);

		int var1;
		int var2;
		int LCM;
		int r = 1;

		System.out.print("숫자1입력>> ");
		var1 = sc.nextInt();
		System.out.print("숫자2입력>> ");
		var2 = sc.nextInt();

		int tmp1 = var1, tmp2 = var2;
		if (var1 < var2) {
			var1 = tmp2;
			var2 = tmp1;
		}

		while (r > 0) {
			r = var1 % var2;
			var1 = var2;
			var2 = r;
		}
		
		LCM = tmp1 * tmp2 / var1;
		System.out.println("최대공약수 : " + var1);
		System.out.println("최소공배수 : " + LCM);

		sc.close();
	}

}
