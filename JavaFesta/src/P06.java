import java.util.Scanner;

//�Ž����� 

public class P06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ѱݾ� �Է� : ");
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

		System.out.println("�ܵ� : " + input + "��");
		System.out.println("10000�� : " + manwon + "��");
		System.out.println("5000�� : " + ochunwon + "��");
		System.out.println("1000�� : " + chunwon + "��");
		System.out.println("500�� : " + obeagwon + "��");
		System.out.println("100�� : " + beag + "��");

		sc.close();
	}

}
