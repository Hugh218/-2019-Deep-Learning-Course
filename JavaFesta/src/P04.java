import java.util.Scanner;

// 몸무게 관리
public class P04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 :");
		int cur = sc.nextInt();
		System.out.print("목표몸무게 :");
		int goal = sc.nextInt();
		int cnt=0;
		
		while(true) {
			cnt++;
			System.out.print(cnt+"주차 감량 몸무게 : ");
			cur -= sc.nextInt();
			if(cur <=goal ) {
				System.out.println(cur+"kg 달성!! 축하합니다!");
				break;
			}
		}
		sc.close();
		
	}

}
