import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사려는 상품 갯수를 입력하세요 ");
		int goods = sc.nextInt();
		
		int gift_pay = 10000;
		double rate = 0.1;
		int sw =10;
		int t_pay = 0;
		
		if (goods > sw ) {
			t_pay = (int)(goods*gift_pay*(1-rate));
		} else {
			t_pay = goods*gift_pay;
		}
		
		System.out.printf("가격은 %d 입니다",t_pay);

		sc.close();
	}

}
