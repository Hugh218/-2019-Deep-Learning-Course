import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//두 수를 입력받아서 더한 결과를 출력.
		//입력도 배웠고, 덧셈도 배웠고, 출력도 배웠다.
		//but 입력한 숫자데이터 저장은... ?
		
		//변수 선언(저장공간 만드는 법 >> 숫자(정수)를 저장
		
		int num1,num2=0;
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		System.out.println(num1+num2);
	}

}
