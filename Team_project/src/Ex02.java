import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >> ");
		int input =sc.nextInt();
		int fac=1;
		for (int i=1; i<=input; i++) {
			fac*=i;
		}
		
		System.out.println(fac);
		
	}

}

