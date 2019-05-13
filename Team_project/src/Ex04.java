import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		while (true) {
			int com = random.nextInt(3) + 1;

			System.out.print("가위(1) 바위(2) 보(3) 중 하나를 선택하세요 >>");
			int user = sc.nextInt();

			switch (com) {
			case 1:
				if (com == user) {
					System.out.println("컴퓨터(가위), 유저(가위)");
					System.out.println("비겼습니다.");
				} else if (com < user) {
					if (user == 2) {
						System.out.println("컴퓨터(가위), 유저(바위)");
						System.out.println("승리했습니다.");
					} else {
						System.out.println("컴퓨터(가위), 유저(보)");
						System.out.println("패배했습니다.");
					}
				}
				break;
			case 2:
				if (com == user) {
					System.out.println("컴퓨터(바위), 유저(바위)");
					System.out.println("비겼습니다.");
				} else if (com < user) {
					System.out.println("컴퓨터(바위), 유저(보)");
					System.out.println("승리했습니다.");
				} else {
					System.out.println("컴퓨터(바위), 유저(가위)");
					System.out.println("패배했습니다.");
				}
				break;
			case 3:
				if (com == user) {
					System.out.println("컴퓨터(보), 유저(보)");
					System.out.println("비겼습니다.");
				} else if (com > user) {
					if (user == 1) {
						System.out.println("컴퓨터(보), 유저(가위)");
						System.out.println("승리했습니다.");
					} else {
						System.out.println("컴퓨터(보), 유저(바위)");
						System.out.println("패배했습니다.");
					}

				}
				break;

			}
		}

	}

}
