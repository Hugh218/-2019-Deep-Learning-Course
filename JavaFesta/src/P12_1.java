import java.util.Scanner;

public class P12_1 {

	public static void main(String[] args) {
		System.err.println("최대공약수 &최소공배수 구하기");
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1 입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("숫자2 입력 >> ");
		int num2 = sc.nextInt();

		int LCM;
		int NMG = 1;
		//무조건 num2를 작은수로 만들고 
		int temp1 = num1, temp2=num2;
		if(num1<num2) {
			num1 = temp2;
			num2 = temp1;
		}
		//NMG가 0보다 크기만하면 반복한다. >> 나머지가 0으로 떨어질떄까지 반복한다.
		// 작은값을 나머지로 계속 나눈다. 
		// num1을 최대공약수로 만드는방법.
		while(NMG>0) {
			NMG = num1%num2;
			num1=num2;
			num2=NMG;
		} 
		LCM = temp1 * temp2/num1;
		System.out.println("최대 공약수 : " + num1);
		System.out.println("최소 공배수 : " + LCM);
	}

}
