import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int Age = sc.nextInt();

		if (Age >= 20) {
			System.out.println("성인입니다.");
			System.out.println("패수");
		} 
		if (Age < 20){
			System.out.println("미성년자입니다.");
		}
		
		System.out.println("종료됨");

	}

}
