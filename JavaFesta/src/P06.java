import java.util.Scanner;

//거스름돈 

public class P06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int input = sc.nextInt();
		int manwon = 0;
		int ochunwon = 0;
		int chunwon = 0;
		int obeagwon = 0;
		int beag = 0;

		manwon = input / 10000;
		ochunwon = (input - manwon * 10000) / 5000;
		chunwon = (input - manwon * 10000 - ochunwon * 5000) / 1000;
		obeagwon = (input - manwon * 10000 - ochunwon * 5000 - chunwon * 1000) / 500;
		beag = (input - manwon * 10000 - ochunwon * 5000 - chunwon * 1000 - obeagwon * 500) / 100;

		System.out.println("잔돈 : " + input + "원");
		System.out.println("10000원 : " + manwon + "개");
		System.out.println("5000원 : " + ochunwon + "개");
		System.out.println("1000원 : " + chunwon + "개");
		System.out.println("500원 : " + obeagwon + "개");
		System.out.println("100원 : " + beag + "개");

		sc.close();
	}

}
