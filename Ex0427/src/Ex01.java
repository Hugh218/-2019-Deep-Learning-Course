import java.util.Scanner;

class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] menu = { "콜라", "생수", "비타민워터" };
		int[] menuPrice = { 800, 500, 1500 };

		System.out.print("돈입력 >>");
		int coin = sc.nextInt();
		int choice = 0; // 선택한 음료의 번호
		int price = 0; // 선택한 음료의 가격
		String title = ""; // 선택한 음료의 이름
		String yn = "";

		while (true) {
			System.out.println("1.콜라(800) 2.생수(500) 3.비타민워터(1500) >> ");
			choice = sc.nextInt(); // 메뉴선택

			price = menuPrice[choice - 1];
			title = menu[choice - 1];

			if (coin >= price) {
				System.out.println(title + "이 나옵니다.");
				coin -= price;
			} else {
				System.out.println("돈이 없습니다..");
			}
			System.out.println("잔액 : " + coin + "원");

			if (coin < menuPrice[1]) {
				break;
			} else {
				System.out.println("계속하시겠습니까?");
				yn = sc.next();

				if (yn.equals("n")) {
					break;
				}
			}

		}

	}

}
