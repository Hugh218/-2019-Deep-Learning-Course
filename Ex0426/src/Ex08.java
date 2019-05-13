import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		int kind = 0;
		int jan_aeg = 0;
		int cola = 800;
		int water = 500;
		int bita = 1500;
		String choice = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("돈 입력 >> ");
		int money = sc.nextInt();

		while (true) {
			System.out.println("1.콜라(800) 2.생수(500) 3.비타민워터(1500) >> ");
			kind = sc.nextInt();

			switch (kind) {
			case 1:
				if (money < cola) {
					System.out.println("잔액이 부족합니다");
					break;
				}
				System.out.println("콜라가 나옵니다.");
				money = money - cola;

				break;
			case 2:
				if (money < water) {
					System.out.println("잔액이 부족합니다");
					break;
				}
				System.out.println("생수가 나옵니다.");
				money = money - water;

				break;
			case 3:
				if (money < bita) {
					System.out.println("잔액이 부족합니다");
					break;
				}
				System.out.println("비타민음료가 나옵니다.");
				money = money - bita;

				break;
			}

		}

	}
}

/*
 * } System.out.println("계속하시겠습니까?"); choice = sc.next(); if(choice.equals("n"))
 * { break; }
 * 
 * 
 * }
 */
//		 else {
//			
//			
//			
//			System.out.println("계속하시겠습니까?");
//			
//			
//		}

//
//
//
//
//
//
//
//
//int chun = 0;
//int five = 0;
//int hund = 0;
//
//if ( jan_aeg < kind) {
//	System.out.println("돈이 부족해요");
//}
////잔액이 음료 가격보다 적으면 끝냄
//jan_aeg = money;
//while (jan_aeg < water) {
//	break;
//}
//
//
//}
//
////종료시 잔액을 천,오백,백 구분 출력
//chun = jan_aeg/1000;
//five = (jan_aeg - chun*1000)/500;
//hund = (jan_aeg-chun*1000-five*500)/100;
//
