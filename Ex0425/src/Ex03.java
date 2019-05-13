import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
		int box = 5;
		
		System.out.print("필요한 상자의 수 : ");
		System.out.println((ball%box==0)? ball/box : ball/box+1);

	}

}
