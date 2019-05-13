import java.util.Scanner;

public class P01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result = num-num%100;
		
		System.out.println("결과확인 : "+ result);
	}

}
