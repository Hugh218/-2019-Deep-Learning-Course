import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >>");
		int input = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= input; i++) {
			if(i%2==0) {
				sum += i;
			}
			
		}
		
		System.out.println(sum);
	}

}
